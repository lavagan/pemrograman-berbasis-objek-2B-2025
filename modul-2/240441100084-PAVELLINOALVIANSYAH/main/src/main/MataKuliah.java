/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author LENOVO
 */
public class MataKuliah {
    // Atribut instance
    private String kode;
    private String nama;
    private int sks;
    
    // Constructor
     public MataKuliah(String kode, String nama, int sks) {
        if (!validasiSKS(sks)) {
            System.out.println("\n❌ Gagal membuat mata kuliah:");
            System.out.println("Kode: " + kode);
            System.out.println("Nama: " + nama);
            System.out.println("SKS '" + sks + "' tidak valid!");
            System.out.println("Syarat SKS: Harus 2 atau 3");
            throw new IllegalArgumentException("SKS tidak valid");
        }
        
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        
        System.out.println("\n✅ Berhasil membuat mata kuliah:");
        System.out.println("Kode: " + kode);
        System.out.println("Nama: " + nama);
        System.out.println("SKS: " + sks);
    }
    
    // Getter
    public String getKode() { return kode; }
    public String getNama() { return nama; }
    public int getSks() { return sks; }
    
    // Method statis
    public static boolean validasiSKS(int sks) {
        return sks == 2 || sks == 3;
    }
}
