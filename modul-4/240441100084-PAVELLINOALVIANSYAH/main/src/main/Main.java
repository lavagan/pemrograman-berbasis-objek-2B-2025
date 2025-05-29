/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

/**
 *
 * @author LENOVO
 */
public class Main {

    
    public static void main(String[] args) {
    karyawan k1 = new karyawan( "josa", 500);
    karyawan k2 = new karyawan( "fatih", 1500);
    
    System.out.println("data karyawan");
    System.out.println(k1.getnama() + "gaji: Rp" + k1.getgaji());
    System.out.println(k2.getnama() + "gaji: Rp" + k2.getgaji());
  
        // TODO code application logic here
    }
    
}
