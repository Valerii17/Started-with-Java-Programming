package org.example.exceptions.classWork3;

import java.io.IOException;

public class Main1 {
    /*
    Создайте метод doSomething(), который может быть источником одного из типов checked exceptions
    (тела самого метода прописывать не надо),вызовите  этот метод из main  и  обработайте в нем исключение,
    которое выхвал метод 	doSomething())
     */
    public static void main(String[] args) {
        try {
            doSomething();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void doSomething() throws IOException {

    }
}
