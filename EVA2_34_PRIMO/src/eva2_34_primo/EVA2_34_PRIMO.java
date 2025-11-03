/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_34_primo;

import java.util.Scanner;

/**
 *
 * @author OMARABIUD
 */
public class EVA2_34_PRIMO {
    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        int num;
        System.out.println("introduzca un numero para su primo: ");
        num = captu.nextInt();
        boolean Primo = true;
        
        for (int i = 2; i < num; i++) {
            int resi = num % i;
            if(resi == 0){
            Primo = false;
            break;
            
            }
        }
        if(Primo)
            System.out.println("El numero " + num + " es primo");
        else
            System.out.println("El numero " + num + " no es primo");
    }
    
}
