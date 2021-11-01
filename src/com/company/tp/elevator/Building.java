package com.company.tp.elevator;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Building {

    private int numberFloors;
    private Map<String, Elevator> elevatorsArray;

    public Building(int numberFloors, String... elevators) {
        this.numberFloors = numberFloors;
        this.elevatorsArray = new HashMap();
        for (int i = 0; i < elevators.length; i++) {
            String[] elevatorDetail = elevators[i].split(":");
            elevatorsArray.put(elevatorDetail[0], new Elevator(elevatorDetail[0], Integer.valueOf(elevatorDetail[1]), numberFloors));
        }
    }

    public void move(String idElevator, String direction) {
        Elevator elevator = this.elevatorsArray.get(idElevator);
        switch (direction) {
            case "DOWN":
                elevator.getElevatorState().down();
                break;
            case "UP":
                elevator.getElevatorState().up();
                break;
            default:
                throw new IllegalArgumentException("An elevator can move only UP or Down.");
        }
    }

    public String requestElevator(int i) {
        Map<String, Integer> distanceElevatorMap = new HashMap<>();
        this.elevatorsArray.forEach((s, elevator) -> distanceElevatorMap.put(elevator.getId(), elevator.distanceFromFloor(i)));
        String key = Collections.min(distanceElevatorMap.entrySet(), Map.Entry.comparingByValue()).getKey();
        return key;
    }

    public String requestElevator() {
        Map<String, Integer> distanceElevatorMap = new HashMap<>();
        this.elevatorsArray.forEach((s, elevator) -> distanceElevatorMap.put(elevator.getId(), elevator.distanceFromFloor(this.numberFloors)));
        String key = Collections.min(distanceElevatorMap.entrySet(), Map.Entry.comparingByValue()).getKey();
        return key;
    }

    public void stopAt(String idElevator, int floor) {
        Elevator elevator = this.elevatorsArray.get(idElevator);
        elevator.setCurrentFloor(floor);
        elevator.getElevatorState().stop();

    }

}
