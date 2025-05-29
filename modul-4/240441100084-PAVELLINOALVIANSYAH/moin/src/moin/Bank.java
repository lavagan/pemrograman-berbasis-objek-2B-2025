/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moin;
import java.util.ArrayList;
/**
 *
 * @author LENOVO
 */
public class Bank {
    private ArrayList<RekeningBank> rekeningList;

    public Bank() {
        rekeningList = new ArrayList<>();
    }

    public void tambahRekening(RekeningBank rekening) {
        // Cek apakah no rekening sudah ada
        for (RekeningBank r : rekeningList) {
            if (r.getNoRekening().equals(rekening.getNoRekening())) {
                System.out.println("No rekening sudah terdaftar");
                return;
            }
        }
        rekeningList.add(rekening);
        System.out.println("Rekening berhasil ditambahkan");
    }

    public RekeningBank cariRekening(String noRekening) {
        for (RekeningBank rekening : rekeningList) {
            if (rekening.getNoRekening().equals(noRekening)) {
                return rekening;
            }
        }
        return null;
    }

    public void setor(String noRekening, double jumlah) {
        RekeningBank rekening = cariRekening(noRekening);
        if (rekening != null) {
            rekening.setor(jumlah);
        } else {
            System.out.println("Rekening tidak ditemukan");
        }
    }

    public void tarik(String noRekening, double jumlah) {
        RekeningBank rekening = cariRekening(noRekening);
        if (rekening != null) {
            rekening.tarik(jumlah);
        } else {
            System.out.println("Rekening tidak ditemukan");
        }
    }

    public void tampilkanSemuaRekening() {
        System.out.println("\nDaftar Rekening:");
        System.out.println("----------------------------------------");
        System.out.printf("%-15s %-20s %-10s\n", "No Rekening", "Nama Pemilik", "Saldo");
        System.out.println("----------------------------------------");
        
        for (RekeningBank rekening : rekeningList) {
            System.out.printf("%-15s %-20s %-10.2f\n", 
                rekening.getNoRekening(),
                rekening.getNamaPemilik(),
                rekening.getSaldo());
        }
        System.out.println("----------------------------------------");
    }

    // Method tambahan untuk fitur dinamis
    public void hapusRekening(String noRekening) {
        RekeningBank rekening = cariRekening(noRekening);
        if (rekening != null) {
            rekeningList.remove(rekening);
            System.out.println("Rekening berhasil dihapus");
        } else {
            System.out.println("Rekening tidak ditemukan");
        }
    }

    public void transfer(String noRekAsal, String noRekTujuan, double jumlah) {
        RekeningBank rekAsal = cariRekening(noRekAsal);
        RekeningBank rekTujuan = cariRekening(noRekTujuan);
        
        if (rekAsal == null || rekTujuan == null) {
            System.out.println("Rekening asal atau tujuan tidak ditemukan");
            return;
        }
        
        if (rekAsal.getSaldo() >= jumlah) {
            rekAsal.tarik(jumlah);
            rekTujuan.setor(jumlah);
            System.out.println("Transfer berhasil");
        } else {
            System.out.println("Saldo tidak mencukupi untuk transfer");
        }
    }
}
