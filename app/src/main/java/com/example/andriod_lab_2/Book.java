package com.example.andriod_lab_2;

public class Book {
    private final String title;
    private final String author;
    private final int imageResId;

    public Book(String title, String author, int imageResId) {
        this.title = title;
        this.author = author;
        this.imageResId = imageResId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getImageResId() {
        return imageResId;
    }
}
