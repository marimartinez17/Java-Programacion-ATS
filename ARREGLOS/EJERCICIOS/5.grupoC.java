/*
 * Leer por teclado dos tablas de 10 números enteros y mezclarlas en una tercera de la forma: 
 * el 1ero de A, el 1ero de B, el 2do de A, el 2do de B, etc . . .
 */

package com.mycompany.enteros;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        // Declaracion de arrays
        int[] grupoA = new int[10];
        int[] grupoB = new int[10];
        int[] grupoC = new int[20];
        
        //Declaración del scanner
        Scanner entrada = new Scanner(System.in);
        
        //Array A
        System.out.println("\nLLENADO DEL ARRAY A:\n");
        for (int i=0;i<10;i++){
            System.out.print("Ingresar el elemento #"+(i+1)+": ");
            grupoA[i] = entrada.nextInt();
        }
        
        //Array B
        System.out.println("\nLLENADO DEL ARRAY B:\n");
        for (int i=0;i<10;i++){
            System.out.print("Ingresar el elemento #"+(i+1)+": ");
            grupoB[i] = entrada.nextInt();
        }
        
        //Array C
        System.out.println("Mezclando arrays...\n");
        
        /*Imprimiendo ambos arreglos juntos
        System.out.println("ARRAY C: ");
        for(int i=0;i<10;i++){
            System.out.print(grupoA[i]+" ");
            System.out.print(grupoB[i]+" ");
        }*/
        
        // Llenando elementos de C
        int j=0;
        for(int i=0;i<10;i++){
            grupoC[j]= grupoA[i];
            j++;
            grupoC[j]=grupoB[i];
            j++;
        }
        
        // Mostrar elementos de C
        System.out.print("ARRAY C: ");
        for (int i=0;i<20;i++){
            System.out.print(grupoC[i]+" ");
        }
    }
}
