package com.susevlievo.library.presentation.controllers.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.time.Period;

@Controller
@RequestMapping
public class MvcLoanController {

    @GetMapping("/borrow")
    String showBorrow(Model model){
        model.addAttribute("oneMonth", LocalDate.now().plus(Period.ofMonths(1)));
        return "borrow";
    }
}
