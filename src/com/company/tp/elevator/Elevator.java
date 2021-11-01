package com.company.tp.elevator;

import lombok.Data;

@Data
public class Elevator {

    private String id;
    private int numberOfFloors;
    private Integer currentFloor;
    private Etat elevatorState;

    public Elevator(String id, Integer floor,Integer numberOfFloors){
        this.id = id;
        this.currentFloor = floor;
        this.numberOfFloors=numberOfFloors;
        this.elevatorState=new EtatReset(this);
    }

    public int  distanceFromFloor(int floor){
        return elevatorState.distanceFromFloor(floor);
    }




}
