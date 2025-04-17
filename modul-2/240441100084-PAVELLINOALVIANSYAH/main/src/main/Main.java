/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author LENOVO
 */
public class Main {
    public static void main(String[] args) {
        // Membuat objek Kampus
        Kampus kampus = new Kampus("Universitas trunojoyo madura", "Jl. Raya Telang,PO BOX 02 Kec. Kamal, Bangkalan.");
        
        System.out.println("====== PROGRAM PENDAFTARAN MAHASISWA ======");
        
        try {
            // Contoh data yang akan error
            MataKuliah mkError = new MataKuliah("ERR01", "Mata Kuliah Error", 4);
        } catch (IllegalArgumentException e) {
            System.out.println("-> Sistem menolak mata kuliah dengan SKS tidak valid");
        }
        
        try {
        } catch (IllegalArgumentException e) {
            System.out.println("-> Sistem menolak mahasiswa dengan NIM tidak valid");
        }
        
        // Data yang valid
        try {
            System.out.println("\n\n====== DATA VALID ======");
            MataKuliah pbo = new MataKuliah("PBO01", "Pemrograman Berorientasi Objek", 3);
            MataKuliah web = new MataKuliah("WEB02", "Pemrograman Web", 2);
            MataKuliah db = new MataKuliah("DB03", "Basis Data", 3);
            MataKuliah alg = new MataKuliah("ALG04", "Algoritma", 2);
            MataKuliah stat = new MataKuliah("STAT05", "Statistika", 2);
            MataKuliah ai = new MataKuliah("AI06", "Kecerdasan Buatan", 3);
            MataKuliah cld = new MataKuliah("CLD07", "Cloud Computing", 3);
            MataKuliah mul = new MataKuliah("MUL08", "Multimedia", 2);

            
            Mahasiswa mhs1 = new Mahasiswa("Andi Wijaya", "2412345677", "Teknik Informatika");
            Mahasiswa mhs2 = new Mahasiswa("Budi Santoso", "2387654329", "Sistem Informasi");
            Mahasiswa mhs3 = new Mahasiswa("Citra Dewi", "2311223344", "Ilmu Komputer");
            Mahasiswa mhs4 = new Mahasiswa("Dewi Lestari", "2355667788", "Teknik Informatika");
            Mahasiswa mhs5 = new Mahasiswa("Eka Pratama", "2399887766", "Sistem Informasi");
            Mahasiswa mhs6 = new Mahasiswa("Fajar Nugraha", "2344556677", "Ilmu Komputer");
            
            // Tambahkan mata kuliah
            mhs1.tambahMataKuliah(pbo);
            mhs1.tambahMataKuliah(web);
            mhs1.tambahMataKuliah(db);
            mhs1.tambahMataKuliah(alg);
            mhs1.tambahMataKuliah(stat);
            mhs1.tambahMataKuliah(ai);
            mhs1.tambahMataKuliah(cld);
            mhs1.tambahMataKuliah(mul);
            
            mhs2.tambahMataKuliah(pbo);
            mhs2.tambahMataKuliah(web);
            mhs2.tambahMataKuliah(db);
            mhs2.tambahMataKuliah(alg);
            mhs2.tambahMataKuliah(stat);
            mhs2.tambahMataKuliah(ai);
            mhs2.tambahMataKuliah(cld);
            mhs2.tambahMataKuliah(mul);
            
            mhs3.tambahMataKuliah(pbo);
            mhs3.tambahMataKuliah(web);
            mhs3.tambahMataKuliah(db);
            mhs3.tambahMataKuliah(alg);
            mhs3.tambahMataKuliah(stat);
            mhs3.tambahMataKuliah(ai);
            mhs3.tambahMataKuliah(cld);
            mhs3.tambahMataKuliah(mul);
            
            mhs4.tambahMataKuliah(pbo);
            mhs4.tambahMataKuliah(web);
            mhs4.tambahMataKuliah(db);
            mhs4.tambahMataKuliah(alg);
            mhs4.tambahMataKuliah(stat);
            mhs4.tambahMataKuliah(ai);
            mhs4.tambahMataKuliah(cld);
            mhs4.tambahMataKuliah(mul);
            
            mhs5.tambahMataKuliah(pbo);
            mhs5.tambahMataKuliah(web);
            mhs5.tambahMataKuliah(db);
            mhs5.tambahMataKuliah(alg);
            mhs5.tambahMataKuliah(stat);
            mhs5.tambahMataKuliah(ai);
            mhs5.tambahMataKuliah(cld);
            mhs5.tambahMataKuliah(mul);
            
            mhs6.tambahMataKuliah(pbo);
            mhs6.tambahMataKuliah(web);
            mhs6.tambahMataKuliah(db);
            mhs6.tambahMataKuliah(alg);
            mhs6.tambahMataKuliah(stat);
            mhs6.tambahMataKuliah(ai);
            mhs6.tambahMataKuliah(cld);
            mhs6.tambahMataKuliah(mul);
            
            // Tampilkan biodata
            System.out.println("\n\n====== HASIL AKHIR ======");
            mhs1.tampilkanBiodata();
            mhs2.tampilkanBiodata();
            
        } catch (IllegalArgumentException e) {
            System.out.println("Terjadi error: " + e.getMessage());
        }

    }
}
