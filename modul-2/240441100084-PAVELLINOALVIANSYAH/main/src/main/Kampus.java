/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author LENOVO
 */
public class Kampus {
    // Atribut instance
    private String nama;
    private String alamat;
    
    // Atribut class
    private static int totalMahasiswa;
    
    // Constructor
    public Kampus(String nama, String alamat) {
        if (!validasiNamaKampus(nama)) {
            throw new IllegalArgumentException("Nama kampus tidak valid");
        }
        this.nama = nama;
        this.alamat = alamat;
    }
    
    // Getter
    public String getNama() {
        return nama;
    }
    
    // Method instance
    public void tampilkanInfo() {
        System.out.println("Nama Kampus: " + nama);
        System.out.println("Alamat: " + alamat);
    }
    
    // Method class
    public static void tambahMahasiswa() {
        totalMahasiswa++;
    }
    
    public static void tampilkanTotalMahasiswa() {
        System.out.println("Total Mahasiswa: " + totalMahasiswa);
    }
    
    // Method statis
    public static boolean validasiNamaKampus(String nama) {
        return nama != null && !nama.matches(".*\\d.*");
    }
    
    public static void main(String[] args) {
        
    }
}
