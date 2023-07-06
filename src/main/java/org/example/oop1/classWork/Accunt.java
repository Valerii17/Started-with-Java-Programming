package org.example.oop1.classWork;


public class Accunt {
    private Integer numAccaunt;
    private String owner;
    private Double balance;

    public Accunt() {
    }

    public Accunt(Integer numAccaunt, String owner, Double balance) {
        this.numAccaunt = numAccaunt;
        this.owner = owner;
        this.balance = balance;
    }

    public Integer getNumAccaunt() {
        return numAccaunt;
    }

    public void setNumAccaunt(Integer numAccaunt) {
        this.numAccaunt = numAccaunt;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    protected Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    protected void deposit(Double amount) {
        balance = amount + balance;
    }

    protected void withdraw(Double amount) {
        if (balance >= amount) {
            balance = balance - amount;
        } else System.out.print("Мало средств на счету , остаток = " + balance);
    }
}

