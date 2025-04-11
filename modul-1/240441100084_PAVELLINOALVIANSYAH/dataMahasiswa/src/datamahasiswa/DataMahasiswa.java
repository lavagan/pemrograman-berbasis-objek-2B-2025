/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package datamahasiswa;

import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class DataMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Membuat array untuk menyimpan 3 objek mahasiswa
        Mahasiswa[] daftarMahasiswa = new Mahasiswa[3];
        
        // Input data untuk 3 mahasiswa
        for (int i = 0; i < 3; i++) {
            System.out.println("\nMasukkan data mahasiswa ke-" + (i+1));
            System.out.print("Nama: ");
            String nama = input.nextLine();
            
            System.out.print("NIM: ");
            String nim = input.nextLine();
            
            System.out.print("Jurusan/Prodi: ");
            String jurusan = input.nextLine();
            
            System.out.print("Alamat: ");
            String alamat = input.nextLine();
            
            // Membuat objek mahasiswa dan simpan ke array
            daftarMahasiswa[i] = new Mahasiswa(nama, nim, jurusan, alamat);
        }
        
        // Menampilkan info semua mahasiswa
        System.out.println("\n=== Data Mahasiswa ===");
        for (Mahasiswa mhs : daftarMahasiswa) {
            System.out.println("\n" + mhs.getInfo());
        }
        
        input.close();
    }
}
