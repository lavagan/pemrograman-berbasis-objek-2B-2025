/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

/**
 *
 * @author LENOVO
 */
public class Main {
    public static void main(String[] args) {
        // Inisialisasi library
        LibraryManager library = new LibraryManager();

        // Menambahkan buku-buku
        library.addBook(new FictionBook("Laskar Pelangi", "Andrea Hirata", "9789793062792", 2005, "Novel"));
        library.addBook(new FictionBook("Bumi Manusia", "Pramoedya Ananta Toer", "9789798659258", 1980, "Historical Fiction"));
        library.addBook(new ReferenceBook("Ensiklopedia Indonesia", "Tim Redaksi", "9789792226321", 2010, "General Knowledge"));
        library.addBook(new ReferenceBook("Kamus Besar Bahasa Indonesia", "Pusat Bahasa", "9789794071823", 2008, "Language"));

        // Menampilkan semua buku
        library.displayAllBooks();

        // Simulasi peminjaman dan reservasi
        System.out.println("\n=== SIMULASI PEMINJAMAN ===");
        library.borrowBook("9789793062792", "Andi");
        library.borrowBook("9789798659258", "Budi");
        library.borrowBook("9789792226321", "Cici"); // Buku referensi tidak bisa dipinjam
        library.reserveBook("9789792226321", "Dedi");

        // Menampilkan status
        library.displayBorrowedBooks();
        library.displayReservedBooks();

        // Simulasi pengembalian dan pembatalan
        System.out.println("\n=== SIMULASI PENGEMBALIAN ===");
        library.returnBook("9789793062792");
        library.cancelReservation("9789792226321");

        // Menampilkan status terakhir
        library.displayAllBooks();
    }
}