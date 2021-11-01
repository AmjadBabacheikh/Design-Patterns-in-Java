package com.company.tp.elevator;

public class EtatDown extends Etat {

    public EtatDown(Elevator elevator) {
        super(elevator);
    }

    @Override
    public int distanceFromFloor(int floor) {
        if(floor<elevator.getCurrentFloor()){
                return elevator.getCurrentFloor()-floor;
        }
        else {
            return floor + elevator.getNumberOfFloors() - elevator.getCurrentFloor();
        }
    }

    @Override
    public void down() {
        throw new IllegalArgumentException("the elevator is already in down state");
    }

    @Override
    public void up() {
        throw new IllegalArgumentException("the elevator cannot switch to up state");
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
