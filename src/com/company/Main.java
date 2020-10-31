package com.company;

public class Main {


    public static void main(String[] args) throws LimitException {
        BankAccount optima = new BankAccount();
        optima.deposit(20000);

        while (true) {
            try {
                optima.withDraw(6000);
                System.out.println(optima.getAmount());

            } catch (LimitException e) {
                try {
                    optima.withDraw((int) optima.getAmount());
                } catch (Exception ignore) {

                }
                break;
            }

        }

        System.out.println("Остаток счёта: " +optima.getAmount());
    }
}
