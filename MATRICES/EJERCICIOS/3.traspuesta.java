/*
 * Ej #3; Crear y cargar una matriz de tamaño 3x3, trasponerla y mostrarla.
 */

package com.mycompany.traspuesta;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class App {

    public static void main(String[] args) {
        int matriz[][] = new int[3][3];
        Scanner entrada = new Scanner(System.in);
        
        // Llenado de la matriz
        System.out.println("LLenando la matriz ...");
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print("Matriz ["+i+"]["+j+"]: ");
                matriz[i][j]= entrada.nextInt();
            }
        }
        System.out.println("");
        
        // Mostrar matriz
        System.out.println("\nMatriz Original:");
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println("");
        }
        System.out.println("");
        
        // Trasponer la matriz
        int aux;
        for (int i=0;i<3;i++){
            for (int j=0;j<i;j++){
                aux=matriz[i][j];
                matriz[i][j]=matriz[j][i];
                matriz[j][i]=aux;
            }
        }
        
        // Mostrar la matriz transpuesta
        System.out.println("\nMatriz Traspuesta:");
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println("");
        }
        System.out.println("");
    }
}
