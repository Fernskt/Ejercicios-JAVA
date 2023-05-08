/*
 Los profesores del curso de programación de Egg necesitan llevar un registro 
de las notas adquiridas por sus 10 alumnos para luego obtener una cantidad de 
aprobados y desaprobados. Durante el período de cursado cada alumno obtiene 4 
notas, 2 por trabajos prácticos evaluativos y 2 por parciales. Las ponderaciones
de cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. 
Al final del programa los profesores necesitan obtener por pantalla la cantidad
de aprobados y desaprobados, teniendo en cuenta que solo aprueban los alumnos 
con promedio mayor o igual al 7 de sus notas del curso.

 */
package javaapplication2.Arrays.EjerciciosExtra;

import java.util.Scanner;

public class Extra4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int cantAlumnos = 10;
        int notasXAlumnos = 4;
        int cantidadAprobados = 0;
        int cantidadDesaprobados = 0;

        int[][] notas = new int[cantAlumnos][notasXAlumnos];

        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                System.out.println("Ingrese la nota "+(j+1)+" del " + (i+1) + "° alumno");
                notas[i][j] = leer.nextInt();
                notas[i][j] = leer.nextInt();
            }

        }

    }

}
