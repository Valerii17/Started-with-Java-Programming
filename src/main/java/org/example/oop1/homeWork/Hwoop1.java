package org.example.oop1.homeWork;

public class Hwoop1 {
    public static void main(String[] args) {

        Category category1 = new Category("Продукты питания");
        Category category2 = new Category("Бытовая техника");


        Product product1 = new Product("Хлеб", 1.5, 4);
        Product product2 = new Product("Молоко", 2.3, 5);
        Product product3 = new Product("Телевизор", 500, 4);
        Product product4 = new Product("Кофеварка", 100, 2);
        Product product5 = new Product("Мороженное", 5, 3);
        /**
         * @apiNote 1)Создать класс Товар, имеющий переменные имя, цена, рейтинг.
         * 2)Создать класс Категория, имеющий переменные имя и массив товаров. Создать несколько объектов класса Категория.
         * 3)Создать класс Basket, содержащий массив купленных товаров.
         * 4)Создать класс User, содержащий логин, пароль и объект класса Basket. Создать несколько объектов класса User.
         * 5)Вывести на консоль каталог продуктов. (все продукты магазина)
         * 6)Вывести на консоль покупки посетителей магазина. (После покупки у пользователя добавляется товар,
         * а из магазина - удаляется)
         */

        category1.addProduct(product1);
        category1.addProduct(product2);
        category2.addProduct(product3);
        category2.addProduct(product4);
        category1.addProduct(product5);


        User user1 = new User("user1", "password1");
        User user2 = new User("user2", "password2");


        user1.getBasket().addProduct(product1);
        user1.getBasket().addProduct(product3);
        user2.getBasket().addProduct(product2);
        user2.getBasket().addProduct(product5);



        for (Product product : user1.getBasket().getProducts()) {
            category1.removeProduct(product);
            category2.removeProduct(product);
        }
        for (Product product : user2.getBasket().getProducts()) {
            category1.removeProduct(product);
            category2.removeProduct(product);
        }


        System.out.println("Каталог продуктов:");
        System.out.println("Категория: " + category1.getName());
        for (Product product : category1.getProducts()) {
            System.out.println("Название: " + product.getName() + ", Цена: " + product.getPrice() + ", Рейтинг: " + product.getRating());
        }
        System.out.println("Категория: " + category2.getName());
        for (Product product : category2.getProducts()) {
            System.out.println("Название: " + product.getName() + ", Цена: " + product.getPrice() + ", Рейтинг: " + product.getRating());
        }


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
