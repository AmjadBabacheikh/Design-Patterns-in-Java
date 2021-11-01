package com.company.tp.elevator;


public class EtatReset extends Etat{


    public EtatReset(Elevator elevator) {
        super(elevator);
    }

    @Override
    public int distanceFromFloor(int floor) {
        return Math.abs(floor - elevator.getCurrentFloor());
    }

    @Override
    public void down() {
        elevator.setElevatorState(new EtatDown(this.elevator));
    }

    @Override
    public void up() {
        elevator.setElevatorState(new EtatUp(this.elevator));
    }

    @Override
    public void rest() {
            throw new IllegalArgumentException("the elevator is already in rest state");
    }

    @Override
    public void stop() {
        elevator.setElevatorState(new EtatStopped(this.elevator));
    }
}
