/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package soal2;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author LENOVO
 */
class ManajemenMobil {
    private List<Mobil> daftarMobil = new ArrayList<>();
    
    public void tambah_mobil(Mobil mobil) {
        daftarMobil.add(mobil);
    }
    
    public void operasikan_semua_mobil() {
        for (Mobil mobil : daftarMobil) {
            mobil.nyalakan_mesin();
            mobil.matikan_mesin();
            System.out.println(); // Spasi antar mobil
        }
    }
}
