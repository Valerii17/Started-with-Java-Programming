package org.example.lesson2.homework;

public class Hw2 {
    public static void main(String[] args) {
        int[] arrya = {1, 2, 3, 4, 5, 6};
        if (isIncreasingSequence(arrya)) System.out.println("Последовательность возрастающая");
        else System.out.println("Последоветльность не возврастающая");
    }

    /**
     * @apiNote  Дана последовательность из N целых чисел. Верно ли, что последовательность является возрастающей.
     * @param sequence Входная последовательность
     * @return Результат возврастающая или нет
     */
    public static boolean isIncreasingSequence(int[] sequence) {
        for (int i = 0; i < sequence.length - 1; i++) {
            if (sequence[i] >= sequence[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
