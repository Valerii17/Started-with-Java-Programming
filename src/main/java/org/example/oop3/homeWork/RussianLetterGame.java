package org.example.oop3.homeWork;

import java.util.ArrayList;
import java.util.List;

public class RussianLetterGame extends AbstractGame {
    @Override
    protected List<String> generateCharList() {
        List<String> charList = new ArrayList<>();
        for (char c = 'А'; c <= 'Я'; c++) {
            charList.add(String.valueOf(c));

        }
        return charList;
    }

    public void reset() {
    }
}
