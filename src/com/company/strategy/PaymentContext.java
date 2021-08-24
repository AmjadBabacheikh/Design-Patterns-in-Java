package com.company.strategy;

public class PaymentContext {

    private PayStrategy payStrategy;


    public PaymentContext(PayStrategy payStrategy) {
        this.payStrategy = payStrategy;
    }

    public void execute() {
        if (payStrategy == null) {
            System.out.println("Aucun moyen de payment n a ete choisi");
        } else {
            payStrategy.pay();
        }

    }

    public void setPayStrategy(PayStrategy payStrategy) {
        this.payStrategy = payStrategy;
    }
}
