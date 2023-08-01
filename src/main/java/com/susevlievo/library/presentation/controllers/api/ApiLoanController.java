package com.susevlievo.library.presentation.controllers.api;

import com.susevlievo.library.domain.Loan;
import com.susevlievo.library.exeptions.ObjectDoesNotExistException;
import com.susevlievo.library.presentation.controllers.api.dtos.LoanDto;
import com.susevlievo.library.presentation.controllers.api.dtos.NewLoanDto;
import com.susevlievo.library.service.BookService;
import com.susevlievo.library.service.LoanService;
import com.susevlievo.library.service.ReaderService;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@RequestMapping("/api/loans")
public class ApiLoanController {

    LoanService loanService;
    BookService bookService;
    ReaderService readerService;

    public ApiLoanController(LoanService loanService, BookService bookService, ReaderService readerService) {
        this.loanService = loanService;
        this.bookService = bookService;
        this.readerService = readerService;
    }

    @PostMapping
    public ResponseEntity<LoanDto> createLoan(@RequestBody NewLoanDto newLoanDto){

        if (loanService.doesBookHaveActiveLoan(newLoanDto.getBookId())){
            return new ResponseEntity<>(HttpStatus.CONFLICT);
        }

       Loan addedLoan = loanService.addLoan(new Loan(bookService.getBookById(newLoanDto.getBookId()),
                readerService.getReaderById(newLoanDto.getReaderId()), LocalDate.now(), newLoanDto.getDueDate(), false));
        return new ResponseEntity<>(new LoanDto(addedLoan.getBook(),addedLoan.getReader(),addedLoan.getLoanDate(),addedLoan.getDueDate(),addedLoan.isReturned()), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<LoanDto> getActiveLoanByBookId(@RequestParam long bookId){
        try {
            Loan loan = loanService.getActiveLoanByBookId(bookId);
            return new ResponseEntity<>(new LoanDto(loan.getId(),loan.getBook(),loan.getReader()), HttpStatus.OK);
        }
       catch (ObjectDoesNotExistException e){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
       }


    }


    @PatchMapping("/{id}")
    public ResponseEntity<Void> returnLoan(@PathVariable long id){
       loanService.returnLoan(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
