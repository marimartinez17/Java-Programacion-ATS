//Leer 5 números, guardarlos en un arreglo y mostrarlos en el orden inverso al de llenado.

package com.mycompany.arraynumdec;

import javax.swing.JOptionPane;

public class App {

    public static void main(String[] args) {
        int[] num = new int[5];
        
        // Solicitar num y llenar arreglo
        for(int i=0;i<5;i++){
            num[i]= Integer.parseInt(JOptionPane.showInputDialog((i+1)+"-. Ingresar número:"));
        }
        
        //Mostrar arreglo
        System.out.print("Números Ingresados: ");
        for (int i=4;i>=0;i--){
            System.out.print(num[i]+"   ");
        }
    }
}

