/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_13_numeros_pares;

import java.util.Scanner;

/**
 *
 * @author OMARABIUD
 */
public class EVA2_13_NUMEROS_PARES {

    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        int par1, par2;
        System.out.println("Seleccione tu primer numero: ");
        par1 = captu.nextInt();
        System.out.println("Seleccione tu segundo numero: ");
        par2 = captu.nextInt();
        
        for(int i = par1; i <= par2; i++){
          int resi = i % 2;
         if(resi == 0)
            System.out.println(i + " - ");
    }
    }
    
}
