package org.example.lesson3.classwork;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Item {

    private String name;
    private String country;
    private Integer valume;
}
