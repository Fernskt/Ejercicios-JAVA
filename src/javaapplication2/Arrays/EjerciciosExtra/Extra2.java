/*
 Escriba un programa que averigüe si dos vectores de N enteros son iguales 
(la comparación deberá detenerse en cuanto se detecte 
alguna diferencia entre los elementos).

 */
package javaapplication2.Arrays.EjerciciosExtra;

import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class Extra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numeros");
        int num = leer.nextInt();
        int num2 = leer.nextInt();
        
        int vector1[] = new int[num];
        int vector2[] = new int[num2];
        boolean iguales = true;
        
        for (int i = 0; i < num; i++) {
            System.out.println("Rellene el primer vector");
            int n1 = leer.nextInt();
            vector1[i] = n1;
        }
        
        for (int i = 0; i < num2; i++) {
            System.out.println("Rellene el segundo vector");
            int n2 = leer.nextInt();
            vector2[i] = n2;
        }
        
        if(vector1.length != vector2.length){
            iguales = false;
        }else{
            for (int i = 0; i < vector1.length; i++) {
                if (vector1[i] != vector2[i]){
                    iguales = false;
                }
            }
        }
        
       if (iguales){
           System.out.println("Los vectores son IGUALES");
        }else{
           System.out.println("Los vectores son DISTINTOS");
       }
    }
    
}
