package com.susevlievo.library.service;

import com.susevlievo.library.domain.Loan;
import com.susevlievo.library.exeptions.ObjectDoesNotExistException;
import com.susevlievo.library.repository.LoanRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoanService {

    LoanRepository loanRepository;

    public LoanService(LoanRepository loanRepository) {
        this.loanRepository = loanRepository;
    }

    public List<Loan> getAllLoans(){
       return loanRepository.findAll();
    }

    public Loan getLoanById(long id){
        if(!loanRepository.findById(id).isPresent()){
            throw new ObjectDoesNotExistException("Loan with id"+ id + "does not exist");
        }
        return loanRepository.findById(id).get();
    }

    public Loan addLoan(Loan loan){
        return loanRepository.save(loan);
    }

    public   void deleteLoanById(long id){
        loanRepository.deleteById(id);
    }

    public   void returnLoan(long id){
        loanRepository.updateReturnedById(true, id);
    }

    public Loan getActiveLoanByBookId(long bookId){

    if(!loanRepository.findByBook_IdAndReturnedFalse(bookId).isPresent()){
        throw new ObjectDoesNotExistException("No active loan on this book");
    }

     return    loanRepository.findByBook_IdAndReturnedFalse(bookId).get();
    }

    //true=book is not available
    public boolean doesBookHaveActiveLoan(long bookId){
        return loanRepository.existsByBook_IdAndReturnedFalse(bookId);
    }


    public List<Loan> getAllLoansByReaderId(long id){
        return loanRepository.findByReader_Id(id);
    }

}
