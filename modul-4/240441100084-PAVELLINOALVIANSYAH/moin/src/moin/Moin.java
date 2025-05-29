/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package moin;
import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author LENOVO
 */
public class Moin {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\nSistem Bank");
            System.out.println("1. Tambah Rekening");
            System.out.println("2. Setor");
            System.out.println("3. Tarik");
            System.out.println("4. Transfer");
            System.out.println("5. Hapus Rekening");
            System.out.println("6. Tampilkan Semua Rekening");
            System.out.println("7. Keluar");
            System.out.print("Pilih menu: ");
            
            try {
                int pilihan = scanner.nextInt();
                scanner.nextLine(); // consume newline
                
                switch (pilihan) {
                    case 1:
                        tambahRekening(bank, scanner);
                        break;
                        
                    case 2:
                        transaksi(bank, scanner, "setor");
                        break;
                        
                    case 3:
                        transaksi(bank, scanner, "tarik");
                        break;
                        
                    case 4:
                        transfer(bank, scanner);
                        break;
                        
                    case 5:
                        hapusRekening(bank, scanner);
                        break;
                        
                    case 6:
                        bank.tampilkanSemuaRekening();
                        break;
                        
                    case 7:
                        System.out.println("Terima kasih telah menggunakan sistem bank");
                        scanner.close();
                        System.exit(0);
                        
                    default:
                        System.out.println("Pilihan tidak valid (harus 1-7)");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Masukkan harus angka untuk pilihan menu");
                scanner.nextLine(); // clear invalid input
            }
        }
    }

    private static void tambahRekening(Bank bank, Scanner scanner) {
        System.out.print("No Rekening: ");
        String noRek = scanner.nextLine();
        System.out.print("Nama Pemilik: ");
        String nama = scanner.nextLine();
        
        double saldo = 0;
        boolean valid = false;
        while (!valid) {
            try {
                System.out.print("Saldo Awal: ");
                saldo = scanner.nextDouble();
                scanner.nextLine(); // consume newline
                valid = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: Masukkan harus angka untuk saldo");
                scanner.nextLine(); // clear invalid input
            }
        }
        
        bank.tambahRekening(new RekeningBank(noRek, nama, saldo));
    }

    private static void transaksi(Bank bank, Scanner scanner, String jenis) {
        System.out.print("No Rekening: ");
        String noRek = scanner.nextLine();
        
        double jumlah = 0;
        boolean valid = false;
        while (!valid) {
            try {
                System.out.print("Jumlah " + (jenis.equals("setor") ? "Setor" : "Tarik") + ": ");
                jumlah = scanner.nextDouble();
                scanner.nextLine(); // consume newline
                valid = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: Masukkan harus angka untuk jumlah transaksi");
                scanner.nextLine(); // clear invalid input
            }
        }
        
        if (jenis.equals("setor")) {
            bank.setor(noRek, jumlah);
        } else {
            bank.tarik(noRek, jumlah);
        }
    }

    private static void transfer(Bank bank, Scanner scanner) {
        System.out.print("No Rekening Asal: ");
        String noRekAsal = scanner.nextLine();
        System.out.print("No Rekening Tujuan: ");
        String noRekTujuan = scanner.nextLine();
        
        double jumlah = 0;
        boolean valid = false;
        while (!valid) {
            try {
                System.out.print("Jumlah Transfer: ");
                jumlah = scanner.nextDouble();
                scanner.nextLine(); // consume newline
                valid = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: Masukkan harus angka untuk jumlah transfer");
                scanner.nextLine(); // clear invalid input
            }
        }
        
        bank.transfer(noRekAsal, noRekTujuan, jumlah);
    }

    private static void hapusRekening(Bank bank, Scanner scanner) {
        System.out.print("No Rekening yang akan dihapus: ");
        String noRek = scanner.nextLine();
        bank.hapusRekening(noRek);
    }
}
