/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manusiaapp;

/**
 *
 * @author LENOVO
 */
public class Manusia {
    // Atribut
    private String nama;
    private int umur;
    private String alamat;
    
    // Constructor
    public Manusia(String nama, int umur, String alamat) {
        this.nama = nama;
        this.umur = umur;
        this.alamat = alamat;
    }
    
    // Method berjalan()
    public String berjalan() {
        return nama + " sedang berjalan";
    }
    
    // Method berlari()
    public String berlari() {
        return nama + " sedang berlari";
    }
    
    // Getter untuk atribut (opsional)
    public String getNama() {
        return nama;
    }
    
    public int getUmur() {
        return umur;
    }
    
    public String getAlamat() {
        return alamat;
    }
}

