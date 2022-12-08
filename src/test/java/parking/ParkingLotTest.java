package parking;


import car.model.Car;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class ParkingLotTest {

    @Test
    public void testCarPark(){
        List<Level> levels = List.of(new Level(2,0), new Level(2,1));

        ParkingLot parkingLot = new ParkingLot(levels);

        assertTrue(parkingLot.park(new Car("L123")));
        assertTrue(parkingLot.park(new Car("L124")));
        assertTrue(parkingLot.park(new Car("L125")));
        assertTrue(parkingLot.park(new Car("L126")));
    }
}