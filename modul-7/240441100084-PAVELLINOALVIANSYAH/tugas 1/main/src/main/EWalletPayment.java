/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author LENOVO
 */
public class EWalletPayment implements Payment {
    private String walletType;

    public EWalletPayment(String walletType) {
        this.walletType = walletType;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing " + walletType + " payment: Rp" + amount);
    }

    @Override
    public double applyAdditionalCharges(double amount) {
        // E-wallets might have discounts
        if (walletType.equalsIgnoreCase("OVO")) {
            return amount * 0.95; // 5% discount
        }
        return amount;
    }
}
