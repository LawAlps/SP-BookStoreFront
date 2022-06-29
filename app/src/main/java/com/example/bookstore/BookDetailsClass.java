package com.example.bookstore;

import java.io.Serializable;

public class  BookDetailsClass implements Serializable {
    private static final long serialVersionUID = 1L;
    private String bookTitle, bookSynopsis, bookAuthor, bookPublisher;

    public BookDetailsClass (String bookTitle, String bookSynopsis, String bookAuthor, String bookPublisher) {
        this.bookTitle = bookTitle;
        this.bookSynopsis = bookSynopsis;
        this.bookAuthor = bookAuthor;
        this.bookPublisher = bookPublisher;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getBookSynopsis() {
        return bookSynopsis;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public String getBookPublisher() {
        return bookPublisher;
    }
}


