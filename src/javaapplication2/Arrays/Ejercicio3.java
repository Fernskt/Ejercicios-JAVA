/*
Recorrer un vector de N enteros contabilizando cuántos números 
son de 1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package javaapplication2.Arrays;

import java.util.Random;
import java.util.Scanner;


public class Ejercicio3 {


    public static void main(String[] args) {
        
       
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese tamaño vector");
        int n = leer.nextInt();
        
         int[] vector = new int[n];
         
        int cont1 = 0 , cont2 = 0, cont3 = 0, cont4 = 0 , cont5 = 0;
       
         
        for (int i = 0; i < n; i++) {
             Random random = new Random();
         int aleatorio = random.nextInt(100000);
            vector[i]=aleatorio;
        System.out.println("numero generado " + vector[i]);
        String numero = String.valueOf(vector[i]);
        int longitud = numero.length();
        
            switch (longitud) {
                case 1:
                    cont1++;
                    break;
                case 2: 
                    cont2++;
                    break;
                case 3: 
                    cont3++;
                    break;
                case 4: 
                    cont4++;
                    break;
                case 5: 
                    cont5++;
                    break;
            }
        
        }
        
        System.out.println("de 1 dígito, se han encontrado " +cont1+" Números");
         System.out.println("de 2 dígitos, se han encontrado " +cont2+" Números");
          System.out.println("de 3 dígitos, se han encontrado " +cont3+" Números");
           System.out.println("de 4 dígitos, se han encontrado " +cont4+" Números");
            System.out.println("de 5 dígitos, se han encontrado " +cont5+" Números");
            
        
    }

    
}
