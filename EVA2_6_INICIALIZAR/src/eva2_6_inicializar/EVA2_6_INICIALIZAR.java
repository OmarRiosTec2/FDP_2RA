/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_6_inicializar;

import java.util.Scanner;

/**
 *
 * @author OMARABIUD
 */
public class EVA2_6_INICIALIZAR {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       String diaSemana[] = {"Domingo","Lunes","Marte","Miercoles","Jueves","Viernes","Sabado",};
       
        System.out.println("Escribe el numero del dia: ");
        int day = Integer.parseInt(input.nextLine().trim());
        if(day <= 7 && day >= 1){
            day = day - 1;
            System.out.println(diaSemana[day]);
        }else{
            System.out.println("No existe ese dia");
    }
}
}
