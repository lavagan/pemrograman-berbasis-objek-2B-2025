/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal1;

/**
 *
 * @author LENOVO
 */
public class Soal1 {
    public static void main(String[] args) {
        Manusia joko = new Joko();
        Manusia beni = new Beni();
        Manusia fani = new Fani();
        Manusia jani = new Jani();
        
        System.out.println("=== Perilaku Joko ===");
        joko.berbicara();
        joko.bekerja();
        joko.makan();
        
        System.out.println("\n=== Perilaku Beni ===");
        beni.berbicara();
        beni.bekerja();
        beni.makan();
        
        System.out.println("\n=== Perilaku Fani ===");
        fani.berbicara();
        fani.bekerja();
        fani.makan();
        
        System.out.println("\n=== Perilaku Jani ===");
        jani.berbicara();
        jani.bekerja();
        jani.makan();
    }
}
