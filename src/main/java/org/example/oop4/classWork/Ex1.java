package org.example.oop4.classWork;

public class Ex1 {
    public static void main(String[] args) {
        /**
         * 1)	Создать класс - коробку (SimpleBox), которая может хранить любые объекты.
         * Посмотреть с какими ошибками можно столкнуться и исправить данное решение на более подходящее(GenBox).
         */
        SimplBox intbox1 = new SimplBox(10);
        SimplBox intbox2 = new SimplBox(20);
        Integer sum = ((Integer) intbox1.getObj()) + (Integer) intbox2.getObj(); // нужно кастить
        System.out.println("sum = " + sum);
        intbox1.setObj("10");
        Integer sum2 = 0;
        if (intbox1.getObj() instanceof Integer && intbox2.getObj() instanceof Integer) {
            sum2 = ((Integer) intbox1.getObj()) + ((Integer) intbox2.getObj()); // клас каст эксепшн
        }
        System.out.println("sum2 = " + sum2);
        GenBox<Integer> gen1 = new GenBox(10);
        GenBox<Integer> gen2 = new GenBox(20);
        Integer sum3 = gen1.getObj() + gen2.getObj(); // больше не нужно кастить
        System.out.println("sum3 = " + sum3);
   //     gen1.setObj("qwe"); // ошибка компиляции - исправить легко
    }

}



