/*
 Realizar un programa que solo permita introducir solo frases 
o palabras de 8 de largo. Si el usuario ingresa una frase o palabra 
de 8 de largo se deberá de imprimir un mensaje por pantalla que 
diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. 
Nota: investigar la función Lenght() en Java.

 */
package javaapplication2.EstructurasDeControl;

import java.util.Scanner;


public class Ejercicio3 {

    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una palabra de 8 caracteres");
        String palabra = leer.next();
        
       int longitudPalabra = palabra.length();
       
       if(longitudPalabra == 8){
           System.out.println("Correcto");
       }else{
           System.out.println("Incorrecto");
       }
        
    }
    
}
