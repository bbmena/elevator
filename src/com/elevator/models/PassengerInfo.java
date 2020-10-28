package com.elevator.models;

public class PassengerInfo {
    private Direction direction;
    private int beginningFloor;
    private int destinationFloor;

    public PassengerInfo(Direction _direction, int _floor, int _destination){
        this.direction = _direction;
        this.beginningFloor = _floor;
        this.destinationFloor = _destination;
    }

    public Direction getDirection() {
        return direction;
    }
    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public int getBeginningFloor() {
        return beginningFloor;
    }
    public void setBeginningFloor(int currentFloor) {
        this.beginningFloor = currentFloor;
    }

    public int getDestinationFloor() {
        return destinationFloor;
    }
    public void setDestinationFloor(int destinationFloor) {
        this.destinationFloor = destinationFloor;
    }
}
