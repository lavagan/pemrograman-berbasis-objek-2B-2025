/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jalan;

/**
 *
 * @author LENOVO
 */
class Mahasiswa {
    protected String nama;
    protected String nim;

    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public void infoMahasiswa() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
    }
}
