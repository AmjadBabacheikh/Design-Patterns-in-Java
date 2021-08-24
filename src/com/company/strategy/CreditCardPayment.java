package com.company.strategy;

public class CreditCardPayment implements PayStrategy{
    @Override
    public void pay() {
        System.out.println("pay with credit card");
    }
}
