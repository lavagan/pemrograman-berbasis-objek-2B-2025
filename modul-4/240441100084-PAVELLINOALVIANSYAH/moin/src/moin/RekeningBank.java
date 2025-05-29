/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moin;

/**
 *
 * @author LENOVO
 */
public class RekeningBank {
    private String noRekening;
    private String namaPemilik;
    private double saldo;

    public RekeningBank(String noRekening, String namaPemilik, double saldoAwal) {
        this.noRekening = noRekening;
        this.namaPemilik = namaPemilik;
        this.saldo = saldoAwal;
    }

    // Getter methods
    public String getNoRekening() {
        return noRekening;
    }

    public String getNamaPemilik() {
        return namaPemilik;
    }

    public double getSaldo() {
        return saldo;
    }

    // Methods for transactions
    public void setor(double jumlah) {
        if (jumlah > 0) {
            saldo += jumlah;
            System.out.println("Setor berhasil. Saldo baru: " + saldo);
        } else {
            System.out.println("Jumlah setor harus lebih dari 0");
        }
    }

    public void tarik(double jumlah) {
        if (jumlah > 0) {
            if (saldo >= jumlah) {
                saldo -= jumlah;
                System.out.println("Penarikan berhasil. Saldo baru: " + saldo);
            } else {
                System.out.println("Saldo tidak mencukupi");
            }
        } else {
            System.out.println("Jumlah penarikan harus lebih dari 0");
        }
    }
}
