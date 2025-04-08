package com.example.library_system.Models;

public class Book {

    private String book_Id;
    private String title;
    private String author;
    private String genre;
    private String availability;

    public Book(String book_Id, String title,String author,String genre, String availability){

        this.book_Id=book_Id;
        this.title=title;
        this.author=author;
        this.genre=genre;
        this.availability=availability;
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

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }
}

