/*
 * Leer los datos correspondientes a dos tablas de 12 elementos numéricos, y mezclarlos en una tercera 
 * de la forma: 3 de la tabla A, 3 de la B, otros 3 de A, otros 3 de la B, etc.
 */

package com.mycompany.tablas;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        //Declaración de scanner
        Scanner entrada = new Scanner(System.in);
        
        // Declaración de arrays
        int grupoA[], grupoB[], grupoC[];
        grupoA = new int[12];
        grupoB = new int[12];
        grupoC = new int[24];
        
        // Solicitar elementos de la tabla A
        System.out.println("TABLA A:");
        for (int i=0;i<12;i++){
            System.out.print("Elemento #"+(i+1)+": ");
            grupoA[i] = entrada.nextInt();
        }
        
        // Solicitar elementos de la tabla B
        System.out.println("TABLA B:");
        for (int i=0;i<12;i++){
            System.out.print("Elemento #"+(i+1)+": ");
            grupoB[i] = entrada.nextInt();
        }
        
        
        // Llenado del array C
        int a = 0, b = 0,  n = 0;
        for (int i=0;i<4;i++){
            for (int j=0;j<3;j++){
                grupoC[n]=grupoA[a];
                n++;
                a++;
            }
            for (int j=0;j<3;j++){
                grupoC[n]=grupoB[b];
                n++;
                b++;
            }
        }
        
        // Mostrar elementos de C
        System.out.print("ARRAY C: ");
        for (int i=0;i<24;i++){
            System.out.print(grupoC[i]+" ");
        }
    }
}
