package com.susevlievo.library.domain;

public enum Section {
    BULGARIAN_LITERATURE("Бългаска литература");

    String name;

    Section(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
