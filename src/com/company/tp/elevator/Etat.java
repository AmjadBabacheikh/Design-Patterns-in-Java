package com.company.tp.elevator;

public abstract class Etat {

    Elevator elevator;


    public Etat(Elevator elevator){
        super();
        this.elevator=elevator;
    }

    public abstract int distanceFromFloor(int floor);


    public abstract void down();


    public abstract void up();


    public abstract void rest() throws IllegalAccessException;


    public abstract void stop();


}
