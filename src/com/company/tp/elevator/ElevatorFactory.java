package com.company.tp.elevator;

import java.util.HashMap;
import java.util.Map;

public class ElevatorFactory {

    public  static Map buildElevators(int numberFloors, String... elevators){
        Map <String,Elevator>elevatorsArray = new HashMap();
        for (int i = 0; i < elevators.length; i++) {
            String[] elevatorDetail = elevators[i].split(":");
            elevatorsArray.put(elevatorDetail[0], new Elevator(Integer.valueOf(elevatorDetail[1]), numberFloors));
        }
        return elevatorsArray;
    }
}
