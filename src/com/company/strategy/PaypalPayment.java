package com.company.strategy;

public class PaypalPayment implements PayStrategy{
    @Override
    public void pay() {
        System.out.println("pay with paypal");
    }
}
