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
        
        int PrecioComputadora = 500;

        double descuento;

        double total;
         
        int Numero; 
        
        System.out.println("Numero total de computadoras que lleva"); 
        
       Numero = Cantidad.nextInt(); 
               
        if (Numero < 5 && Numero > 0){
        System.out.println("Descuento del 10% sobre el total"); 

        total = (PrecioComputadora * Numero);

        descuento = total * 0.1;

        total = total - descuento;
  

        System.out.println("Tu factura es de :");
        System.out.println(total);


        }
       
    else if (Numero >= 5 && Numero < 10){   
        System.out.println("Descuento del 20% sobre el total");  
        
        total = (PrecioComputadora * Numero);

        descuento = total * 0.2;

        total = total - descuento;
  

        System.out.println("Tu factura es de :");
        System.out.println(total);
        }
        else if (Numero>=10){   
        System.out.println("Descuento del 40% sobre el total");
        
        total = (PrecioComputadora * Numero);

        descuento = total * 0.4 ;

        total = total - descuento;
  

        System.out.println("Tu factura es de :");
        System.out.println(total);  
        }
       
      
    else {
        System.out.println("Error"); 
    } 
    }
    
}
