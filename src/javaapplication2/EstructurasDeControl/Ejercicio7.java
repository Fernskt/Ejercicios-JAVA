/*
 Realizar un programa que simule el funcionamiento de un dispositivo RS232, este
tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben 
llegar con un formato fijo: tienen que ser de un máximo de 5 caracteres de 
largo, el primer carácter tiene que ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la 
secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda
secuencia distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas
correctas e incorrectas recibidas. Para resolver el ejercicio deberá investigar 
cómo se utilizan las siguientes funciones de Java Substring(), Length(), equals().
 */
package javaapplication2.EstructurasDeControl;

import java.util.Scanner;


public class Ejercicio7 {

    
    public static void main(String[] args) {
        
        String caracteres = "";
        int correctas = 0;
        int incorrectas = 0;
        
        do {
            Scanner leer = new Scanner(System.in);
            System.out.println("Ingrese una cadena de caracteres");
            caracteres = leer.next();
            
            int longitud = caracteres.length();
            String primeraLetra = caracteres.substring(0, 1);
            String ultimaLetra = caracteres.substring(longitud-1);
            
            System.out.println(ultimaLetra);
          
            
            if(primeraLetra.equalsIgnoreCase("x")&&ultimaLetra.equalsIgnoreCase("o")&&longitud<=5){
                correctas++;
                System.out.println("Correcto!");
            }else if (caracteres.equals("&&&&&")){
                
                System.out.println("Saliendo...");
            }else{
                incorrectas++;
                System.out.println("Incorrecto");
            }
           
            
        } while (!"&&&&&".equals(caracteres));
        
        System.out.println("Cantidad de lecturas correctas: " + correctas);
        System.out.println("Cantidad de lecturas incorrectas: " + incorrectas);

    }
    
}
