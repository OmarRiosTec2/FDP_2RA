/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_10_for;

import java.util.Scanner;

/**
 *
 * @author OMARABIUD
 */
public class EVA2_10_FOR {

    public static void main(String[] args) {
        //imprimir del 1 al 20
        for(int i = 1; i <= 20; i++)
            System.out.print(i + " + ");
        //imprimir al reves
            System.out.println("");
        for(int i = 20; i >= 1; i--)
            System.out.print(i + " - ");
        //imprimir los pares de 0 a 100
        //0 - 2 - 4 - 6 - 8 ... 98 - 100
        //+=, -=, *=, /=
        System.out.println("");
        for(int i = 0; i <= 100; i+=2)
            System.out.print(i + " - ");
       //IMPRIMIR EN ORDEN INVERSO
        System.out.println("");
        for(int i = 100; i >= 0; i-=2)
            System.out.print(i + " - ");
        //SOLICITAR DOS NUMEROS AL USUARIO, IMPRIMIR LA LISTA
        //ENTRE ESOS NUMEROS
        //-3 Y 3 --> -3 -2 -1 0 1 2 3
        //EN ORDEN INVERSO
        System.out.println("");
        int rep1, rep2;
        Scanner captu = new Scanner(System.in);
        System.out.println("Seleccione tu primer numero: ");
        rep1 = captu.nextInt();
        System.out.println("Seleccione tu segundo numero: ");
        rep2 = captu.nextInt();
        for(int i = rep1; i <= rep2; i++)
            System.out.println(i + " - ");
        for(int i = rep1; i >= rep2; i--)
            System.out.println(i + " - ");
    }
    
}
