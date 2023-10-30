/*
Generar enteros de 3 en 3 comenzando por 2 hasta el valor máximo menor que 30 y calcular
la suma de los números generados que sean divisibles por 5.
 */
package ejercicios_basicos_de_programacion;

public class Ejercicio23 {
    public static void main(String[] args) {
        int suma=0;
        for (int i = 2; i < 30; i=i+3) {
            
            if(i%5==0)
                suma=suma+i;
        }
        
    }
}
