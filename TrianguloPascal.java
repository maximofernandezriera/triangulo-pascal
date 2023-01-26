/*
 * TRIÁNGULO DE PASCAL:
 * Diseña un algoritmo que permita dibujar el triángulo de Pascal, 
 * sabiendo que debe mostrar el siguiente resultado:
 * 1
 * 1 1
 * 1 2 1
 * 1 3 3 1
 * 1 4 6 4 1
 * 1 5 10 10 5 1
 * ...
 */
package estructurasestaticas;

import java.util.Scanner;

/**
 * Programa que muestra el triángulo de Pascal
 *
 * @version 1.0
 */
public class TrianguloPascal {

    /**
     * Método main
     *
     * @param args Argumentos de la llamada al método main
     */
    
    public static void main(String[] args) { //Método sencillo, utilizando un array bidimensional
        //Suponemos que vamos a mostrar 10 filas (podemos solicitar al usuario el número de filas)
        int nfilas = 10;
        
        //Utilizamos la a como array anterior (inicialmente de una posición)
        int[] a = new int[nfilas];
        int[] x = new int[nfilas];

        
        //Para cada fila a mostrar
        for (int i = 1; i <= nfilas; i++) {
            
            //Creamos un array cuyo tamaño lo determina i (inicialmente 1)
            x = new int[i];
            
            //Recorremos desde 0 hasta el tamaño de i
            for (int j = 0; j < i; j++) {
                //Si la j es la primera o la última posición del array
                if (j == 0 || j == (i - 1)) {
                    //Introducimos en esa posición un 1 (laterales)
                    x[j] = 1;
                } else {
                    //Sino introducimos la suma del valor del array anterior
                    x[j] = a[j] + a[j - 1];
                }
                //Mostramos la posición introducida
                System.out.print(x[j] + " ");
            }
            //El array anterior (a) toma los valores del array que acabamos de crear (x)
            a = x;
            //System.out.println("a mide "+a.length+" y x mide "+x.length);
            //Hacemos un salto de línea para cambiar de fila
            System.out.println();
        }
    }

    //Método complejo, utilizando permutaciones
    /*public static void main(String[] args) {
        //Suponemos que vamos a mostrar 10 filas (podemos solicitar al usuario el número de filas)
        int nfilas = 10;
        for (int i = 0; i < nfilas; i++) {
            int array[] = new int[i + 1];
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {// 
                    array[j] = 1;
                } else {
                    int x = 1;
                    int y = i;
                    int z = j;
                    int w = 1;
                    for (int q = 0; q < j; q++) {
                        x *= y;
                        w *= z;
                        y = y - 1;
                        z = z - 1;
                    }
                    array[j] = x / w;
                }
                System.out.print(array[j] + " ");
            }
            System.out.println();
        }
    }*/
}
