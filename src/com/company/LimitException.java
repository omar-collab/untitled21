package com.company;

public class LimitException extends Exception {
    BankAccount optima= new BankAccount();
    double remainAmount=optima.getAmount();

    public LimitException(String message, double remainAmount) {
        super(message);
        this.remainAmount = remainAmount;
    }

    public double getRemainAmount() {
        return remainAmount;
    }
}
