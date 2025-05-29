/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal2;

/**
 *
 * @author LENOVO
 */
public class Soal2 {
    public static void main(String[] args) {
        ManajemenMobil manajemen = new ManajemenMobil();
        
        // Tambahkan mobil ke manajemen
        manajemen.tambah_mobil(new MobilSport());
        manajemen.tambah_mobil(new MobilSedan());
        manajemen.tambah_mobil(new MobilSport());
        
        // Operasikan semua mobil
        System.out.println("=== Operasikan Semua Mobil ===");
        manajemen.operasikan_semua_mobil();
    }
}
