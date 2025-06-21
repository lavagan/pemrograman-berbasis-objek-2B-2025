/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author LENOVO
 */
public class Bicycle implements Vehicle, Booking {
    private boolean isBooked = false;
    private static final double HOURLY_RATE = 10000;

    @Override
    public String getType() {
        return "Bicycle";
    }

    @Override
    public double calculateBookingCost(int hours) {
        return HOURLY_RATE * hours;
    }

    @Override
    public boolean validateAge(int age) {
        return age >= 12; // Must be 12+ to book a bicycle
    }

    @Override
    public void bookVehicle(int hours, int userAge) {
        if (!validateAge(userAge)) {
            System.out.println("Booking failed. You must be at least 12 years old to book a bicycle.");
            return;
        }

        isBooked = true;
        System.out.println("Bicycle booked for " + hours + " hours. Total cost: Rp" + calculateBookingCost(hours));
    }

    @Override
    public void cancelBooking() {
        isBooked = false;
        System.out.println("Bicycle booking cancelled.");
    }
}
