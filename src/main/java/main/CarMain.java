package main;

import car.model.Car;

import java.util.ArrayList;

public class CarMain {
    protected ArrayList<String> parkingSpots =new ArrayList<String>();

    public static void main(String[] args) {
        Car prius = new Car("Prius", 5, "121hp","53MPG");
        Car porsche = new Car("Porsche", 2, "265hp","32MPG");
        porsche.setConvertible(true);

        do {
            prius.accelarate(20.00);
            porsche.accelarate(20.00);
        }while(prius.getCurrentSpeed()<200 || porsche.getCurrentSpeed()<200);

    }


    public void park(Car car) {
        parkingSpots.add(car.getProductionNumber());

    }

    public void remove(String productionNumber) {
        parkingSpots.remove(productionNumber);
    }
}
