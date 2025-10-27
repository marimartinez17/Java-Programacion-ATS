/*
 * Ejercicio 10: Crear un programa que lea por teclado una tabla de 10 números enteros y desplace N posiciones en el arreglo (N es digitado por el usuario).
 */

package com.mycompany.desplazarnposiciones;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        int arreglo[] = new int[10];
        int ultimo, pos;
        Scanner entrada = new Scanner(System.in);
        
        for (int i=0;i<10;i++){
            System.out.print((i+1)+") Ingrese un número entero: ");
            arreglo[i] = entrada.nextInt();
        }
        
        System.out.print("Ingrese la cantidad de posiciones (1-10)que desea desplazar el arreglo: ");
        pos = entrada.nextInt();
        
        // Repetir segun cantidad de posiciones desplazadas
        for (int i=0;i<pos;i++){
            ultimo = arreglo[9];
            for(int j=8;j>=0;j--){
                arreglo[j+1]=arreglo[j];
            }
            arreglo[0]=ultimo;
        }
        //mostrar array ordenado
        System.out.print("Array ordenado: ");
        for (int i=0;i<10;i++){
            System.out.print(arreglo[i]+"  ");
        }
    }
}
