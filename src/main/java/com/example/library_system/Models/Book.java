package com.example.library_system.Models;

public class Book {

    private String book_Id;
    private String title;
    private String author;
    private String genre;
    private int copies;

    public Book(String book_Id, String title, String author, String genre, int copies){

        this.book_Id=book_Id;
        this.title=title;
        this.author=author;
        this.genre=genre;
        this.copies = copies;
    }

    public String getBook_Id() {
        return book_Id;
    }

    public void setBook_Id(String book_Id) {
        this.book_Id = book_Id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getCopies() {
        return copies;
    }

    public void setCopies(int copies) {
        this.copies = copies;
    }
}

