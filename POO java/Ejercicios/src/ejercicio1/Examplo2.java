/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author danie
 */
public class Examplo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            // TODO code application logic here
         System.out.println("Descuento por compra de Computadoras");
        
        Scanner Cantidad = new Scanner(System.in); 
         
        int Numero; 
        
        System.out.println("Numero total de computadoras que lleva"); 
        
       Numero= Cantidad.nextInt(); 
               
        if (Numero < 5){
        System.out.println("Descuento del 10% sobre el total"); 
        }
       
    else if (Numero >= 5 && Numero < 10){   
        System.out.println("Descuento del 20% sobre el total");  
        }
        else if (Numero>=10){   
        System.out.println("Descuento del 40% sobre el total");  
        }
       
      
    else {
        System.out.println("Error"); 
    } 
    }
    
}
