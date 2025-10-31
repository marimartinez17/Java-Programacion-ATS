/*
 * Ej # 4: Crear una matroz de tamaño 3x3 y rellenarla de manera que los elementos de la diagonal principal sean 1 y el resto 0
 */

package com.mycompany.rellenar;

/**
 *
 * @author usuario
 */
public class App {

    public static void main(String[] args) {
        int matriz[][] = new int[7][7];
        
        // Llenar matriz
        for (int i=0;i<7;i++){
            for (int j=0;j<7;j++){
                if (i==j){
                    matriz[i][j]=1;
                } else {
                    matriz[i][j]=0;
                }
            }
        }
        
        // Mostrar matriz
        for (int i=0;i<7;i++){
            for (int j=0;j<7;j++){
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println("");
        }
    }
}
