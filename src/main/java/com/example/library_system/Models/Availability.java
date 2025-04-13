package com.example.library_system.Models;

public class Availability {
    private String book_Id;
    private Boolean availability;


    public Availability(String book_Id, Boolean availability){
        this.availability=availability;
        this.book_Id=book_Id;
    }

    public String getBook_Id() {
        return book_Id;
    }

    public void setBook_Id(String book_Id) {
        this.book_Id = book_Id;
    }

    public Boolean getAvailability() {
        return availability;
    }

    public void setAvailability(Boolean availability) {
        this.availability = availability;
    }
}
