package org.example;

public class Book {

    String title;
    String author;
    String description;
    String id;
    boolean isAvailable;

    public Book(String title, String author, String description, String id) {
        this.title = title;
        this.author = author;
        this.description = description;
        this.id = id;
        isAvailable = true;
    }

    public Book(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getDescription() {
        return description;
    }

    public String getId() {
        return id;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public String available(){
        return isAvailable ? "Available!" : "Not available!";
    }

    @Override
    public String toString() {
        return "Title: " + title + " Author: " + author + " Description: " + description + " ID: " + id;
    }



}
