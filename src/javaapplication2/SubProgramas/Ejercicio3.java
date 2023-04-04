/*
 Crea una aplicación que a través de una 
función nos convierta una cantidad de 
euros introducida por teclado a otra moneda, 
estas pueden ser a dólares, yenes o libras. 
La función tendrá como parámetros, la cantidad 
de euros y la moneda a convertir que será una cadena, 
este no devolverá ningún valor y mostrará 
un mensaje indicando el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €

 */
package javaapplication2.SubProgramas;

import java.util.Scanner;
import jdk.nashorn.internal.ir.annotations.Ignore;

/**
 *
 * @author Pc
 */
public class Ejercicio3 {

  
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de Euros");
        float euros = leer.nextFloat();
        System.out.println("A que moneda desea convertir? libras, dolares, Yen");
        
        String moneda = leer.next().toLowerCase();
        
        convertir(moneda,euros);
        
        
        
    }
    
    public static void convertir(String moneda, float euros){
        
        switch(moneda){
            case "libras":
                System.out.println(euros + " Euros En libras es £" + (euros*0.86));
                break;
            case"dolares":
                System.out.println(euros + " Euros En dolares es US$" + (euros*1.28611));
                break;
            case"yen":
                System.out.println(euros + " Euros En yenes es ¥" + (euros*129.852));
                break;
            default:
                System.out.println("Opcion Inválida");
        }    
    }
}
