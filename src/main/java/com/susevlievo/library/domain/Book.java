package com.susevlievo.library.domain;

;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


import java.time.LocalDate;

@Entity
@AllArgsConstructor
@Getter
@Setter
public class Book {
    @Id
    long id;
    String title;
    String author;

    LocalDate dateAdded;

    LocalDate datePublished;

    double price;

    String signature;

    @Enumerated
    Section section;

    String donatedBy;

    String description;

    public Book() {

    }
}
