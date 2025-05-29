/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainmanusia;

/**
 *
 * @author LENOVO
 */
class Beni extends Manusia {
    @Override
    public void berbicara() {
        System.out.println("Beni: 'Dude, check this out...' (berbicara dengan gaya anak gaul)");
    }
    
    @Override
    public void bekerja() {
        System.out.println("Beni coding di cafe sambil minum kopi");
    }
    
    @Override
    public void makan() {
        System.out.println("Beni makan pizza sambil nge-game");
    }
}
