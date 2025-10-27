/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_21_do_while_pwd;

import java.util.Scanner;

/**
 *
 * @author OMARABIUD
 */
public class EVA2_21_DO_WHILE_PWD {
    final static String USUARIO = "admin";
    final static String PWD = "admin";
    
    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        String usu, contra;
        do{
            System.out.println("---ACCESO DEL SISTEMA---");
            System.out.println("Usuario: ");
            usu = captu.nextLine();
            System.out.println("Contraseña: ");
            contra = captu.nextLine();
        
            
        }while(!(usu.equals(USUARIO) && contra.equals(PWD)));
        System.out.println("BIENVENIDO");
    }
    
}
