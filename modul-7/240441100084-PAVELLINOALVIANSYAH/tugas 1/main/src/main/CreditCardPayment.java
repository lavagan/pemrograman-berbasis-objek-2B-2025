/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author LENOVO
 */
public class CreditCardPayment implements Payment {
    private String cardNumber;
    private String expiryDate;

    public CreditCardPayment(String cardNumber, String expiryDate) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment: Rp" + amount);
        System.out.println("Card: ****-****-****-" + cardNumber.substring(15));
    }

    @Override
    public double applyAdditionalCharges(double amount) {
        // Add 2% credit card fee
        return amount * 1.02;
    }
}