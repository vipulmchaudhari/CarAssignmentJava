package main;

import car.model.Car;
import parking.Level;
import parking.ParkingLot;

import java.util.List;

public class ParkingMain {
    public static void main(String[] args) {
        List<Level> levels = List.of(new Level(2,0), new Level(2,1));

        ParkingLot parkingLot = new ParkingLot(levels);
        parkingLot.park(new Car("L123"));
        parkingLot.park(new Car("L124"));
        parkingLot.park(new Car("L125"));
        parkingLot.park(new Car("L126"));

    }
}
