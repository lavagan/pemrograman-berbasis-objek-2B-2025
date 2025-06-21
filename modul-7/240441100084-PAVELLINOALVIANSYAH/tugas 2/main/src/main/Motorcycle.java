/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author LENOVO
 */
public class Motorcycle implements Vehicle, Booking, Insurance {
    private boolean isBooked = false;
    private boolean hasInsurance = false;
    private static final double HOURLY_RATE = 20000;

    @Override
    public String getType() {
        return "Motorcycle";
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
        return age >= 17; // Must be 17+ to book a motorcycle
    }

    @Override
    public void bookVehicle(int hours, int userAge) {
        if (!validateAge(userAge)) {
            System.out.println("Booking failed. You must be at least 17 years old to book a motorcycle.");
            return;
        }

        isBooked = true;
        System.out.println("Motorcycle booked for " + hours + " hours. Total cost: Rp" + calculateBookingCost(hours));
    }

    @Override
    public void cancelBooking() {
        isBooked = false;
        System.out.println("Motorcycle booking cancelled.");
    }

    @Override
    public void addInsurance() {
        hasInsurance = true;
        System.out.println("Insurance added to motorcycle booking.");
    }

    @Override
    public double getInsuranceCost() {
        return 50000; // Flat insurance fee for motorcycles
    }
}
