/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_32_factor;

import java.util.Scanner;

/**
 *
 * @author OMARABIUD
 */
public class EVA2_32_FACTOR {
    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        int facto;
        System.out.println("introduzca un numero para su factorial: ");
        facto = captu.nextInt();
        
        if (facto < 0) {
            System.out.println("el numero negativo o 0 no se puede sacar");
            return;
        }
        
        int facto2 = 1;
        for (int i = 1; i < facto; i++) {
           facto2 *= i;
         }
        int res = facto * facto2;
        System.out.println("El factorial de " + facto + " es el resultado de: " + res);
        
    }
    
}
