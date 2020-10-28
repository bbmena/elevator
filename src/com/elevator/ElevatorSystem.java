package com.elevator;

import com.elevator.models.Direction;
import com.elevator.models.ElevatorCar;
import com.elevator.models.PassengerInfo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ElevatorSystem {

    private List<ElevatorCar> elevatorCars;
    private int maxFloor;
    private Queue<PassengerInfo> requests;
    private List<ElevatorCar> upward;
    private List<ElevatorCar> downward;

    private static ElevatorSystem elevatorSystem = null;

    private ElevatorSystem(int floors) {
        maxFloor = floors;
        elevatorCars = new ArrayList<>();
        requests = new LinkedList<>();
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
        elevatorCars.add(new ElevatorCar(Direction.UP, 1));
    }

    public void elevator_request(Direction direction, int beginningFloor, int destinationFloor){
        requests.add(new PassengerInfo(direction, beginningFloor, destinationFloor));
    }

    private void cycle(){

    }

    public List<ElevatorCar> getElevatorCars() {
        return elevatorCars;
    }

    public int getMaxFloor() {
        return maxFloor;
    }
}
