package task2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    @Test
    public void testCarInstanceVehicle() {
        Car car = new Car("Lada", "Niva", 2023);
        assertInstanceOf(Vehicle.class, car);
    }

    @Test
    public void testCarHasFourWheels() {
        Car car = new Car("Lada", "Niva", 2023);
        assertEquals(4, car.getNumWheels());
    }

    @Test
    public void testMotorcycleHasFourWheels() {
        Motorcycle motorcycle = new Motorcycle("KAWASAKI", "NINJA", 2023);
        assertEquals(2, motorcycle.getNumWheels());
    }

    @Test
    public void testCarSpeed() {
        Car car = new Car("Lada", "Niva", 2023);
        car.testDrive();
        assertEquals(60, car.getSpeed());
    }

    @Test
    public void testMotorcycleParingMode() {
        Motorcycle motorcycle = new Motorcycle("KAWASAKI", "NINJA", 2023);
        motorcycle.testDrive();
        assertEquals(75, motorcycle.getSpeed());
    }

    @Test
    public void testCarParkingMode() {
        Car car = new Car("Lada", "Niva", 2023);
        car.testDrive();
        car.park();
        assertEquals(0, car.getSpeed());
    }

    @Test
    public void testMotorcycleSpeedAfterStop() {
        Motorcycle motorcycle = new Motorcycle("KAWASAKI", "NINJA", 2023);
        motorcycle.testDrive();
        motorcycle.park();
        assertEquals(0, motorcycle.getSpeed());
    }


}