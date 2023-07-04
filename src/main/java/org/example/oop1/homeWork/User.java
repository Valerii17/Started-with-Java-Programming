package org.example.oop1.homeWork;

public class User {
    private String login;
    private String password;
    private Basket basket;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
        this.basket = new Basket();
    }

    public Basket getBasket() {
        return basket;
    }

    public String getLogin() {
        return login;
    }
}
