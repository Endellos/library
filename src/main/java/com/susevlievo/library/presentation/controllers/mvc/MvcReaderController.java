package com.susevlievo.library.presentation.controllers.mvc;

import com.susevlievo.library.service.LoanService;
import com.susevlievo.library.service.ReaderService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/readers")
public class MvcReaderController {

    ReaderService readerService;
    LoanService loanService;

    public MvcReaderController(ReaderService readerService, LoanService loanService) {
        this.readerService = readerService;
        this.loanService = loanService;
    }

    @GetMapping("/add")
    String showAddReader() {
        return "addReader";
    }

    @GetMapping
    String showAllReaders(){
        return "allReaders";
    }

    @GetMapping("/{id}")
    String showOneReaders(@PathVariable long id){

        return "oneReader";
    }
}
