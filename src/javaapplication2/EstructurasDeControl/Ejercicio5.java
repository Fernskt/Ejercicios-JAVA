/*
 Escriba un programa en el cual se ingrese un valor 
límite positivo, y a continuación 
solicite números al usuario hasta que la suma de los 
números introducidos supere el límite inicial.
 */
package javaapplication2.EstructurasDeControl;

import java.util.Scanner;


public class Ejercicio5 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el valor límite positivo");
        int valorLimPos = leer.nextInt();
        
        int suma = 0;
       
        
        do {
            System.out.println("Ingrese un número");
            int num = leer.nextInt();
            suma+=num;
             System.out.println("la suma es " + suma);
        } while (suma<=valorLimPos);
        
        System.out.println("La suma de los números introducidos dió "+suma+" y superó el límite inicial "+valorLimPos);
    }
    
}
