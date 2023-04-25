/*
 Crear una función rellene un vector con números aleatorios, 
pasándole un arreglo por parámetro. Después haremos otra función 
o procedimiento que imprima el vector.

 */
package javaapplication2.Arrays.EjerciciosExtra;

/**
 *
 * @author Pc
 */
public class Extra3 {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        int[]vector = new int[10];
        rellenarVector(vector);
        imprimirVector(vector);
        
        
    }
    
    public static void rellenarVector(int[] vector){
        
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 10);
        }
       
    }
    
    public static void imprimirVector(int[] vector){
        
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i] + " ");
        }
    }
    
}
