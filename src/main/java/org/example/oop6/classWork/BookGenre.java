package org.example.oop6.classWork;

public class BookGenre implements Genre{
    String genre;

    public BookGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String getJanrName() {
        return genre;
    }

    @Override
    public String toString() {
        return genre;
    }
}