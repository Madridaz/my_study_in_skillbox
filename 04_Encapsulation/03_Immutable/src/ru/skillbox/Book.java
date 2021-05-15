package ru.skillbox;

public class Book {
    private final String title;
    private final String author;
    private final int pages;
    private final int numberISBN;

    public Book(String title, String author, int pages, int numberISBN) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.numberISBN = numberISBN;
    }
}
