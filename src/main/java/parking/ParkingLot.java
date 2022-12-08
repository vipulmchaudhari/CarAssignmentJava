package parking;

import car.model.Car;

import java.util.List;

public class ParkingLot {

    public List<Level> levels;

    public ParkingLot(List<Level> levels){
        this.levels = levels;
    }

    public boolean park(Car car){
        for(Level level:levels){
            if( level.park(car)){
                System.out.println("Level: "+level.levelNumber  + " Row: "+ level.rows + " Car Parked: "+car.getProductionNumber());
                return true;
            }
        }
        return false;
    }

}