/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package main;

/**
 *
 * @author LENOVO
 */
public interface Vehicle {
    String getType();
    double calculateBookingCost(int hours);
    boolean validateAge(int age);
}
