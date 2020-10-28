package com.elevator;

import com.elevator.models.Direction;
import com.elevator.models.ElevatorCar;
import com.elevator.models.PassengerInfo;

import java.util.ArrayList;
import java.util.List;

public class ElevatorSystem {

    private List<ElevatorCar> elevatorCars;
    private int maxFloor;
    private List<PassengerInfo> requests;

    private static ElevatorSystem elevatorSystem = null;

    private ElevatorSystem(int floors) {
        maxFloor = floors;
        elevatorCars = new ArrayList<>();
        requests = new ArrayList<>();
    }

    public static ElevatorSystem createElevatorSystem(int floors, int elevators) {
        if(elevatorSystem == null){
            elevatorSystem = new ElevatorSystem(floors);
            for(int i = 0; i < elevators; i++){
                elevatorSystem.addCar();
            }
        }
        return elevatorSystem;
    }

    private void addCar(){
        elevatorCars.add(new ElevatorCar(Direction.UP, 1, maxFloor));
    }

    public void elevator_request(Direction direction, int beginningFloor, int destinationFloor){
        requests.add(new PassengerInfo(direction, beginningFloor, destinationFloor));
    }

    private void cycle(){
        for(PassengerInfo p : requests) {
            //find a car that is on the request floor and heading in the right direction. If non exists, skip the request.
        }
        for(ElevatorCar e : elevatorCars){
            //move each car one level in the current direction it is heading.
            //If car is at max or min floor, reverse direction and then move.
        }
    }

    public List<ElevatorCar> getElevatorCars() {
        return elevatorCars;
    }

    public int getMaxFloor() {
        return maxFloor;
    }
}
