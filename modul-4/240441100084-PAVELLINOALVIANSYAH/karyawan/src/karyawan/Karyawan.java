/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package karyawan;

/**
 *
 * @author LENOVO
 */
public class Karyawan {

    /**
     * @param args the command line arguments
     */
    private String nama;
    private double gaji;
    
    public Karyawan(String nama, double gaji){
        this.nama = nama;
        setgaji(gaji);
    }
    public double getgaji(){
        return gaji;
    }
    public String getnama(){
        return nama;
    }
    public void setnama(String nama){
        this.nama = nama;
    }
     public void setgaji(doubel gaji){
         if (gaji < 0){
             
         }
     }
    


}
