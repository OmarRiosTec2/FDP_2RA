/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_2_switch;

import java.util.Scanner;

/**
 *
 * @author OMARABIUD
 */
public class EVA2_2_switch {

    public static void main(String[] args) {
      //SWITCH --> OPCION MULTIPLE
      Scanner captu = new Scanner(System.in);
      int dia;
      System.out.println("Dia de la semana en número (1-7): ");
      dia = captu.nextInt();
      /*if(dia == 1){
          System.out.println("Lunes");
          }else if(dia == 1){
          System.out.println("Lunes");
        */
      switch(dia){//opciones --> casos
          case 1:
              System.out.println("Lunes");
              //break;//fin de caso y del switch
          case 2:
              System.out.println("Martes");
              //break;
          case 3:
              System.out.println("Miercoles");
              //break;
          case 4:
              System.out.println("Jueves");
              break;
          case 5:
              System.out.println("Viernes");
              break;
          case 6:
              System.out.println("Sabado");
              break;
          case 7:
              System.out.println("Domingo");
              break;
          default://opcional
              System.out.println("Numero incorrecto");
      }
    }
    
}
