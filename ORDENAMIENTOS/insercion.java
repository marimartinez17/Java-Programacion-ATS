/*
 * Ordenamiento por inserción
 */

package com.mycompany.insercion;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class App {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[],nElementos;

        nElementos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de elementos: "));

        arreglo = new int[nElementos];
         
        System.out.println("Llenado del arreglo ... ");
        for (int i=0;i<nElementos;i++){
            System.out.print("Ingresar elemento #"+(i+1)+": ");
            arreglo[i]= entrada.nextInt();
        }
        
        int pos,aux;
        for (int i=0;i<nElementos;i++){
            pos = i;//Posición
            aux = arreglo[i];//Numero actual
            
            // pos>0 ya que la primera posición no se compara
            while ((pos>0)&&(arreglo[pos-1]>aux)){
                arreglo[pos]=arreglo[pos-1];
                pos--;
            }
            arreglo[pos]=aux;
        }
        
        System.out.println("\nNumeros en orden ascendente: ");
        for (int i=0;i<nElementos;i++){
            System.out.print(arreglo[i]+" ");
        }
        System.out.println("");
        
        System.out.println("\nNumeros en orden descendente: ");
        for (int i=(nElementos-1);i>=0;i--){
            System.out.print(arreglo[i]+" ");
        }
        System.out.println("");
    }
}
