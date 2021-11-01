package com.company.tp.elevator;

public class EtatStopped extends Etat{


    public EtatStopped(Elevator elevator) {
        super(elevator);
    }

    @Override
    public int distanceFromFloor(int floor) {
        return Integer.MAX_VALUE;
    }

    @Override
    public void down() {
        elevator.setElevatorState(new EtatDown(elevator));
    }

    @Override
    public void up() {
        elevator.setElevatorState(new EtatUp(elevator));
    }

    @Override
    public void rest() {
        elevator.setElevatorState(new EtatReset(elevator));
    }

    @Override
    public void stop() {
        throw new IllegalArgumentException("the elevator is already in stopped state");
    }
}
