/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_20_do_while;

import java.util.Scanner;

/**
 *
 * @author OMARABIUD
 */
public class EVA2_20_DO_WHILE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        int opcion;
        do{
        System.out.println("--MENU PRINCIPAL--");
        System.out.println("Preciona la opcion: ");
        System.out.println("1. Pedidos:");
        System.out.println("2. Provedores:");
        System.out.println("3. Facturacón:");
        System.out.println("4. Salir");
        opcion = captu.nextInt();
        
        switch(opcion){
            case 1:
                System.out.println("Pedido del sistema");
                break;
            case 2:
                System.out.println("Proveedores del sistema");
                break;
            case 3:
                System.out.println("Facturacion del sistema");
                break;
        }
        
        
    }while(opcion != 4);//mientras opcion sea diferente de 4
        System.out.println("Fin del programa");
    }
    
}
