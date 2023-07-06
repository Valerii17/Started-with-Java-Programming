package org.example.oop1.classWork;


public class CreditAccaunt extends Accunt {
    private Double prossent;

    public CreditAccaunt(Integer numAccaunt, String owner, Double balance, Double prossent) {
        super(numAccaunt, owner, balance);
        this.prossent = prossent;
    }

    public CreditAccaunt() {
    }

    public Double getProssent() {
        return prossent;
    }

    public void setProssent(Double prossent) {
        this.prossent = prossent;
    }

    protected void calculateInterest() {
        Double result = getBalance() * prossent / 100;
        withdraw(result);
    }
}

