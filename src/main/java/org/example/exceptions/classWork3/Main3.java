package org.example.exceptions.classWork3;

public class Main3 {
    /*
    1. Создайте класс исключения, который будет выбрасываться при делении на 0.
    2. Создайте класс исключений, которое будет возникать при обращении к пустому элементу в массиве ссылочного типа.
    Исключение должно отображать понятное для пользователя сообщение об ошибке.
    3. Создайте класс исключения, которое будет возникать при попытке открыть несуществующий файл.
    ИИсключение должно отображать понятное для пользователя сообщение об ошибке.
     */
    public static void main(String[] args) {
        try {
            double res = divideTwo(6, 0);
            System.out.println("res = " + res);
        } catch (DivisionByZeroException e){
            e.printStackTrace();
        }
    }
    public  static double divideTwo( int num1,int num2){
        if (num2 == 0){
            throw new DivisionByZeroException("На ноль делить нельзя");
        }
        return num1/num2;
    }

}
