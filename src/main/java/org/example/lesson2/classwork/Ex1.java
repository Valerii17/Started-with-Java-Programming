package org.example.lesson2.classwork;

public class Ex1 {
    public static void main(String[] args) {
        int[] myArray = {1,2,2,4,5,4,3,2,1};
        System.out.println("palindrom(myArray) = " + palindrom(myArray));
    }

    /**
     *
     * @param array входной сигнал
     * @return симметрия или нет в виде строки
     */

    private  static String palindrom(int[] array){
        for (int i = 0; i< array.length/2; i++){
            if (array[i]!= array[array.length-i-1]){
                return "Не симметричный !";
            }
        }
        return "Cимметричный !";
    }
}

