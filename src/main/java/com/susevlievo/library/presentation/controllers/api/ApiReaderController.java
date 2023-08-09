package com.susevlievo.library.presentation.controllers.api;

import com.susevlievo.library.domain.Reader;
import com.susevlievo.library.presentation.controllers.api.dtos.NewReaderDto;
import com.susevlievo.library.presentation.controllers.api.dtos.ReaderDto;
import com.susevlievo.library.service.ReaderService;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/readers")
public class ApiReaderController {
    ReaderService readerService;
    ModelMapper modelMapper;

    public ApiReaderController(ReaderService readerService, ModelMapper modelMapper) {
        this.readerService = readerService;
        this.modelMapper = modelMapper;
    }

    @GetMapping("/all")
    ResponseEntity<List<ReaderDto>> getAllReaders(){
        List<ReaderDto> readersDtos = readerService.getAllReaders().stream() .map(reader -> modelMapper.map(reader, ReaderDto.class))
                 .collect(Collectors.toList());
        return new ResponseEntity(readersDtos,HttpStatus.OK);
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

    @PostMapping("/add")
    ResponseEntity<ReaderDto> addReader(@RequestBody NewReaderDto newReader){
        Reader reader = new Reader(newReader.getFirstName().toUpperCase(),newReader.getMiddleName().toUpperCase() ,newReader.getLastName().toUpperCase(),newReader.getKlass());
        readerService.addReader(reader);
        return new ResponseEntity<>(new ReaderDto(reader.getFirstName(),  reader.getMiddleName(), reader.getLastName(),reader.getKlass()), HttpStatus.CREATED);
    }
}
