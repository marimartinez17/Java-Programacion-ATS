/*
 * Ejercicio # 6: Utilizando dos matrices de tamaño 5x9 y 9x5, cargar la primera y trasponerla en la segunda

 */

package com.mycompany.trasponersegunda;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class App {

    public static void main(String[] args) {
        int matriz1[][] = new int [5][9];
        int matriz2[][] = new int [9][5];
        Scanner entrada = new Scanner(System.in);
        
        // Llenar matriz
        for (int i=0;i<5;i++){
            for (int j=0;j<9;j++){
                System.out.print("Matriz ["+i+"]["+j+"]: ");
                matriz1[i][j]= entrada.nextInt();
            }
        }
        
        // Mostrar matriz
        System.out.println("\nMatriz Original:");
        for (int i=0;i<5;i++){
            for (int j=0;j<9;j++){
                System.out.print("["+matriz1[i][j]+"]");
            }
            System.out.println("");
        }
        System.out.println("");

        // Trasponer matriz
        int aux;
        for (int i=0;i<9;i++){
            for (int j=0;j<5;j++){
                matriz2[i][j]=matriz1[j][i];
            }
        }
        
        // Mostrar matriz traspuesta
        System.out.println("\nMatriz Traspuesta:");
        for (int i=0;i<9;i++){
            for (int j=0;j<5;j++){
                System.out.print("["+matriz2[i][j]+"]");
            }
            System.out.println("");
        }
    }
}
