/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hewan;
class binatang {
    public void suara(){
        System.out.println("hewan mengeluarkan suara");
    }
}

class kucing extends binatang {
    @Override
    public void suara(){
        System.out.println("meong");
    }
}

class bebek extends binatang{
    @Override
    public void suara(){
        System.out.println("kwek");
    }
}
/**
 *
 * @author LENOVO
 */
public class Hewan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        binatang mewong = new kucing();
        binatang sinjay = new bebek();
        
        mewong.suara();
        sinjay.suara();
    }
    
}
