package org.example.oop1.classWork;


public class SavingAccaunt extends Accunt {
    private Double saivingProssent;

    public SavingAccaunt() {
    }

    public SavingAccaunt(Integer numAccaunt, String owner, Double balance, Double saivingProssent) {
        super(numAccaunt, owner, balance);
        this.saivingProssent = saivingProssent;
    }

    protected void addInterest() {
        Double result = getBalance() * saivingProssent / 100;
        deposit(result);
    }
}

