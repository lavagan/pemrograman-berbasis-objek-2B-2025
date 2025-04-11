/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tree.kewan.sejoli;

/**
 *
 * @author LENOVO
 */
public class anjing {
    // Atribut
    private String nama;
    private String ras;
    private boolean isGalak;
    
    // Constructor
    public Anjing(String nama, String ras, boolean isGalak) {
        this.nama = nama;
        this.ras = ras;
        this.isGalak = isGalak;
    }
    
    // Method
    public void menggonggong() {
        System.out.println(nama + " (" + ras + "): Woof! Woof!");
    }
    
    public void kejarPencuri() {
        System.out.println(nama + (isGalak ? " menggeram!" : " hanya mengendus."));
    }
}
