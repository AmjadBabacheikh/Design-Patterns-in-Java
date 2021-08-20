package com.company.builder;

public class Demo {

    public static void main(String[] args) {
        PhoneBuilder phoneBuilder=new PhoneBuilder();
        Phone phone=phoneBuilder.setOs("Mac").setRam(8).getPhone();
        System.out.println(phone);
    }
}
