/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author LENOVO
 */
public class FictionBook extends Book implements Borrowable, Reservable {
    private String genre;
    private String borrower;
    private String reserver;
    private boolean borrowed;
    private boolean reserved;

    public FictionBook(String title, String author, String isbn, 
                      int publicationYear, String genre) {
        super(title, author, isbn, publicationYear);
        this.genre = genre;
    }

    @Override
    public String getBookType() {
        return "Fiction - " + genre;
    }

    // Borrowable implementation
    @Override
    public void borrow(String borrower) {
        if (isBorrowed()) {
            System.out.println("Buku '" + getTitle() + "' sudah dipinjam oleh " + this.borrower);
            return;
        }
        if (isReserved() && !borrower.equals(this.reserver)) {
            System.out.println("Buku '" + getTitle() + "' sudah direservasi oleh " + this.reserver);
            return;
        }
        this.borrower = borrower;
        this.borrowed = true;
        if (borrower.equals(this.reserver)) {
            cancelReservation();
        }
        System.out.println("Buku '" + getTitle() + "' berhasil dipinjam oleh " + borrower);
    }

    @Override
    public void returnBook() {
        if (!isBorrowed()) {
            System.out.println("Buku '" + getTitle() + "' tidak sedang dipinjam");
            return;
        }
        System.out.println("Buku '" + getTitle() + "' dikembalikan oleh " + borrower);
        this.borrower = null;
        this.borrowed = false;
    }

    @Override
    public boolean isBorrowed() {
        return borrowed;
    }

    @Override
    public String getBorrower() {
        return borrower;
    }

    // Reservable implementation
    @Override
    public void reserve(String reserver) {
        if (isReserved()) {
            System.out.println("Buku '" + getTitle() + "' sudah direservasi oleh " + this.reserver);
            return;
        }
        this.reserver = reserver;
        this.reserved = true;
        System.out.println("Buku '" + getTitle() + "' berhasil direservasi oleh " + reserver);
    }

    @Override
    public void cancelReservation() {
        if (!isReserved()) {
            System.out.println("Buku '" + getTitle() + "' tidak memiliki reservasi");
            return;
        }
        System.out.println("Reservasi buku '" + getTitle() + "' oleh " + reserver + " dibatalkan");
        this.reserver = null;
        this.reserved = false;
    }

    @Override
    public boolean isReserved() {
        return reserved;
    }

    @Override
    public String getReserver() {
        return reserver;
    }
}
