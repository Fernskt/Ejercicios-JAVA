/*
 Crea una aplicación que le pida dos números al usuario 
y este pueda elegir entre sumar, restar, 
multiplicar y dividir. La aplicación debe 
tener una función para cada operación matemática 
y deben devolver sus resultados para imprimirlos en el main. 

 */
package javaapplication2.SubProgramas;

import java.util.Scanner;

/**
 *
 * @author Pc
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese dos números");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        System.out.println("Que operacion desea hacer suma, resta, multiplicacion, division?");
        String operacion = leer.next();
       
         switch(operacion){
            case "suma":
           
                System.out.println("La suma de los numeros ingresados es " + suma(num1, num2));
              break;
            case  "resta":
                 System.out.println("La resta de los numeros ingresados es " + resta(num1, num2));
              break;
                case "multiplicacion":
             System.out.println("La multiplicacion de los numeros ingresados es " + multiplicacion(num1, num2));
              break;
            case  "division":
                 System.out.println("La division de los numeros ingresados es " + division(num1, num2));
              break;
            default:
                System.out.println("dato  incorrecto");
                
                
        }
      
    }
    
    public static int  suma(int num1, int num2){
        int suma = num1 + num2;
        return suma; 
       
    }
    public static int  resta(int num1, int num2){
        
       int resta = num1 - num2;
        return resta; 
        
    }
    public static int  multiplicacion(int num1, int num2){
        
        int multiplicacion = num1 * num2;
        return multiplicacion; 
        
    }
    public static int  division(int num1, int num2){
        
        int division = num1 / num2;
        return division; 
        
    }
  
        
}
