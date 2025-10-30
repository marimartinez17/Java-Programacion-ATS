/*
 * Definición de matrices
 */

package com.mycompany.matrices;

import javax.swing.JOptionPane;

public class App {

    public static void main(String[] args) {
        
        // Matriz declarada
        int matriz[][] = {{1,2,3},{4,5,6},{7,8,9}};
        
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print("["+(matriz[i][j])+"]");
            }
            System.out.println("");
        }
        System.out.println("");
        
        // Matriz digitada por el usuario
        int matriz2[][], nFilas, nColumnas;
        
        nFilas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de filas: "));
        nColumnas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de columnas: "));
        
        matriz2 = new int[nFilas][nColumnas];
        
        for (int i=0;i<nFilas;i++){ // Ciclo exterior iteera filas
            for (int j=0;j<nColumnas;j++){// Ciclo interior iteera filas
                matriz2[i][j]= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el elemento ["+(j+1)+"] de la fila ["+(i+1)+"]:"));
            }
        }
        
        // Mostrar matriz
        System.out.println("La matriz ingresada es: ");
        for (int i=0;i<nFilas;i++){
            for (int j=0;j<nColumnas;j++){
                System.out.print("["+(matriz[i][j])+"]");
            }
            System.out.println("");
        }
        
    }
}
