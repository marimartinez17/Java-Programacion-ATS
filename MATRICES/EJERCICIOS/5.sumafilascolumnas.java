/*
 * Ejercicio # 5:  Crear y cargar una matriz de tamalo n x m, mostrar la suma de cada fila y de cada columna. 
*/

package com.mycompany.sumafilascolumnas;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class App {

    public static void main(String[] args) {
        int matriz[][], nFilas, nCol, sumaFilas, sumaColumnas;
        
        //Declaracion del scanner
        Scanner entrada = new Scanner(System.in);
        
        nFilas = Integer.parseInt(JOptionPane.showInputDialog("Digite el número de filas: "));
        nCol = Integer.parseInt(JOptionPane.showInputDialog("Digite el número de columnas: "));
        
        matriz = new int[nFilas][nCol];
        
        // Llenar matriz
        for (int i=0;i<nFilas;i++){
            for (int j=0;j<nCol;j++){
                System.out.print("Ingrese matriz["+i+"]["+j+"]: ");
                matriz[i][j]= entrada.nextInt();
            }
        }
        
        //Mostrar matriz
        System.out.println("La matriz es:\n");
        for (int i=0;i<nFilas;i++){
            for (int j=0;j<nCol;j++){
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println("");
        }
        System.out.println("");
        
        // Sumar filas
        for (int i=0;i<nFilas;i++){
            sumaFilas=0;
            for (int j=0;j<nCol;j++){
                sumaFilas+=matriz[i][j];
            }
            System.out.println("La suma de la fila "+i+" es: "+sumaFilas);
        }
        System.out.println("");
        
        // Sumar columnas
        for (int j=0;j<nCol;j++){
            sumaColumnas=0;
            for (int i=0;i<nFilas;i++){
                sumaColumnas+=matriz[i][j];
            }
            System.out.println("La suma de la columna "+j+" es: "+sumaColumnas);
        }
    }
}
