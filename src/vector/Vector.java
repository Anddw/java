/**
Realizar un programa que permita cargar 15 nuemros en un vector. 
* una vez cargados se necesita  que el progrma cuente e informe por pantalla cuatnas veces se cargo el celular 3 
 */
package vector;

import java.util.Scanner;

public class Vector {

    public static void main(String[] args) {
        int vector [] = new int [15];
        Scanner teclado = new Scanner (System.in);
     // cargfar nuestro vector     
   for (int i = 0; i<15; i++){
       System.out.println("Ingrese un numero para el vector ");
       vector[i] = teclado.nextInt();
       
   }
   //recorrer y contar numeros 3 hay
   
    int cont = 0;
     for (int i = 0; i<15; i++){
     if(vector[i] == 3 ){
     cont = cont +1;
     }
         
     }
 
        System.out.println("La cantidad de nuemros 3 que hay en el vector es: " + cont);
    }
    
}
