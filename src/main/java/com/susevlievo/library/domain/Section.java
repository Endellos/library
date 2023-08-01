package com.susevlievo.library.domain;

public enum Section {
    BULGARIAN_LITERATURE("Бългаска литература"),
    ENGLISH_LANGUAGE("Английски език"),

    BIOLOGY("Биология"),

    BOTANY("Ботаника"),
    GEOGRAPHY("География"),
    CHILDREN_LITERATURE("Детска художествена литература"),

    OTHER_LANGUAGES("Други езици "),
    LINGUISTICS("Езикознание"),
    ENCYCLOPEDIAS("Енциклопедии"),
    ART("Изкуство "),
    HISTORY("История"),
    FILM("Кино и режисура"),
    LOCAL_HISTORY("Краезнание"),
    MATHEMATICS("Математика"),
    MEDICINE("Медицина и здраве"),
    GERMAN_LANGUAGE("Немски език"),
    PEDAGOGY("Педагогика и възпитание"),
    PSYCHOLOGY("Психология и логика"),
    DICTIONARIES("Речници и справочници"),
    RUSSIAN_LANGUAGE("Руски език"),
    RUSSIAN_LITERATURE("Руска художествена литература"),
    SPORT("Спорт и здраве"),
    THEATER("Театър"),
    TECHNOLOGY("Техника и технологии"),
    FOREIGN_LITERATURE("Чужда художествена литература"),
    TEXTBOOKS("Учебници"),
    PHYSICS("Физика"),
    PHILOSOPHY("Философия"),
    CHEMISTRY("Химия");

    String name;

    Section(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
