/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tree.kewan.sejoli;

/**
 *
 * @author LENOVO
 */
public class burung {
    // Atribut
    private String jenis;
    private boolean bisaTerbang;
    private String warnaBulu;
    
    // Constructor
    public Burung(String jenis, boolean bisaTerbang, String warnaBulu) {
        this.jenis = jenis;
        this.bisaTerbang = bisaTerbang;
        this.warnaBulu = warnaBulu;
    }
    
    // Method
    public void berkicau() {
        System.out.println(jenis + " (" + warnaBulu + "): Cit! Cit!");
    }
    
    public void terbang() {
        System.out.println(jenis + (bisaTerbang ? " terbang tinggi!" : " hanya melompat."));
    }    
}
