/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_12_tabla_mult;

import java.util.Scanner;

/**
 *
 * @author OMARABIUD
 */
public class EVA2_12_TABLA_MULT {
   
    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        int num;
        System.out.println("Dame un numero tabla multiplicar: ");
        num = captu.nextInt();
    
        for(int i = 1; i <= 10; i++){
            int mult = num * i;
            System.out.println(num + " x " + i + " = " + mult);
        }
    }
}
