package com.susevlievo.library.presentation.controllers.api.dtos;

import com.susevlievo.library.domain.Book;
import com.susevlievo.library.domain.Reader;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;


public class LoanDto {
    long id;
    Book book;

    Reader reader;
    LocalDate loanDate;
    LocalDate dueDate;
    boolean returned;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }

    public LocalDate getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(LocalDate loanDate) {
        this.loanDate = loanDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public boolean isReturned() {
        return returned;
    }

    public void setReturned(boolean returned) {
        this.returned = returned;
    }

    public LoanDto( Book book, Reader reader, LocalDate loanDate, LocalDate dueDate, boolean returned) {

        this.book = book;
        this.reader = reader;
        this.loanDate = loanDate;
        this.dueDate = dueDate;
        this.returned = returned;
    }

    public LoanDto(long id, Book book, Reader reader) {
        this.id = id;
        this.book = book;
        this.reader = reader;
    }
}
