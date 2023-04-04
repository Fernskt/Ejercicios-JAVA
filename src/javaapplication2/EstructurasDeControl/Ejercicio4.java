/*
 Escriba un programa que pida una frase o palabra 
y valide si la primera letra de esa frase es una ‘A’. 
Si la primera letra es una ‘A’, 
se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, 
en caso contrario, se deberá imprimir “INCORRECTO”. 
Nota: investigar la función Substring y equals() de Java.
 */
package javaapplication2.EstructurasDeControl;

import java.util.Scanner;


public class Ejercicio4 {

    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase o palabra");
        String frase = leer.next();
        
       String letra = frase.substring(0,1);
       
       if(letra.equalsIgnoreCase("a")){
           System.out.println("Correcto! Empieza con A");
       } else{
           System.out.println("Incorrecto! no empieza con A :( ");
       }
        
    }
    
}
