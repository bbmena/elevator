package com.elevator.models;

public class PassengerInfo {
    private Direction direction;
    private int floor;

    public PassengerInfo(Direction _direction, int _floor){
        this.direction = _direction;
        this.floor = _floor;
    }

    public Direction getDirection() {
        return direction;
    }
    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public int getFloor() {
        return floor;
    }
    public void setFloor(int floor) {
        this.floor = floor;
    }
}
