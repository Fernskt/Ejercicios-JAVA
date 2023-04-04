/*
Crea una aplicación que nos pida un número por teclado 
y con una función se lo pasamos por parámetro para 
que nos indique si es o no un número primo, 
debe devolver true si es primo, sino false.
Un número primo es aquel que solo puede dividirse 
entre 1 y sí mismo. Por ejemplo: 25 no es primo, 
ya que 25 es divisible entre 5, sin embargo, 17 si es primo.

 */
package javaapplication2.SubProgramas;

import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero entero positivo");
        int num = leer.nextInt();
        
        if(esPrimo(num)){
            System.out.println("Es un numero primo");
        }else{
            System.out.println("el numero no es primo");
        }
        
    }
    
    public static boolean esPrimo(int num){
        if (num <= 1){
            return false;
        }
        for(int i=2; i <= Math.sqrt(num); i++){
        if(num % i == 0){
            return false;
        }
        }
        return true;
    }
    
}
