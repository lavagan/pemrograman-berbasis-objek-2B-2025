/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author LENOVO
 */
public class CashPayment implements Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing cash payment: Rp" + amount);
    }

    @Override
    public double applyAdditionalCharges(double amount) {
        // No additional charges for cash payment
        return amount;
    }
}