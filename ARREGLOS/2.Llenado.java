/*
 * Llenar un arreglo
 */

package com.mycompany.llenadoarrays;

import javax.swing.JOptionPane;
import javax.swing.JRootPane;

// Llenado de arreglos

public class App {

    public static void main(String[] args) {
        int numElementos;
        
        // Solicitar tamaño
        numElementos = Integer.parseInt(JOptionPane.showInputDialog("Ingresar tamaño del arreglo: "));
        
        char[] letras = new char[numElementos];
        
        // Solicitar elementos
        for (int i=0; i<numElementos;i++){
            letras[i] = JOptionPane.showInputDialog("Ingrese el elemento(char) #"+(i+1)+": ").charAt(0);
        }
        
        System.out.print("Los caracteres del arreglo son: ");
        for(int i=0;i<numElementos;i++){
            System.out.print(letras[i]+"    ");
            //System.out.println("Caracter #"+(i+1)+": "+letras[i]);
        }
    }
}
