package com.susevlievo.library.domain;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;



@Entity
@AllArgsConstructor


public class Reader {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String firstName;

    String middleName;

    String lastName;

    String klass;

    public Reader(String firstName, String middleName, String lastName, String klass) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.klass = klass;
    }

    public Reader() {

    }
}
