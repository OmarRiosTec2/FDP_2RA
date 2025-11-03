/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_30_triangulo;

import java.util.Scanner;

/**
 *
 * @author OMARABIUD
 */
public class EVA2_30_TRIANGULO {
    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        int valor;
        char simbolo = '*';       
        System.out.println("introduzca cualquier valor: ");
        valor = captu.nextInt();  
        for (int i = 1; i <= valor; i++) {        
            for (int j = 1; j <= i; j++) {
                System.out.print(simbolo);
            }
            System.out.println("");
        }
        
    }
        
    }
      

