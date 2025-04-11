/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datamahasiswa;

/**
 *
 * @author LENOVO
 */
public class Mahasiswa {
// Atribut
    private String nama;
    private String nim;
    private String jurusan;
    private String alamat;
    
    // Constructor
    public Mahasiswa(String nama, String nim, String jurusan, String alamat) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.alamat = alamat;
    }
    
    // Method untuk menampilkan info mahasiswa
    public String getInfo() {
        return "Nama: " + nama + 
               "\nNIM: " + nim + 
               "\nJurusan/Prodi: " + jurusan + 
               "\nAlamat: " + alamat;
    }   
}
