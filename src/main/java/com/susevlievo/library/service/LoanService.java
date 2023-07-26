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

    List<Loan> getAllLoans(){
       return loanRepository.findAll();
    }

    Loan getLoanById(long id){
        if(!loanRepository.findById(id).isPresent()){
            throw new ObjectDoesNotExistException("Loan with id"+ id + "does not exist");
        }
        return loanRepository.findById(id).get();
    }

    Loan addLoan(Loan loan){
        return loanRepository.save(loan);
    }

    void deleteLoanById(long id){
        loanRepository.deleteById(id);
    }

    void returnLoan(long id){
        loanRepository.updateReturnedById(true, id);
    }
}
