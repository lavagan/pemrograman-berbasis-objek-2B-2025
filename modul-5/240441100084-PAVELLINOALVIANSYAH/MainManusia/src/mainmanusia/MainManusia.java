/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mainmanusia;

/**
 *
 * @author LENOVO
 */
public class MainManusia {
    public static void main(String[] args) {
        // Create objects
        Manusia joko = new Joko();
        Manusia beni = new Beni();
        Manusia fani = new Fani();
        Manusia jani = new Jani();
        
        // Joko's activities
        System.out.println("=== Aktivitas Joko ===");
        joko.berbicara();
        joko.bekerja();
        joko.makan();
        
        // Beni's activities
        System.out.println("\n=== Aktivitas Beni ===");
        beni.berbicara();
        beni.bekerja();
        beni.makan();
        
        // Fani's activities
        System.out.println("\n=== Aktivitas Fani ===");
        fani.berbicara();
        fani.bekerja();
        fani.makan();
        
        // Jani's activities
        System.out.println("\n=== Aktivitas Jani ===");
        jani.berbicara();
        jani.bekerja();
        jani.makan();
    }
}
