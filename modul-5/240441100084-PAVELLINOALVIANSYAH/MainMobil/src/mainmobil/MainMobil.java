/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mainmobil;

/**
 *
 * @author LENOVO
 */
public class MainMobil {
    public static void main(String[] args) {
        // Create objects
        Mobil sport = new MobilSport();
        Mobil sedan = new MobilSedan();
        
        // Operate sports car
        System.out.println("=== Mobil Sport ===");
        sport.nyalakanMesin();
        sport.matikanMesin();
        
        // Operate sedan car
        System.out.println("\n=== Mobil Sedan ===");
        sedan.nyalakanMesin();
        sedan.matikanMesin();
    }
}