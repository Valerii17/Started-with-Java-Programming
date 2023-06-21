package org.example.lesson3.homework;

import java.util.ArrayList;
import java.util.List;

public class Hw2 {
    public static void main(String[] args) {
        List<Product2> products2 = create();
        Double minPrice = Double.MAX_VALUE;
        for (Product2 p : products2){
            if (p.getSort().equals("Овощи")) {
                if (p.getPrice() < minPrice) minPrice = p.getPrice();
            }
        }
        List<String> result = new ArrayList<>();
        for (Product2 p : products2) {
            if (p.getSort().equals("Овощи") && p.getPrice() == minPrice) {
                result.add(p.getName());
            }
        }
        System.out.println(result);

    }

    /**
     * @apiNote Сведения о товаре состоят из наименования, страны-производителя, веса, цены, сорта.
     * Получить наименования товаров заданного сорта с наименьшей ценой.
     * @return  Список наименований с минимальной ценой
     */

    private static List<Product2> create() {
        List<Product2> products2 = new ArrayList<>();
        products2.add(new Product2("Молоко", "Россия", 1.0, 50.0, "Пищевые продукты"));
        products2.add(new Product2("Картофель", "Беларусь", 2.0, 10.0, "Овощи"));
        products2.add(new Product2("Капуста", "Украина", 1.5, 10.0, "Овощи"));
        products2.add(new Product2("Хлеб", "Россия", 0.5, 40.0, "Хлебобулочные изделия"));
        products2.add(new Product2("Морковь", "Украина", 1.0, 15.0, "Овощи"));
        return products2;
    }

}
