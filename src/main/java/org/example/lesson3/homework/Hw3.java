package org.example.lesson3.homework;

import java.util.ArrayList;
import java.util.List;

public class Hw3 {
    public static void main(String[] args) {
        List<Book> books = create();
        List<String> result = new ArrayList<>();
        for (Book b : books) {
            if (isSimplePages(b.getPages()) && containsLetterA(b.getAuthor()) && b.getYear() >= 2010){
                result.add(b.getTitle());
            }
        }
        System.out.println("result = " + result);

    }

    /**
     * @apiNote   Сведения о книге состоят из названия, фамилии автора, цены, года издания и количества страниц.
     * Найти названия книг, в которых простое количество страниц, фамилия автора содержит «А» и год издания
     * после 2010 г, включительно.
     * @return result  Список книг
     */
    private static List<Book> create() {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Java Programming", "John Smith", 50.0, 2015, 400));
        books.add(new Book("Python for Beginners", "Alice Adams", 30.0, 2009, 177));
        books.add(new Book("C++ Essentials", "Bob Anderson", 40.0, 2010, 17));
        books.add(new Book("JavaScript Basics", "David Lee", 35.0, 2016, 7));
        return books;
    }

    private static boolean isSimplePages(int pages) {
        for (int i = 2; i < pages; i++) {
            if (pages % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static boolean containsLetterA(String author) {
        return author.toLowerCase().contains("a");
    }
}
