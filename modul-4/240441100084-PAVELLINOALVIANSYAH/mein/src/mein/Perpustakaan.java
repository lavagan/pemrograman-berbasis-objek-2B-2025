/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mein;
import java.util.ArrayList;
/**
 *
 * @author LENOVO
 */
public class Perpustakaan {
    private ArrayList<Buku> koleksiBuku;

    public Perpustakaan() {
        koleksiBuku = new ArrayList<>();
    }

    public void tambahBuku(Buku buku) {
        koleksiBuku.add(buku);
        System.out.println("Buku berhasil ditambahkan!");
    }

    public void tampilkanSemuaBuku() {
        if (koleksiBuku.isEmpty()) {
            System.out.println("Belum ada buku dalam perpustakaan.");
            return;
        }

        System.out.println("\nDaftar Buku di Perpustakaan:");
        System.out.println("=================================");
        for (int i = 0; i < koleksiBuku.size(); i++) {
            System.out.println("Buku #" + (i + 1));
            System.out.println(koleksiBuku.get(i).toString());
        }
        System.out.println("Total buku: " + koleksiBuku.size());
    }

    public Buku cariBuku(String judul) {
        for (Buku buku : koleksiBuku) {
            if (buku.getJudul().equalsIgnoreCase(judul)) {
                return buku;
            }
        }
        return null;
    }

    public boolean hapusBuku(String judul) {
        Buku buku = cariBuku(judul);
        if (buku != null) {
            koleksiBuku.remove(buku);
            return true;
        }
        return false;
    }
}
