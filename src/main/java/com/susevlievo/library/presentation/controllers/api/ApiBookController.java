package com.susevlievo.library.presentation.controllers.api;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.susevlievo.library.domain.Book;
import com.susevlievo.library.exeptions.ObjectDoesNotExistException;
import com.susevlievo.library.presentation.controllers.api.dtos.BookDto;
import com.susevlievo.library.service.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/books")
public class ApiBookController {

    private final ObjectMapper objectMapper;
    BookService bookService;


    public ApiBookController(BookService bookService,ObjectMapper objectMapper) {
        this.bookService = bookService;
        this.objectMapper = objectMapper;
    }

    @GetMapping()
    ResponseEntity<String> getBookTitleById(@RequestParam("id") long id){
        try {

            String title =bookService.getBookById(id).getTitle();

            // Create a JSON object with the title
            String jsonTitle = objectMapper.writeValueAsString(Map.of("title", title));

            return new ResponseEntity<>(jsonTitle, HttpStatus.OK);
        } catch (ObjectDoesNotExistException e) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (JsonProcessingException e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

}
}
