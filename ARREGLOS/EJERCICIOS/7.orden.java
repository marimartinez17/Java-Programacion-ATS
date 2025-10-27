/*
 * Ejercicio #7: Leer por teclado una serie de 10 números enteros. La aplicación debe indicarnos si 
 * los números están ordenados de forma creciente, decreciente, o si están desordenados
 */

package com.mycompany.detorden;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class App {

    public static void main(String[] args) {
        int serie[] = new int[10];
        boolean creciente = false, decreciente = false;
        Scanner entrada = new Scanner(System.in);
        
        //Solicitar números
        for (int i=0;i<10;i++){
            System.out.print((i+1)+") Ingrese un número entero: ");
            serie[i] = entrada.nextInt();
        }
        
        for (int i=0;i<9;i++){
            //Determinar si esta en orden creciente
            if (serie[i]<serie[i+1]){
                creciente = true;
            }
            
            //Determinar si esta en orden decreciente
            if (serie[i]>serie[i+1]){
                decreciente = true;
            }
        }
        
        if (creciente == true && decreciente == false){
            System.out.println("El arreglo está en orden creciente.");
        } else if (creciente == false && decreciente == true){
            System.out.println("El arreglo está en orden decreciente.");
        } else if (creciente == true && decreciente == true){
            System.out.println("El arreglo está desordenado.");
        } else {
            System.out.println("Todos los números del arreglo son iguales.");
        }
    }
}
