package parking;


import car.model.Car;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ParkingLotTest {

    @Test
    public void testCarPark() {
        List<Level> levels = List.of(new Level(2,0), new Level(2,1));

        ParkingLot parkingLot = new ParkingLot(levels);

        assertTrue(parkingLot.park(new Car("L123")));
        assertTrue(parkingLot.park(new Car("L124")));
        assertTrue(parkingLot.park(new Car("L125")));
        assertTrue(parkingLot.park(new Car("L126")));

        assertTrue(parkingLot.park(new Car("L127")));
        assertTrue(parkingLot.park(new Car("L128")));
        assertTrue(parkingLot.park(new Car("L129")));
        assertTrue(parkingLot.park(new Car("L130")));
    }

    @Test
    public void testCarParkFull() {
        List<Level> levels = List.of(new Level(2,0), new Level(2,1));

        ParkingLot parkingLot = new ParkingLot(levels);

        assertTrue(parkingLot.park(new Car("L123")));
        assertTrue(parkingLot.park(new Car("L124")));
        assertTrue(parkingLot.park(new Car("L125")));
        assertTrue(parkingLot.park(new Car("L126")));

        assertTrue(parkingLot.park(new Car("L127")));
        assertTrue(parkingLot.park(new Car("L128")));
        assertTrue(parkingLot.park(new Car("L129")));
        assertTrue(parkingLot.park(new Car("L130")));

        //Checking if parking full returns false
        assertFalse(parkingLot.park(new Car("L131")));
    }
}