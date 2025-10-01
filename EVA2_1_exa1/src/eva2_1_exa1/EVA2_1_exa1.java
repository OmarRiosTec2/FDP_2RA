/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_1_exa1;

import java.util.Scanner;

/**
 *
 * @author OMARABIUD
 */
public class EVA2_1_exa1 {

    public static void main(String[] args) {
        int natacion, ciclismo, carrera;
        int tiempoTot;
        Scanner captu = new Scanner(System.in);
        System.out.println("el tiempo de natacion: ");
        natacion = captu.nextInt();
        System.out.println("el tiempo de ciclismo: ");
        ciclismo = captu.nextInt();
        System.out.println("el tiempo de carrera: ");
        carrera = captu.nextInt();
        tiempoTot = natacion + ciclismo + carrera;
        if((tiempoTot < 120) && (natacion < 60) && (ciclismo < 60) && (carrera < 60))
            System.out.println("EXCELENTE");
        else if((tiempoTot < 150) && (natacion < 70) && (ciclismo < 70) && (carrera < 70))
            System.out.println("BUENA");
        else 
            System.out.println("REGULAR");
        
    }
    
}
