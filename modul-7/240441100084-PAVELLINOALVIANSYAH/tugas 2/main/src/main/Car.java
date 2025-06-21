/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author LENOVO
 */
public class Car implements Vehicle, Booking, Insurance {
    private boolean isBooked = false;
    private boolean hasInsurance = false;
    private static final double HOURLY_RATE = 50000;

    @Override
    public String getType() {
        return "Car";
    }

    @Override
    public double calculateBookingCost(int hours) {
        double cost = HOURLY_RATE * hours;
        if (hasInsurance) {
            cost += getInsuranceCost();
        }
        return cost;
    }

    @Override
    public boolean validateAge(int age) {
        return age >= 18; // Must be 18+ to book a car
    }

    @Override
    public void bookVehicle(int hours, int userAge) {
        if (!validateAge(userAge)) {
            System.out.println("Booking failed. You must be at least 18 years old to book a car.");
            return;
        }

        isBooked = true;
        System.out.println("Car booked for " + hours + " hours. Total cost: Rp" + calculateBookingCost(hours));
    }

    @Override
    public void cancelBooking() {
        isBooked = false;
        System.out.println("Car booking cancelled.");
    }

    @Override
    public void addInsurance() {
        hasInsurance = true;
        System.out.println("Insurance added to car booking.");
    }

    @Override
    public double getInsuranceCost() {
        return 100000; // Flat insurance fee for cars
    }
}
