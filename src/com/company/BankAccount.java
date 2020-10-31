package com.company;

public class BankAccount {
    double amount;

    public double getAmount() {
        return amount;
    }

    public void deposit(double sum) {
        amount = amount + sum;
    }

    public void withDraw(int sum) throws LimitException {
        if (amount < sum) {
            throw new LimitException("Недостаточно средств ", getAmount());

        } else {
            amount = amount - sum;
            System.out.println("С вашего счета списалось  " + sum);
        }

    }
}

