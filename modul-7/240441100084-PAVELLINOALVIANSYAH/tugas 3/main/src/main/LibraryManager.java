/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author LENOVO
 */


public class LibraryManager {
    private List<Book> books;
    private List<Borrowable> borrowedBooks;
    private List<Reservable> reservedBooks;

    public LibraryManager() {
        this.books = new ArrayList<>();
        this.borrowedBooks = new ArrayList<>();
        this.reservedBooks = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        if (book instanceof Borrowable) {
            borrowedBooks.add((Borrowable) book);
        }
        if (book instanceof Reservable) {
            reservedBooks.add((Reservable) book);
        }
    }

    public void borrowBook(String isbn, String borrower) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                if (book instanceof Borrowable) {
                    ((Borrowable) book).borrow(borrower);
                } else {
                    System.out.println("Buku referensi tidak bisa dipinjam, hanya bisa direservasi");
                }
                return;
            }
        }
        System.out.println("Buku dengan ISBN " + isbn + " tidak ditemukan");
    }

    public void returnBook(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                if (book instanceof Borrowable) {
                    ((Borrowable) book).returnBook();
                } else {
                    System.out.println("Buku referensi tidak bisa dikembalikan karena tidak dipinjam");
                }
                return;
            }
        }
        System.out.println("Buku dengan ISBN " + isbn + " tidak ditemukan");
    }

    public void reserveBook(String isbn, String reserver) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                if (book instanceof Reservable) {
                    ((Reservable) book).reserve(reserver);
                } else {
                    System.out.println("Buku ini tidak bisa direservasi");
                }
                return;
            }
        }
        System.out.println("Buku dengan ISBN " + isbn + " tidak ditemukan");
    }

    public void cancelReservation(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                if (book instanceof Reservable) {
                    ((Reservable) book).cancelReservation();
                } else {
                    System.out.println("Buku ini tidak memiliki reservasi");
                }
                return;
            }
        }
        System.out.println("Buku dengan ISBN " + isbn + " tidak ditemukan");
    }

    public void displayAllBooks() {
        System.out.println("\n=== DAFTAR SEMUA BUKU ===");
        for (Book book : books) {
            System.out.println(book);
            if (book instanceof Borrowable && ((Borrowable) book).isBorrowed()) {
                System.out.println("  [Status: Dipinjam oleh " + ((Borrowable) book).getBorrower() + "]");
            }
            if (book instanceof Reservable && ((Reservable) book).isReserved()) {
                System.out.println("  [Status: Direservasi oleh " + ((Reservable) book).getReserver() + "]");
            }
        }
    }

    public void displayBorrowedBooks() {
        System.out.println("\n=== DAFTAR BUKU YANG DIPINJAM ===");
        boolean found = false;
        for (Borrowable book : borrowedBooks) {
            if (book.isBorrowed()) {
                System.out.println(((Book) book).getTitle() + " - Dipinjam oleh: " + book.getBorrower());
                found = true;
            }
        }
        if (!found) {
            System.out.println("Tidak ada buku yang sedang dipinjam");
        }
    }

    public void displayReservedBooks() {
        System.out.println("\n=== DAFTAR BUKU YANG DIRESERVASI ===");
        boolean found = false;
        for (Reservable book : reservedBooks) {
            if (book.isReserved()) {
                System.out.println(((Book) book).getTitle() + " - Direservasi oleh: " + book.getReserver());
                found = true;
            }
        }
        if (!found) {
            System.out.println("Tidak ada buku yang direservasi");
        }
    }
}
