/*

import java.util.Scanner; 
Desarrolladora:Daniela Morea Manrique
codigo: u20241222112
 */
package ejercicio1;
 
import java.util.Scanner;

public class Ejercicio1 {
    
    public static void main(String[] args) {
        System.out.println("Reparto de trabajadores al año");
        
        Scanner Tiempolaborado = new Scanner(System.in); 
         
        float año; 
        
        System.out.println("Tiempo que lleva trabajando"); 
        
       año= Tiempolaborado.nextInt(); 
               
        if (año > 0 && año < 1){
        System.out.println("Tu utilidad es del 5% de un salario"); 
        
    }   else if (año >= 1 && año < 2){   
        System.out.println("Tu utilidad es del 7% de un salario");  
    }
        else if (año >= 2 && año < 5){   
        System.out.println("Tu utilidad es del 10% de un salario");  
        }
         else if (año >= 5 && año < 10){   
        System.out.println("Tu utilidad es del 15% de un salario");  
         }
         else if (año >= 10){   
        System.out.println("Tu utilidad es del 20% de un salario"); 
    }   else {
        System.out.println("Error"); 
         }
    }           
    }  
