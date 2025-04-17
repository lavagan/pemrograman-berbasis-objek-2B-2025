/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author LENOVO
 */
public class Mahasiswa {
    // Atribut instance
    // Instance attributes
    private String nama;
    private String nim;
    private String prodi;
    private List<MataKuliah> mataKuliahDiambil;
    private static int totalMahasiswa = 0;
    
    public Mahasiswa(String nama, String nim, String prodi) {
        if (!validasiNIM(nim)) {
            System.out.println("\n❌ Gagal membuat mahasiswa:");
            System.out.println("Nama: " + nama);
            System.out.println("NIM '" + nim + "' tidak valid!");
            System.out.println("Syarat NIM: Harus dimulai dengan '23' dan 10 digit angka");
            throw new IllegalArgumentException("NIM tidak valid");
        }
        
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
        this.mataKuliahDiambil = new ArrayList<>();
        totalMahasiswa++;
        
        System.out.println("\n✅ Berhasil membuat mahasiswa:");
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Prodi: " + prodi);
    }
    
    // Class attribute

    
    // Constructor

    
    // Instance methods
    public void tambahMataKuliah(MataKuliah mk) {
        mataKuliahDiambil.add(mk);
    }
    
    public void tampilkanBiodata() {
        System.out.println("\n=== BIODATA MAHASISWA ===");
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Prodi: " + prodi);
        System.out.println("Mata Kuliah Diambil:");
        for (MataKuliah mk : mataKuliahDiambil) {
            System.out.println("- " + mk.getNama() + " (" + mk.getSks() + " SKS)");
        }
    }
    
    
    // Getters
    public String getNama() { return nama; }
    public String getNim() { return nim; }
    public String getProdi() { return prodi; }
    public List<MataKuliah> getMataKuliahDiambil() { return mataKuliahDiambil; }
    
    // Class method
    public static int getTotalMahasiswa() {
        return totalMahasiswa;
    }
    
    // Static validation method
    public static boolean validasiNIM(String nim) {
        return nim != null && nim.startsWith("23") && nim.length() == 10 && nim.matches("\\d+");
    
    }

    


}
