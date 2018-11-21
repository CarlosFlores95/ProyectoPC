package com.principal;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Carlos
 */
public class Principal {
    
    
    public static void main(String[] args) {
        menu();
    }
    
    private static void menu(){
        boolean bandera = true;
        Scanner scan = new Scanner(System.in);
        ServiciosCompu servicios = new ServiciosCompu();
        do{
            System.out.println("Ingresa la opción deseada 1)Añadir, 2)Revisar,3)Modificar, 4)Eliminar, 5)Salir");
            int opcion = scan.nextInt();
            switch(opcion){
                case 1:
                    
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Fin del programa cus bai");
                    bandera = false;
                    break;
            }
                
            }
        while(bandera == true); {
            
        }

    }
    
    
    
}
