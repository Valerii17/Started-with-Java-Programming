package org.example.exceptions.classWork3;

import java.io.IOException;

public class Main2 {
    /*
    Создайте классс Счетчик ,у которого есть метод ADD(), увеличивающий значение внутренней nt переменнойт на 1,
    Сделайте так ,чтобы с объектом такого типа можно было работать в блоке try-with-resources.
    Подумайте , что должно происходить при закрытии этого ресурса ? Напишите метод для проверки , закрыт ли
    ресурс . При попытке вызвать add() у закрытого ресурса,должен выброситься IOException
     */
    public static void main(String[] args) {
        try (Counter counter = new Counter()){
            counter.add();
            counter.add();
            System.out.println(counter.isClosed());
            System.out.println(counter.getCount());
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}

