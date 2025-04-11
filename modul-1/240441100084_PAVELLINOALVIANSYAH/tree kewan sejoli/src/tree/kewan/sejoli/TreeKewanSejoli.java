/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tree.kewan.sejoli;
import java.util.ArrayList;
/**
 *
 * @author LENOVO
 */
public class TreeKewanSejoli {
    public static void main(String[] args) {
        // List untuk menyimpan objek hewan
        ArrayList<Object> hewan = new ArrayList<>();
        
        // Tambahkan 3 Kucing
        for (int i = 1; i <= 3; i++) {
            hewan.add(new Kucing("Kucing " + i, "Oranye", i + 1));
        }
        
        // Tambahkan 3 Anjing
        hewan.add(new Anjing("Doggy", "Golden Retriever", false));
        hewan.add(new Anjing("Blacky", "Doberman", true));
        hewan.add(new Anjing("Bobby", "Bulldog", false));
        
        // Tambahkan 3 Burung
        hewan.add(new Burung("Merpati", true, "Abu-abu"));
        hewan.add(new Burung("Penguin", false, "Hitam-putih"));
        hewan.add(new Burung("Kakak Tua", true, "Merah-hijau"));
        
        // Loop untuk panggil method tiap hewan
        for (Object obj : hewan) {
            if (obj instanceof Kucing) {
                Kucing k = (Kucing) obj;
                k.mengeong();
                k.lari();
            } else if (obj instanceof Anjing) {
                Anjing a = (Anjing) obj;
                a.menggonggong();
                a.kejarPencuri();
            } else if (obj instanceof Burung) {
                Burung b = (Burung) obj;
                b.berkicau();
                b.terbang();
            }
            System.out.println("------------------");
        }
    }
}
