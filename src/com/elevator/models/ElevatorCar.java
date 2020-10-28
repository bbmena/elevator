package com.elevator.models;

import java.util.ArrayList;
import java.util.List;

public class ElevatorCar {
    private List<PassengerInfo> passengers;
    private Direction currentDirection;
    private int currentFloor;
    private int maxFloor;

    public ElevatorCar(Direction _currentDirection, int _currentFloor, int _maxFloor) {
        this.passengers = new ArrayList<>();
        this.currentDirection = _currentDirection;
        this.currentFloor = _currentFloor;
        this.maxFloor = _maxFloor;
    }

    public void reverseCar() {
        if(currentDirection == Direction.DOWN){
            currentDirection = Direction.UP;
        } else {
            currentDirection = Direction.DOWN;
        }
    }

    public void moveCar() {
        if(passengers.isEmpty()){
            if(currentFloor > 1){
                currentDirection = Direction.DOWN;
                currentFloor--;
            }
        } else {
            if(currentDirection == Direction.DOWN){
                if(currentFloor > 1){
                    currentFloor--;
                } else {
                    reverseCar();
                    currentFloor++;
                }
            } else {
                if(currentFloor < maxFloor){
                    currentFloor++;
                } else {
                    reverseCar();
                    currentFloor--;
                }
            }
        }
    }

    public void dropPassengers(){
        //if currentFloor == destination for any passenger, remove passenger from list and send log statement announcing the drop-off
    }

    public void addPassenger(PassengerInfo passenger){
        this.passengers.add(passenger);
    }

    public List<PassengerInfo> getPassengers() {
        return this.passengers;
    }

    public Direction getCurrentDirection() {
        return this.currentDirection;
    }

    public int getCurrentFloor() {
        return this.currentFloor;
    }
}
