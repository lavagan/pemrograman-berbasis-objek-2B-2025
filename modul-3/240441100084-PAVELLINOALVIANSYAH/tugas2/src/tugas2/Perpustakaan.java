/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author LENOVO
 */
class Perpustakaan {
    private ArrayList<BukuFiksi> koleksiFiksi;
    private ArrayList<BukuNonFiksi> koleksiNonFiksi;
    private Scanner scanner;

    public Perpustakaan() {
        koleksiFiksi = new ArrayList<>();
        koleksiNonFiksi = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void menuUtama() {
        while (true) {
        System.out.println("\n=== SISTEM MANAJEMEN PERPUSTAKAAN ===");
        System.out.println("1. Tambah Buku");
        System.out.println("2. Lihat Koleksi");
        System.out.println("3. Pinjam Buku");
        System.out.println("4. Kembalikan Buku");
        System.out.println("5. Keluar");
        System.out.print("Pilihan: ");

        try {
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (pilihan) {
                case 1:
                    tambahBuku();
                    break;
                case 2:
                    tampilkanKoleksi();
                    break;
                case 3:
                    pinjamBuku();
                    break;
                case 4:
                    kembalikanBuku();
                    break;
                case 5:
                    System.out.println("Terima kasih!");
                    return;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } catch (InputMismatchException e) {
            System.out.println("Input tidak valid! Harap masukkan angka.");
            scanner.nextLine(); // clear invalid input
        }
    }    }

 private void tambahBuku() {
    System.out.println("\nTambah Buku Baru");
    System.out.println("1. Buku Fiksi");
    System.out.println("2. Buku Non-Fiksi");
    System.out.print("Pilih jenis buku: ");
    
    try {
        int jenis = scanner.nextInt();
        scanner.nextLine(); // consume newline

        System.out.print("Judul: ");
        String judul = scanner.nextLine();
        System.out.print("Penulis: ");
        String penulis = scanner.nextLine();

        if (jenis == 1) {
            System.out.print("Genre: ");
            String genre = scanner.nextLine();
            BukuFiksi buku = new BukuFiksi(judul, penulis, genre);
            koleksiFiksi.add(buku);
            System.out.println("Buku fiksi berhasil ditambahkan!");
        } else if (jenis == 2) {
            System.out.print("Topik: ");
            String topik = scanner.nextLine();
            BukuNonFiksi buku = new BukuNonFiksi(judul, penulis, topik);
            koleksiNonFiksi.add(buku);
            System.out.println("Buku non-fiksi berhasil ditambahkan!");
        } else {
            System.out.println("Pilihan tidak valid!");
        }
    } catch (InputMismatchException e) {
        System.out.println("Input tidak valid! Harap masukkan angka.");
        scanner.nextLine(); // clear invalid input
    }
}

    public void tampilkanKoleksi() {
        System.out.println("\n=== KOLEKSI BUKU ===");
        
        System.out.println("\nBuku Fiksi:");
        if (koleksiFiksi.isEmpty()) {
            System.out.println("Belum ada buku fiksi");
        } else {
            for (int i = 0; i < koleksiFiksi.size(); i++) {
                System.out.print((i+1) + ". ");
                koleksiFiksi.get(i).infoFiksi();
            }
        }
        
        System.out.println("\nBuku Non-Fiksi:");
        if (koleksiNonFiksi.isEmpty()) {
            System.out.println("Belum ada buku non-fiksi");
        } else {
            for (int i = 0; i < koleksiNonFiksi.size(); i++) {
                System.out.print((i+1) + ". ");
                koleksiNonFiksi.get(i).infoNonFiksi();
            }
        }
    }

    private void pinjamBuku() {
        tampilkanKoleksi();
        System.out.print("\nPilih jenis buku (1-Fiksi/2-NonFiksi): ");
        int jenis = scanner.nextInt();
        System.out.print("Nomor buku: ");
        int nomor = scanner.nextInt() - 1;

        if (jenis == 1 && nomor >= 0 && nomor < koleksiFiksi.size()) {
            koleksiFiksi.get(nomor).pinjam();
        } else if (jenis == 2 && nomor >= 0 && nomor < koleksiNonFiksi.size()) {
            koleksiNonFiksi.get(nomor).pinjam();
        } else {
            System.out.println("Pilihan tidak valid!");
        }
    }

    private void kembalikanBuku() {
        tampilkanKoleksi();
        System.out.print("\nPilih jenis buku (1-Fiksi/2-NonFiksi): ");
        int jenis = scanner.nextInt();
        System.out.print("Nomor buku: ");
        int nomor = scanner.nextInt() - 1;

        if (jenis == 1 && nomor >= 0 && nomor < koleksiFiksi.size()) {
            koleksiFiksi.get(nomor).kembalikan();
        } else if (jenis == 2 && nomor >= 0 && nomor < koleksiNonFiksi.size()) {
            koleksiNonFiksi.get(nomor).kembalikan();
        } else {
            System.out.println("Pilihan tidak valid!");
        }
    }
}