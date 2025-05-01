/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jalan;

/**
 *
 * @author LENOVO
 */
class MahasiswaReguler extends Mahasiswa {
    private String kelas;

    public MahasiswaReguler(String nama, String nim, String kelas) {
        super(nama, nim);
        this.kelas = kelas;
    }

    public void infoReguler() {
        infoMahasiswa(); // Memanggil method dari parent class
        System.out.println("Kelas: " + kelas);
        System.out.println("------------------------");
    }
}
