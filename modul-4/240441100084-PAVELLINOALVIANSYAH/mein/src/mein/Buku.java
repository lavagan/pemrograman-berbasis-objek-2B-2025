/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mein;

/**
 *
 * @author LENOVO
 */
public class Buku {
    private String judul;
    private String penulis;
    private int jumlahHalaman;

    public Buku(String judul, String penulis, int jumlahHalaman) {
        this.judul = judul;
        this.penulis = penulis;
        this.jumlahHalaman = jumlahHalaman;
    }

    // Getter methods
    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public int getJumlahHalaman() {
        return jumlahHalaman;
    }

    @Override
    public String toString() {
        return "Judul: " + judul + 
               "\nPenulis: " + penulis + 
               "\nJumlah Halaman: " + jumlahHalaman +
               "\n-----------------------------";
    }
}
