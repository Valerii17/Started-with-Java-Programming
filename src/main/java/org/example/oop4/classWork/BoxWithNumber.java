package org.example.oop4.classWork;

public class BoxWithNumber<E extends Number> {
    private E[] num;

    public BoxWithNumber(E... num) {
        this.num = num;
    }

    public double avarage() {
        double result = 0;
        for (int i = 0; i < num.length; i++) {
            result += num[i].doubleValue();
        }
        return result / num.length;
    }

    public boolean compareAvarage(BoxWithNumber<?> boxWithNumber2) {// ставим ? если нужно разные типы
         return (this.avarage() == boxWithNumber2.avarage());
    }
}
