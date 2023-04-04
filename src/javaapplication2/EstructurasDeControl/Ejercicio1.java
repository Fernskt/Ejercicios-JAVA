/*
Crear un programa que dado un número determine si es par o impar.

 */
package javaapplication2.EstructurasDeControl;

import java.util.Scanner;


public class Ejercicio1 {

    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número entero positivo");
        int num = leer.nextInt();
        
        if(num % 2 == 0){
            System.out.println("El número " + num + " es un número PAR");
        }else{
            System.out.println("El número " + num + " es un número IMPAR");
                }
        
    }
    
}
