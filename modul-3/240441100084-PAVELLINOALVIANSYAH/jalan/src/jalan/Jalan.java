/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jalan;

/**
 *
 * @author LENOVO
 */
public class Jalan {

   public static void main(String[] args) {
        // Membuat objek MahasiswaReguler
        MahasiswaReguler reguler1 = new MahasiswaReguler("pavellino", "202401001", "A1");
        MahasiswaReguler reguler2 = new MahasiswaReguler("adimas", "202401002", "B2");
        
        // Membuat objek MahasiswaBeasiswa
        MahasiswaBeasiswa beasiswa1 = new MahasiswaBeasiswa("reyhan", "202402001", "Akademik");
        MahasiswaBeasiswa beasiswa2 = new MahasiswaBeasiswa("aiman", "202402002", "Atlet");
        MahasiswaBeasiswa beasiswa3 = new MahasiswaBeasiswa("gilang", "202402003", "Seni Budaya");

        // Memanggil method infoReguler()
        System.out.println("Data Mahasiswa Reguler:");
        reguler1.infoReguler();
        reguler2.infoReguler();

        // Memanggil method infoBeasiswa()
        System.out.println("Data Mahasiswa Beasiswa:");
        beasiswa1.infoBeasiswa();
        beasiswa2.infoBeasiswa();
        beasiswa3.infoBeasiswa();
    }
    
}
