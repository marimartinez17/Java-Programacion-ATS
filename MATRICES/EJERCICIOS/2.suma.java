/*
 * Ej # 3: Crear y cargar dos matrices de tamaño 3x3, sumarlas y mostrar su suma
 */

package com.mycompany.sumamatrices;

import java.util.Scanner;


public class App {

    public static void main(String[] args) {
        //Definicion de matrices
        int matriz1[][] = new int[3][3];
        int matriz2[][] = new int[3][3];
        int suma[][] = new int[3][3];
        
        //Declaracion del scanner
        Scanner entrada = new Scanner(System.in);
        
        //Llenado de las matrices
        System.out.println("SUMA DE MATRICES");
        
        //Matriz #1
        System.out.println("Llenado de la matriz #1...\n");
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print("Ingrese matriz["+i+"]["+j+"]: ");
                matriz1[i][j]= entrada.nextInt();
            }
        }
        System.out.println("");
        
        //Matriz #2
        System.out.println("Llenado de la matriz #2...\n");
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print("Ingrese matriz["+i+"]["+j+"]: ");
                matriz2[i][j]= entrada.nextInt();
            }
        }
        System.out.println("");
        
        //Sumar matrices
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                suma[i][j]= matriz1[i][j] + matriz2[i][j];
            }
        }
        
        //Mostrar suma
        System.out.println("La suma de las matrices es:\n");
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print("["+suma[i][j]+"]");
            }
            System.out.println("");
        }
        System.out.println("");
    }
}
