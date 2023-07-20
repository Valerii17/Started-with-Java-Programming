package org.example.oop6.classWork;

import java.util.List;

public class NoFormatter implements Formatter{
    @Override
    public void formatted(List<Book> books) {
        for (Book book : books) {
            System.out.println(book + " была переведенна в формат: " + Format.NOFORMAT);
        }
    }
}
