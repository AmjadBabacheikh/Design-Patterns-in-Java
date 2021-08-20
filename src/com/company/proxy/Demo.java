package com.company.proxy;

interface Drivable {
    void drive();
}

class Car implements Drivable{
    protected Driver driver;
    public Car(Driver driver){
        this.driver=driver;
    }

    @Override
    public void drive() {
        System.out.println("the car is driving");
    }
}

class CarProxy extends Car{

    public CarProxy(Driver driver) {
        super(driver);
    }

    @Override
    public void drive() {
        if(driver.age<18){
            System.out.println("you are too young to drive");
        }
        else super.drive();
    }
}

class Driver{
    protected int age;

    Driver(int age) {
        this.age = age;
    }
}


public class Demo {
    public static void main(String[] args) {
        Car car1 = new CarProxy(new Driver(12));
        car1.drive();
        Car car2 = new CarProxy(new Driver(21));
        car2.drive();
    }

}
