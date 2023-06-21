package org.example.lesson3.homework;

import java.util.ArrayList;
import java.util.List;

public class Hw1 {
    public static void main(String[] args) {
        List<Product> products = create();
        double maxPrice = findMaxPrice(products);
        System.out.println("Наибольшая цена 1го или 2-го сорта, название которых содержит «высший»: " + maxPrice);
    }

    /**
     * @return maxPrice  Наибольшая цена
     * @apiNote Дан массив записей: наименование товара, цена, сорт. Найти наибольшую цену товаров 1го
     * или 2-го сорта среди товаров, название которых содержит «высший».
     */

    private static List<Product> create() {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Высший чай", 300.0, "первый"));
        products.add(new Product("Чай высший", 250.0, "второй"));
        products.add(new Product("Кофе высший", 200.0, "первый"));

        return products;
    }

    public static double findMaxPrice(List<Product> products) {
        double maxPrice = 0.0;
        for (Product product : products) {
            if (product.getName().toLowerCase().contains("высший") && (product.getSort().equals("первый") || product.getSort().equals("второй"))) {
                if (product.getPrice() > maxPrice)  maxPrice = product.getPrice();
             }
        }
        return maxPrice;
    }
}

