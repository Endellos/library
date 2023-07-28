package com.susevlievo.library.presentation.controllers.api.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

public class NewLoanDto {
    long bookId;
    long readerId;

    LocalDate dueDate;

    public NewLoanDto(long bookId, long readerId, LocalDate dueDate) {
        this.bookId = bookId;
        this.readerId = readerId;
        this.dueDate = dueDate;
    }

    public long getBookId() {
        return bookId;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }

    public long getReaderId() {
        return readerId;
    }

    public void setReaderId(long readerId) {
        this.readerId = readerId;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }
}
