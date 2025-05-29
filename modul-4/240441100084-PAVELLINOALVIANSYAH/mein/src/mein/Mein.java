/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mein;
import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author LENOVO
 */
public class Mein {
    public static void main(String[] args) {
        Perpustakaan perpustakaan = new Perpustakaan();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\nSistem Perpustakaan");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Tampilkan Semua Buku");
            System.out.println("3. Cari Buku");
            System.out.println("4. Hapus Buku");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            
            try {
                int pilihan = scanner.nextInt();
                scanner.nextLine(); // Membersihkan newline
                
                switch (pilihan) {
                    case 1:
                        tambahBukuHandler(perpustakaan, scanner);
                        break;
                    case 2:
                        perpustakaan.tampilkanSemuaBuku();
                        break;
                    case 3:
                        cariBukuHandler(perpustakaan, scanner);
                        break;
                    case 4:
                        hapusBukuHandler(perpustakaan, scanner);
                        break;
                    case 5:
                        System.out.println("Terima kasih telah menggunakan sistem perpustakaan.");
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

    private static void tambahBukuHandler(Perpustakaan perpustakaan, Scanner scanner) {
        System.out.print("Masukkan judul buku: ");
        String judul = scanner.nextLine();
        
        System.out.print("Masukkan nama penulis: ");
        String penulis = scanner.nextLine();
        
        int jumlahHalaman = 0;
        boolean valid = false;
        while (!valid) {
            try {
                System.out.print("Masukkan jumlah halaman: ");
                jumlahHalaman = scanner.nextInt();
                scanner.nextLine(); // Membersihkan newline
                valid = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: Jumlah halaman harus berupa angka!");
                scanner.nextLine(); // Membersihkan input yang salah
            }
        }
        
        perpustakaan.tambahBuku(new Buku(judul, penulis, jumlahHalaman));
    }

    private static void cariBukuHandler(Perpustakaan perpustakaan, Scanner scanner) {
        System.out.print("Masukkan judul buku yang dicari: ");
        String judul = scanner.nextLine();
        
        Buku buku = perpustakaan.cariBuku(judul);
        if (buku != null) {
            System.out.println("\nBuku ditemukan:");
            System.out.println(buku.toString());
        } else {
            System.out.println("Buku dengan judul '" + judul + "' tidak ditemukan.");
        }
    }

    private static void hapusBukuHandler(Perpustakaan perpustakaan, Scanner scanner) {
        System.out.print("Masukkan judul buku yang akan dihapus: ");
        String judul = scanner.nextLine();
        
        if (perpustakaan.hapusBuku(judul)) {
            System.out.println("Buku berhasil dihapus.");
        } else {
            System.out.println("Buku dengan judul '" + judul + "' tidak ditemukan.");
        }
    }
    
}
