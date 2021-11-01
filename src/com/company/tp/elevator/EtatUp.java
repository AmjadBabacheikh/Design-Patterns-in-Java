package com.company.tp.elevator;

public class EtatUp extends Etat{


    public EtatUp(Elevator elevator) {
        super(elevator);
    }

    @Override
    public int distanceFromFloor(int floor) {
        if(floor>=this.elevator.getCurrentFloor()){
            return floor-elevator.getCurrentFloor();
        }
        else {
            return floor + elevator.getNumberOfFloors() - elevator.getCurrentFloor();
        }
    }

    @Override
    public void down() {
        throw new IllegalStateException("elevator is going up it can't switch direction ...");
    }

    @Override
    public void up() {
        throw new IllegalArgumentException("the elevator is already in up state");
    }

    @Override
    public void rest() {
        elevator.setElevatorState(new EtatReset(this.elevator));
    }

    @Override
    public void stop() {
        elevator.setElevatorState(new EtatStopped(this.elevator));
    }
}
