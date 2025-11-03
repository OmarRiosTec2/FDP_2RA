/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_33_cuenta;

import java.util.Scanner;

/**
 *
 * @author OMARABIUD
 */
public class EVA2_33_CUENTA {
    public static void main(String[] args) {
        int retiro, cuenta = 1000000;
        Scanner captu = new Scanner(System.in);
        do{
            System.out.println("SU CUENTA BANCARIA TIENE: " + cuenta);
            System.out.println("introduzca la cantidad que desea sacar: ");
            retiro = captu.nextInt();
            cuenta = cuenta - retiro;
            
             
        
        }while(cuenta > 0);
    }
    
}
