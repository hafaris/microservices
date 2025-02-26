package com.wipro.java.ms.isp;

public class FeeParking implements ParkingLot {
    private static final int TOTAL_CAPACITY = 100;
    private int occupiedSpots = 0;
    private static final double HOURLY_RATE = 10.0;

    @Override
    public void parkCar() {
        if (occupiedSpots < TOTAL_CAPACITY) {
            occupiedSpots++;
            System.out.println("Car parked. Available spots: " + (TOTAL_CAPACITY - occupiedSpots));
        } else {
            System.out.println("Parking lot is full!");
        }
    }

    @Override
    public void unparkCar() {
        if (occupiedSpots > 0) {
            occupiedSpots--;
            System.out.println("Car unparked. Available spots: " + (TOTAL_CAPACITY - occupiedSpots));
        } else {
            System.out.println("Parking lot is empty!");
        }
    }

    @Override
    public void getCapacity() {
        System.out.println("Total capacity: " + TOTAL_CAPACITY + ", Available: " + (TOTAL_CAPACITY - occupiedSpots));
    }

    @Override
    public double calculateFee(Car car) {
        int hours = (int) (Math.random() * 5) + 1; // Random hours between 1 and 5
        double fee = hours * HOURLY_RATE;
        System.out.println("Parking fee for " + hours + " hours: $" + fee);
        return fee;
    }

    @Override
    public void doPayment(Car car) throws Exception {
        double fee = calculateFee(car);
        System.out.println("Payment of $" + fee + " done for car: " + car.getLicensePlate());
    }
}

