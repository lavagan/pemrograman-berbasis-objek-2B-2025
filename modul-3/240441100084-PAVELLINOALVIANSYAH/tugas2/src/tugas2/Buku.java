/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2;

/**
 *
 * @author LENOVO
 */
class Buku {
    protected String judul;
    protected String penulis;
    protected boolean statusPinjam;

    public Buku(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
        this.statusPinjam = false;
    }

    public void info() {
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
        System.out.println("Status: " + (statusPinjam ? "Dipinjam" : "Tersedia"));
    }

    public void pinjam() {
        if (statusPinjam) {
            System.out.println("Buku '" + judul + "' sedang dipinjam");
        } else {
            statusPinjam = true;
            System.out.println("Buku '" + judul + "' berhasil dipinjam");
        }
    }

    public void kembalikan() {
        if (!statusPinjam) {
            System.out.println("Buku '" + judul + "' sudah tersedia");
        } else {
            statusPinjam = false;
            System.out.println("Buku '" + judul + "' berhasil dikembalikan");
        }
    }
}
