/*
Escribir un programa que procese una secuencia de 
caracteres ingresada por teclado y terminada en punto, 
y luego codifique la palabra o frase ingresada de la 
siguiente manera: cada vocal se reemplaza por el 
carácter que se indica en la tabla y el resto de los 
caracteres (incluyendo a las vocales acentuadas) se mantienen 
sin cambios.

Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación 
correspondiente. Utilice la estructura “según” para la transformación. 
Por ejemplo, si el usuario ingresa:     Ayer, lunes, salimos a las once y 10.
La salida del programa debería ser:  @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.

 */
package javaapplication2.SubProgramas;

import java.util.Scanner;

public class Ejercicio1 {

     public static void main(String[] args) {
   	 
    	Scanner leer = new Scanner(System.in);
    	int num1 = 5;
    	int num2 = 7;
   	 
    	//Puedo invocar el retorno de esta funcion de esta manera
    	System.out.println("La suma de ambos es: " + sumar(num1, num2));
           	 
    	int retorno = sumar(num1, num2);

    	System.out.println("La suma de ambos es: " + retorno);
	}

	// Pero, recomendamos hacerlo de esta manera, ya que los retornos deben alojarse en variables para su posterior uso

	public static int sumar(int num1, int num2) {
    	int suma;
    	suma = num1 + num2;
    	return suma;
	}
    
    
}

