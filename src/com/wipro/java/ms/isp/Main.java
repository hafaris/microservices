package com.wipro.java.ms.isp;

public class Main {
	public static void main(String[] args) {
        FeeParking parkingLot = new FeeParking();
        Car car1 = new Car("ABC-123");
        Car car2 = new Car("XYZ-789");

        // Park cars
        parkingLot.parkCar();
        parkingLot.parkCar();

        // Check capacity
        parkingLot.getCapacity();

        // Unpark one car
        parkingLot.unparkCar();

        // Calculate fee and make payment
        try {
            parkingLot.doPayment(car1);
            parkingLot.doPayment(car2);
        } catch (Exception e) {
            System.out.println("Payment error: " + e.getMessage());
        }

        // Final capacity check
        parkingLot.getCapacity();
    }

}
