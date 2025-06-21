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
        Payment cash = new CashPayment();
        Payment creditCard = new CreditCardPayment("1234567890123456", "12/25");
        Payment eWallet = new EWalletPayment("OVO");

        double amount = 1000000;

        processPayment(cash, amount);
        processPayment(creditCard, amount);
        processPayment(eWallet, amount);
    }

    public static void processPayment(Payment payment, double amount) {
        double finalAmount = payment.applyAdditionalCharges(amount);
        payment.processPayment(finalAmount);
    }
}