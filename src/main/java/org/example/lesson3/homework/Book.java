package org.example.lesson3.homework;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Book {
    private String title;
    private String author;
    private double price;
    private int year;
    private int pages;
}
