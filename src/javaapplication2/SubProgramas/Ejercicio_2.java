/*
Diseñe una función que pida el nombre y 
la edad de N personas e imprima los datos de 
las personas ingresadas por teclado e indique 
si son mayores o menores de edad. 
Después de cada persona, el programa 
debe preguntarle al usuario si quiere 
seguir mostrando personas y frenar cuando 
el usuario ingrese la palabra “No”.

 */
package javaapplication2.SubProgramas;

import java.util.Scanner;

public class Ejercicio_2 {

    public static void main(String[] args) {
        
        int edad = 0;
        String nombre = "";
        
        datos(edad, nombre);
        
    }

    public static void datos(int edad, String nombre) {
        
       Scanner leer = new Scanner(System.in);
       String respuesta = "";

        do {
           
            System.out.println("Ingrese nombre");
            nombre = leer.next();
            System.out.println("Ingrese su edad");
            edad = leer.nextInt();
            
            if(edad>=18){
                System.out.println(nombre + " es mayor a 18");
            }else{
                System.out.println(nombre+ "Es menor de edad");
            }
            
            do{
            System.out.println("Quiere ingresar otro nombre? Si/No");
            
            respuesta = leer.next();
             }while(!"Si".equalsIgnoreCase(respuesta) && !"No".equalsIgnoreCase(respuesta));

        } while ("Si".equalsIgnoreCase(respuesta));
    }
}
