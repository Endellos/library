package com.susevlievo.library.domain;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


import java.time.LocalDate;
@Entity
@Getter
@Setter

public class Loan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;

    @ManyToOne
    @JoinColumn(name = "book_id")
    Book book;
    @ManyToOne
    @JoinColumn(name = "reader_id")
    Reader reader;
    LocalDate loanDate;
    LocalDate dueDate;
    boolean returned;

    public Loan(Book book, Reader reader, LocalDate loanDate, LocalDate dueDate, boolean returned) {
        this.book = book;
        this.reader = reader;
        this.loanDate = loanDate;
        this.dueDate = dueDate;
        this.returned = returned;
    }

    public Loan() {

    }
}
