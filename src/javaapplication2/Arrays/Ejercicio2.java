/*
 Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios y 
le pida al usuario un número a buscar en el vector. El programa mostrará dónde 
se encuentra el numero y si se encuentra repetido
 */
package javaapplication2.Arrays;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int n = leer.nextInt();
        int[] vector = new int[n];
        int cont = 0;

        for (int i = 0; i < n; i++) {

            vector[i] = (int) (Math.random() * 10);
            System.out.println(vector[i]);
        }

        System.out.println("Ingrese un numero a buscar");
        int num = leer.nextInt();

        for (int i = 0; i < n; i++) {
            if (num == vector[i]) {
                System.out.println("Se encontr{o el número " + num + " en la posicion " + i);
                cont++;
            }
        }

        System.out.println("contador" + cont);

        if (cont == 0) 
            System.out.println("No se encontró el número");
        

    }
}
