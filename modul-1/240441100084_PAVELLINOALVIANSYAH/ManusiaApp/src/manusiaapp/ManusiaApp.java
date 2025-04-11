/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package manusiaapp;

/**
 *
 * @author LENOVO
 */
public class ManusiaApp {
    public static void main(String[] args) {
        // Membuat 5 objek Manusia
        Manusia orang1 = new Manusia("Andi", 25, "Jl. Merdeka No. 10");
        Manusia orang2 = new Manusia("Budi", 30, "Jl. Sudirman No. 5");
        Manusia orang3 = new Manusia("Citra", 22, "Jl. Gatot Subroto No. 15");
        Manusia orang4 = new Manusia("Dewi", 28, "Jl. Pahlawan No. 7");
        Manusia orang5 = new Manusia("Eka", 35, "Jl. Diponegoro No. 20");
        
        // pemanggilan method
        System.out.println(orang1.berjalan());
        System.out.println(orang1.berlari()); // Output: Andi sedang berjalan
        System.out.println(orang2.berlari());
        System.out.println(orang2.berjalan());// Output: Budi sedang berlari
        System.out.println(orang3.berjalan());
        System.out.println(orang3.berlari());// Output: Citra sedang berjalan
        System.out.println(orang4.berlari());
        System.out.println(orang4.berjalan());// Output: Dewi sedang berlari
        System.out.println(orang5.berjalan());
        System.out.println(orang5.berlari());// Output: Eka sedang berjalan
        
        // akses atribut (menggunakan getter)
        System.out.println("Umur " + orang1.getNama() + ": " + orang1.getUmur());
    }
}
