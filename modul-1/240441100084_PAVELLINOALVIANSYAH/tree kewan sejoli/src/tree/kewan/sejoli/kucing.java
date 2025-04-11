/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tree.kewan.sejoli;

/**
 *
 * @author LENOVO
 */
public class kucing {
    // Atribut
    private String nama;
    private String warna;
    private int umur;
    
    // Constructor
    public Kucing(String nama, String warna, int umur) {
        this.nama = nama;
        this.warna = warna;
        this.umur = umur;
    }
    
    // Method
    public void mengeong() {
        System.out.println(nama + " (Kucing " + warna + "): Meonggg!");
    }
    
    public void lari() {
        System.out.println(nama + " berlari cepat!");
    }
}
