/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_3_switch;

/**
 *
 * @author OMARABIUD
 */
public class EVA2_3_SWITCH {

    
    public static void main(String[] args) {
        String valor = "Lunes";
        switch(valor){
            case "Lunes":
                    System.out.println(1);
                    break;
            case "Martes":
                    System.out.println(2);
                    break;
            case "Miercoles":
                    System.out.println(3);
                    break;
            case "Jueves":
                    System.out.println(4);
                    break;
            case "viernes":
                    System.out.println(5);
                    break;
            case "sabado":
                    System.out.println(6);
                    break;
            case "domingo":
                    System.out.println(7);
                    break;
            default:
                System.out.println("Valor incorrecto");
        }
    
    }
    
}
