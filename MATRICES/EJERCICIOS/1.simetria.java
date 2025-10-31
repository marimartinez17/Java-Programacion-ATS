/*
 * Ej #1: Crear y cargar una matríz de tamaño n x m  y decir si es simétrica o no
 */

package com.mycompany.simetria;

import javax.swing.JOptionPane;

public class App {

    public static void main(String[] args) {
        int matriz[][], nFilas, nCol;
        
        // Solicitar tamaño de la matriz
        nFilas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de filas: "));
        nCol = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de columnas: "));
        
        // Definir dimension de la matriz
        matriz = new int[nFilas][nCol];
        
        // Solicitar elementos de la matriz
        JOptionPane.showMessageDialog(null, "A continuación, deberá ingresar los elementos de la matriz: ");
        for (int i=0;i<nFilas;i++){
            for (int j=0;j<nCol;j++){
                matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Matriz ["+(i)+"]["+(j)+"]:"));
            }
        }
        
        boolean simetrica = true;
        // Determinar si es simétrica
        if (nFilas == nCol){ // Si la matriz es cuadrada
            int i=0,j=0;
            while (i<nFilas && simetrica==true){
                while (j<i && simetrica==true){
                    if (matriz[i][j] != matriz[j][i]){
                        simetrica = false;
                    }
                    j++;
                }
                i++;
            }
            
            if (simetrica==true){
                JOptionPane.showMessageDialog(null, "La matriz es simétrica.");
            } else{
                JOptionPane.showMessageDialog(null, "La matríz no es simétrica.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "La matríz no es simétrica.");
        }
    }
}
