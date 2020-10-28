package com.elevator;

import com.elevator.models.Direction;
import com.elevator.models.ElevatorCar;

import java.util.ArrayList;
import java.util.List;

public class ElevatorSystem {

    private List<ElevatorCar> elevatorCars;
    private int maxFloor;
    private static ElevatorSystem elevatorSystem = null;

    private ElevatorSystem(int floors) {
        maxFloor = floors;
        elevatorCars = new ArrayList<>();
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

    public List<ElevatorCar> getElevatorCars() {
        return elevatorCars;
    }

    public int getMaxFloor() {
        return maxFloor;
    }
}
