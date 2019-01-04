package com.serbanescu.tema2.ex3;

public class Book extends Product {

    public Book() {
    }

    private String author;

    public String getAuthor() {
        return author;
    }

    public Book(int bookId, String bookName, double bookPrice, String bookAuthor){
        super(bookId,bookName,bookPrice);
        author=bookAuthor;
    }



}
