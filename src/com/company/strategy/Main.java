package com.company.strategy;

public class Main {

    public static void main(String[] args) {
        PaymentContext context = new PaymentContext(new CreditCardPayment());
        context.execute();

        context.setPayStrategy(new PaypalPayment());
        context.execute();

        context.setPayStrategy(null);
        context.execute();
    }
}
