package org.example.oop1.homeWork;

public class Hwoop1 {
    public static void main(String[] args) {
        // Создание категорий
        Category category1 = new Category("Продукты питания");
        Category category2 = new Category("Бытовая техника");

        // Создание товаров и добавление их в категории
        Product product1 = new Product("Хлеб", 1.5, 4);
        Product product2 = new Product("Молоко", 2.3, 5);
        Product product3 = new Product("Телевизор", 500, 4);
        Product product4 = new Product("Кофеварка", 100, 2);
        Product product5 = new Product("Мороженное", 5, 3);

        category1.addProduct(product1);
        category1.addProduct(product2);
        category2.addProduct(product3);
        category2.addProduct(product4);
        category1.addProduct(product5);

        // Создание пользователей
        User user1 = new User("user1", "password1");
        User user2 = new User("user2", "password2");

        // Добавление товаров в корзину пользователей
        user1.getBasket().addProduct(product1);
        user1.getBasket().addProduct(product3);
        user2.getBasket().addProduct(product2);
        user2.getBasket().addProduct(product5);


        // Удаление товаров из каталога, которые пользователь добавил в корзину
        for (Product product : user1.getBasket().getProducts()) {
            category1.removeProduct(product);
            category2.removeProduct(product);
        }
        for (Product product : user2.getBasket().getProducts()) {
            category1.removeProduct(product);
            category2.removeProduct(product);
        }

        // Вывод каталога продуктов
        System.out.println("Каталог продуктов:");
        System.out.println("Категория: " + category1.getName());
        for (Product product : category1.getProducts()) {
            System.out.println("Название: " + product.getName() + ", Цена: " + product.getPrice() + ", Рейтинг: " + product.getRating());
        }
        System.out.println("Категория: " + category2.getName());
        for (Product product : category2.getProducts()) {
            System.out.println("Название: " + product.getName() + ", Цена: " + product.getPrice() + ", Рейтинг: " + product.getRating());
        }

        // Вывод покупок пользователей
        System.out.println("Покупки пользователей:");
        System.out.println("Пользователь " + user1.getLogin() + ":");
        for (Product product : user1.getBasket().getProducts()) {
            System.out.println("Название: " + product.getName() + ", Цена: " + product.getPrice() + ", Рейтинг: " + product.getRating());
        }
        System.out.println("Пользователь " + user2.getLogin() + ":");
        for (Product product : user2.getBasket().getProducts()) {
            System.out.println("Название: " + product.getName() + ", Цена: " + product.getPrice() + ", Рейтинг: " + product.getRating());
        }

    }
}
