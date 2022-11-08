/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
import java.util.Scanner;
public class Gerilim {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner cabir = new Scanner(System.in);
        System.out.println("Hoşgeldiniz");
        System.out.println("İletkenin Direncini Giriniz: ");
        double direnç = cabir.nextDouble();
        
        
        
        System.out.println("İletkenin Akımını Giriniz: ");
        double akım = cabir.nextDouble();
        
        
        double gerilim = direnç * akım;
        
        
        System.out.println("İletkenin Gerilimi: "+ gerilim);
        
        
        
        
        
        
        
    }
    
}
