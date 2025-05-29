/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mien;
import java.util.ArrayList;
/**
 *
 * @author LENOVO
 */
public class Klinik {
    private ArrayList<Pasien> daftarPasien;

    public Klinik() {
        daftarPasien = new ArrayList<>();
    }

    public void tambahPasien(Pasien pasien) {
        daftarPasien.add(pasien);
        System.out.println("Data pasien berhasil ditambahkan!");
    }

    public void tampilkanSemuaPasien() {
        if (daftarPasien.isEmpty()) {
            System.out.println("Belum ada pasien terdaftar.");
            return;
        }

        System.out.println("\nDaftar Pasien Klinik:");
        System.out.println("=================================");
        for (int i = 0; i < daftarPasien.size(); i++) {
            System.out.println("Pasien #" + (i + 1));
            System.out.println(daftarPasien.get(i).toString());
        }
        System.out.println("Total pasien: " + daftarPasien.size());
    }

    public Pasien cariPasien(String nama) {
        for (Pasien pasien : daftarPasien) {
            if (pasien.getNama().equalsIgnoreCase(nama)) {
                return pasien;
            }
        }
        return null;
    }

    public boolean hapusPasien(String nama) {
        Pasien pasien = cariPasien(nama);
        if (pasien != null) {
            daftarPasien.remove(pasien);
            return true;
        }
        return false;
    }
}
