/*
 * MÉTODO BURBUJA
 */

package com.mycompany.burbuja;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class App {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[], nElementos;
        
        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de elementos: "));
        
        arreglo = new int [nElementos];
        
        for (int i=0;i<nElementos;i++){
            System.out.print((i+1)+") Ingrese un número: ");
            arreglo[i]= entrada.nextInt();
        }
        
        // Método burbuja
        int aux;
        for (int i=0;i<nElementos-1;i++){
            for (int j=0;j<(nElementos-1);j++){
                if (arreglo[j]>arreglo[j+1]){
                    aux = arreglo[j];
                    arreglo[j]=arreglo[j+1];
                    arreglo[j+1]=aux;
                }
            }
        }
        
        //Mostrando el arreglo ordenado de forma creciente
        System.out.print("Arreglo ordenado en forma creciente: ");
        for (int i=0;i<nElementos;i++){
            System.out.print(" "+(arreglo[i]));
        }
        
        //Mostrar array en forma decreciente
        System.out.print("\nArreglo ordenado en forma decreciente: ");
        for (int i=(nElementos-1);i>=0;i--){
            System.out.print(" "+(arreglo[i]));
        }
    }
}
