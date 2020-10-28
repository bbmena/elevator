package com.elevator.models;

import java.util.ArrayList;
import java.util.List;

public class ElevatorCar {
    private List<PassengerInfo> passengers;
    private List<PassengerInfo> requests;
    private Direction currentDirection;
    private int currentFloor;

    public ElevatorCar(Direction _currentDirection, int _currentFloor) {
        this.passengers = new ArrayList<>();
        this.requests = new ArrayList<>();
        this.currentDirection = _currentDirection;
        this.currentFloor = _currentFloor;
    }

    public List<PassengerInfo> getPassengers() {
        return passengers;
    }
    public void setPassengers(List<PassengerInfo> passengers) {
        this.passengers = passengers;
    }

    public Direction getCurrentDirection() {
        return currentDirection;
    }
    public void setCurrentDirection(Direction currentDirection) {
        this.currentDirection = currentDirection;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }
    public void setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
    }
}
