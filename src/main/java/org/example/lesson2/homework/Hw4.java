package org.example.lesson2.homework;

public class Hw4 {
    public static void main(String[] args) {
        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};
        System.out.println("Validete:" + isValidSudoku(board));
    }

    /**
     * @apiNote Отвалидировать доску судоку
     * @param board входной массив
     * @return Валидна доска или нет
     */

    public static boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            boolean[] rowCheck = new boolean[9];
            for (int j = 0; j < 9; j++) {
                char current = board[i][j];
                if (current != '.') {
                    int index = current - '1';
                    if (rowCheck[index]) {
                        return false;
                    } else {
                        rowCheck[index] = true;
                    }
                }
            }
        }


        for (int j = 0; j < 9; j++) {
            boolean[] colCheck = new boolean[9];
            for (int i = 0; i < 9; i++) {
                char current = board[i][j];
                if (current != '.') {
                    int index = current - '1';
                    if (colCheck[index]) {
                        return false;
                    } else {
                        colCheck[index] = true;
                    }
                }
            }
        }


        for (int block = 0; block < 9; block++) {
            boolean[] blockCheck = new boolean[9];
            for (int i = block / 3 * 3; i < block / 3 * 3 + 3; i++) {
                for (int j = block % 3 * 3; j < block % 3 * 3 + 3; j++) {
                    char current = board[i][j];
                    if (current != '.') {
                        int index = current - '1';
                        if (blockCheck[index]) {
                            return false;
                        } else {
                            blockCheck[index] = true;
                        }
                    }
                }
            }
        }

        return true;
    }
}
