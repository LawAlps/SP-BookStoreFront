package com.example.bookstore;

public class BookList extends BookDetailsClass {

    int digit;
    String categoryImage;
    String bookImage;

    public BookList(int digit, String categoryImage, String bookImage, String bookTitle, String bookSynopsis, String bookAuthor, String bookPublisher) {
        super(bookTitle, bookSynopsis, bookAuthor, bookPublisher);
        this.digit = digit;
        this.categoryImage = categoryImage;
        this.bookImage = bookImage;
    }

    public int getDigit() {
        return digit;
    }

    public String getCategoryImage() {
        return categoryImage;
    }

    public String getBookImage() {
        return bookImage;
    }
}
