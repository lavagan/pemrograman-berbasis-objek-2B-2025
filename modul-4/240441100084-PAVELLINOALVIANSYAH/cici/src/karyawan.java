/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class karyawan {
        private String nama;
    private double gaji;
    
    public karyawan(String nama, double gaji){
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
     public void setgaji(double gaji){
         if (gaji < 0){
             System.out.println("gaji tidak boleh ");
             this.gaji = 0;
         }else{
             this.gaji = gaji;
         }
     }
    
    public static void main(String[] args) {
    karyawan k1 = new karyawan( "josa", 500);
    karyawan k2 = new karyawan( "fatih", 1500);
    
    System.out.println("data karyawan");
    System.out.println(k1.getnama() + "gaji: Rp" + k1.getgaji());
    System.out.println(k2.getnama() + "gaji: Rp" + k2.getgaji());
  
        // TODO code application logic here
    }

}

