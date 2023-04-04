/*
 Realizar un programa que pida dos números enteros positivos por teclado y 
muestre por pantalla el siguiente menú:El usuario deberá elegir una opción y el
programa deberá mostrar el resultado por pantalla y luego volver al menú. 
El programa deberá ejecutarse hasta que se elija la opción 5. Tener en cuenta 
que, si el usuario selecciona la opción 5, en vez de salir del programa 
directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro
que desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se
sale del programa, caso contrario se vuelve a mostrar el menú.

 */
package javaapplication2.EstructurasDeControl;

import java.util.Scanner;


public class Ejercicio6 {

   
    public static void main(String[] args) {
        
         int opcion = 0;
         String decision = "n";
        do {
             Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos números enteros positivos");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();

        
        
       
            System.out.println("Elija una opción:");
        
        System.out.println("1. SUMAR");
        System.out.println("2. RESTAR");
        System.out.println("3. MULTIPLICAR");
        System.out.println("4. DIVIDIR");
        System.out.println("5. SALIR");
        
        opcion = leer.nextInt();
           
            switch(opcion){
                case 1:
                    System.out.println("La SUMA de los números es " + (num1+num2));
                    break;
                case 2:
                     System.out.println("La RESTA de los números es " + (num1-num2));
                    break;
                case 3:
                     System.out.println("La MULTIPLICACIÓN de los números es " + (num1*num2));
                    break;
                case 4:
                     System.out.println("La DIVISIÓN de los números es " + (num1/num2));
                    break;
                case 5:
                    System.out.println("Está Usted Seguro/a Que Desea Salir? S/N");
                    decision = leer.next();
                    
                    if(decision.equalsIgnoreCase("s")){
                        break;
                    }
                     break;
                default:
                    System.out.println("Opción Inválida");
            }
            
        } while (decision.equalsIgnoreCase("n")&& opcion>=5);
        
    }
    
}
