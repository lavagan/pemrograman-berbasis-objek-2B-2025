/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author LENOVO
 */
public class ReferenceBook extends Book implements Reservable {
    private String subject;
    private String reserver;
    private boolean reserved;

    public ReferenceBook(String title, String author, String isbn, 
                       int publicationYear, String subject) {
        super(title, author, isbn, publicationYear);
        this.subject = subject;
    }

    @Override
    public String getBookType() {
        return "Reference - " + subject;
    }

    // Reservable implementation
    @Override
    public void reserve(String reserver) {
        if (isReserved()) {
            System.out.println("Buku referensi '" + getTitle() + "' sudah direservasi oleh " + this.reserver);
            return;
        }
        this.reserver = reserver;
        this.reserved = true;
        System.out.println("Buku referensi '" + getTitle() + "' berhasil direservasi oleh " + reserver);
    }

    @Override
    public void cancelReservation() {
        if (!isReserved()) {
            System.out.println("Buku referensi '" + getTitle() + "' tidak memiliki reservasi");
            return;
        }
        System.out.println("Reservasi buku referensi '" + getTitle() + "' oleh " + reserver + " dibatalkan");
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
