/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mien;
import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author LENOVO
 */
public class Mien {
public static void main(String[] args) {
        Klinik klinik = new Klinik();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\nSistem Manajemen Klinik");
            System.out.println("1. Tambah Pasien");
            System.out.println("2. Tampilkan Semua Pasien");
            System.out.println("3. Cari Pasien");
            System.out.println("4. Hapus Pasien");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            
            try {
                int pilihan = scanner.nextInt();
                scanner.nextLine(); // Membersihkan newline
                
                switch (pilihan) {
                    case 1:
                        tambahPasienHandler(klinik, scanner);
                        break;
                    case 2:
                        klinik.tampilkanSemuaPasien();
                        break;
                    case 3:
                        cariPasienHandler(klinik, scanner);
                        break;
                    case 4:
                        hapusPasienHandler(klinik, scanner);
                        break;
                    case 5:
                        System.out.println("Terima kasih telah menggunakan sistem klinik.");
                        scanner.close();
                        System.exit(0);
                    default:
                        System.out.println("Pilihan tidak valid! Silakan pilih 1-5.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Masukkan harus berupa angka (1-5)!");
                scanner.nextLine(); // Membersihkan input yang salah
            }
        }
    }

    private static void tambahPasienHandler(Klinik klinik, Scanner scanner) {
        System.out.print("Masukkan nama pasien: ");
        String nama = scanner.nextLine();
        
        int umur = 0;
        boolean validUmur = false;
        while (!validUmur) {
            try {
                System.out.print("Masukkan umur pasien: ");
                umur = scanner.nextInt();
                scanner.nextLine(); // Membersihkan newline
                
                if (umur <= 0) {
                    System.out.println("Error: Umur harus lebih dari 0!");
                } else {
                    validUmur = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Umur harus berupa angka!");
                scanner.nextLine(); // Membersihkan input yang salah
            }
        }
        
        System.out.print("Masukkan keluhan pasien: ");
        String keluhan = scanner.nextLine();
        
        klinik.tambahPasien(new Pasien(nama, umur, keluhan));
    }

    private static void cariPasienHandler(Klinik klinik, Scanner scanner) {
        System.out.print("Masukkan nama pasien yang dicari: ");
        String nama = scanner.nextLine();
        
        Pasien pasien = klinik.cariPasien(nama);
        if (pasien != null) {
            System.out.println("\nData pasien ditemukan:");
            System.out.println(pasien.toString());
        } else {
            System.out.println("Pasien dengan nama '" + nama + "' tidak ditemukan.");
        }
    }

    private static void hapusPasienHandler(Klinik klinik, Scanner scanner) {
        System.out.print("Masukkan nama pasien yang akan dihapus: ");
        String nama = scanner.nextLine();
        
        if (klinik.hapusPasien(nama)) {
            System.out.println("Data pasien berhasil dihapus.");
        } else {
            System.out.println("Pasien dengan nama '" + nama + "' tidak ditemukan.");
        }
    } 
}
