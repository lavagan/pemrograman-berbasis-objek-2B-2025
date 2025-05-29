/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package binatang;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class polimorfisme {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner (System.in);
        Hewan[] kadang = new Hewan[5];
        int index = 0;
        
        while (true){
            System.out.println("/n menu =");
            System.out.println("1.tambah ayam");
            System.out.println("2. tambah buaya");
            System.out.println("3. tampilin hewan");
            System.out.println("4. keluar");
            System.out.println("silakan pilih");
            int pilihan = scanner.nextInt();
            
            switch(pilihan){
                case 1:
                    kadang[index++] = new Ayam();
                    break;
                case 2:
                    kadang[index++] = new buaya();
                    break;
                case 3:
                    System.out.println("isi kandang");
                    for (int i = 0; i <index; i++){
                        kadang[i].suara();
                        kadang[i].makanan();
                        System.out.println();
                        
                    }
                case 4:
                    System.out.println("keluar");
                    scanner.close();
                    return;
                default:
                    System.out.println("pilihan tak walid");
                    
            }
            if (index >= kadang.length){
                System.out.println("kandang tae");
                break;
            }
        }
    }
    
}
