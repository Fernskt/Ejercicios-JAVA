/*
Realizar un algoritmo que calcule la suma de todos 
los elementos de un vector 
de tamaño N, con los valores ingresados por el usuario.
 */
package javaapplication2.Arrays.EjerciciosExtra;

import java.util.Scanner;


public class Extra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int n = leer.nextInt();
        
        int suma = 0;
        int [] vector = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese un numero");
            int num = leer.nextInt();
            vector[i] = num;
            suma+=vector[i];
        }
        
        System.out.println("La suma de todos los números ingresados es "+suma);
    }
    
}
