package com.company.strategy;

public class CashPayment implements PayStrategy{
    @Override
    public void pay() {
        System.out.println("pay with cash");
    }
}
