/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

/**
 *
 * @author LENOVO
 */
public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Motorcycle motorcycle = new Motorcycle();
        Bicycle bicycle = new Bicycle();

        // Book vehicles
        System.out.println("--- Booking Car ---");
        car.bookVehicle(5, 20);
        car.addInsurance();

        System.out.println("\n--- Booking Motorcycle ---");
        motorcycle.bookVehicle(3, 16); // This should fail
        motorcycle.bookVehicle(3, 18);

        System.out.println("\n--- Booking Bicycle ---");
        bicycle.bookVehicle(2, 10); // This should fail
        bicycle.bookVehicle(2, 15);
    }
}