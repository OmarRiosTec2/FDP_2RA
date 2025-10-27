/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_5_arreglos_string;

import java.util.Scanner;

/**
 *
 * @author OMARABIUD
 */
public class EVA2_5_ARREGLOS_STRING {

    public static void main(String[] args) {
      int[] a, b, c;
      int x[], y, z;
      String cadenas[] = new String[7];
      cadenas[0] = "Domingo";
      cadenas[1] = "Lunes";
      cadenas[2] = "Martes";
      cadenas[3] = "Miercoles";
      cadenas[4] = "Jueves";
      cadenas[5] = "Viernes";
      cadenas[6] = "Sabado";
      
      Scanner input = new Scanner(System.in);
      System.out.println("Escribe el numero del dia de la semana, por favor: ");
      int day = Integer.parseInt(input.nextLine().trim());
      if(day <= 7 && day > 0){
          day = day - 1;
          System.out.println(cadenas[day]);
      }else{
          System.out.println("No existe ese dia");
      }
    }
    
}
