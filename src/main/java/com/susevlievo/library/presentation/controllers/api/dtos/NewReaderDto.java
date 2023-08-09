package com.susevlievo.library.presentation.controllers.api.dtos;

public class NewReaderDto {
    String firstName;

    String middleName;

    String lastName;

    String klass;

    public NewReaderDto(String firstName, String middleName, String lastName, String klass) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.klass = klass;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getKlass() {
        return klass;
    }

    public void setKlass(String klass) {
        this.klass = klass;
    }
}
