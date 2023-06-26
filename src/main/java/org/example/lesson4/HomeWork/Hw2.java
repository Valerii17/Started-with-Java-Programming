package org.example.lesson4.HomeWork;

import java.util.Stack;

public class Hw2 {
    public static void main(String[] args) {
        String s = "({[]})";
        boolean isValid = checkString(s);
        System.out.println(isValid);

        s = "({[})]";
        isValid = checkString(s);
        System.out.println(isValid);
    }

    /**
     * @apiNote Учитывая строку s, содержащую только символы '(', ')', '{', и , определите '}', допустима ли входная строка.'['']'
     ** Входная строка действительна, если:
     ** Открытые скобки должны быть закрыты однотипными скобками.
     * Открытые скобки должны быть закрыты в правильном порядке.
     * Каждой закрывающей скобке соответствует открытая скобка того же типа.
     * @param s
     * @return
     */

    private static boolean checkString(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[')
                stack.push(c);
            else if (c == ')' && !stack.isEmpty() && stack.peek() == '(')
                stack.pop();
            else if (c == '}' && !stack.isEmpty() && stack.peek() == '{')
                stack.pop();
            else if (c == ']' && !stack.isEmpty() && stack.peek() == '[')
                stack.pop();
            else {
                return false;
            }
        }
        return stack.isEmpty();
    }
}

