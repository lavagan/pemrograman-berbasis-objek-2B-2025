/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jalan;

/**
 *
 * @author LENOVO
 */
class MahasiswaBeasiswa extends Mahasiswa {
    private String jenisBeasiswa;

    public MahasiswaBeasiswa(String nama, String nim, String jenisBeasiswa) {
        super(nama, nim);
        this.jenisBeasiswa = jenisBeasiswa;
    }

    public void infoBeasiswa() {
        infoMahasiswa(); // Memanggil method dari parent class
        System.out.println("Jenis Beasiswa: " + jenisBeasiswa);
        System.out.println("------------------------");
    }
}
