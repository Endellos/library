package com.susevlievo.library.presentation.controllers.api.dtos;

import com.susevlievo.library.domain.Section;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Getter
@Setter
public class BookDto {


   private String title;
    private String author;


    private  int  dateAdded;


    private LocalDate  datePublished;

    private double price;

    private String signature;


    private Section section;

    private String donatedBy;

    private String description;

    public BookDto(String title, String author, int dateAdded, LocalDate datePublished, double price, String signature, Section section, String donatedBy, String description) {
        this.title = title;
        this.author = author;
        this.dateAdded = dateAdded;
        this.datePublished = datePublished;
        this.price = price;
        this.signature = signature;
        this.section = section;
        this.donatedBy = donatedBy;
        this.description = description;
    }


}
