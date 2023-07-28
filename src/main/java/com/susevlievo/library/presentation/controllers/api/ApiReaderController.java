package com.susevlievo.library.presentation.controllers.api;

import com.susevlievo.library.domain.Reader;
import com.susevlievo.library.presentation.controllers.api.dtos.ReaderDto;
import com.susevlievo.library.service.ReaderService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/readers")
public class ApiReaderController {
    ReaderService readerService;

    public ApiReaderController(ReaderService readerService) {
        this.readerService = readerService;
    }

    @GetMapping
    ResponseEntity<List<ReaderDto>> getReadersByFullNameContaining(@RequestParam("name") String name){
       var readerList = readerService.findReadersByFullName(name);
//       if (readerList.isEmpty()){
//           return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//       }
        return new ResponseEntity<>(
                readerList.stream().map(reader -> new ReaderDto(reader.getId(), reader.getFirstName(),
                        reader.getMiddleName(), reader.getLastName(), reader.getKlass()
                )).toList(),
                HttpStatus.OK
        );
    }
}
