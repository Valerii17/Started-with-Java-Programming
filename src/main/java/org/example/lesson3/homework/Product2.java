package org.example.lesson3.homework;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Product2 {
    private String name;
    private String country;
    private double weight;
    private double price;
    private String sort;
}
