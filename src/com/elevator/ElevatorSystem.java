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

    public void start() throws InterruptedException{
        while(true){
            elevatorSystem.cycle();
        }
    }

    private void addCar(){
        elevatorCars.add(new ElevatorCar(Direction.UP, 1, maxFloor));
    }

    public void elevator_request(Direction direction, int beginningFloor, int destinationFloor){
        if(beginningFloor > 0 && destinationFloor <= maxFloor){
            requests.add(new PassengerInfo(direction, beginningFloor, destinationFloor));
        } else {
            System.out.println("Invalid request!");
        }
    }

    private void cycle() throws InterruptedException{
        for(PassengerInfo p : requests) {
            // find a car that is on the request floor and heading in the right direction. If none exists, skip the request
            // and check for empty cars. If a car is empty move it up one floor.
            // log a message if a passenger is picked up
        }
        for(ElevatorCar e : elevatorCars){
            e.dropPassengers();
            e.moveCar();
        }
       Thread.sleep(1000);
    }

    public List<ElevatorCar> getElevatorCars() {
        return elevatorCars;
    }

    public int getMaxFloor() {
        return maxFloor;
    }
}
