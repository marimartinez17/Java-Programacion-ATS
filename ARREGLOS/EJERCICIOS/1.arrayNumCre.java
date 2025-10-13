//Leer 5 números, guardarlos en un arreglo y mostrarlos en el mismo orden introducido

package com.mycompany.arraynum;

import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class App {

    public static void main(String[] args) {
        int[] num = new int[5];
        
        // Solicitar num y llenar arreglo
        for(int i=0;i<5;i++){
            num[i]= Integer.parseInt(JOptionPane.showInputDialog((i+1)+"-. Ingresar número:"));
        }
        
        //Mostrar arreglo
        System.out.println("Números Ingresados: ");
        for (Integer i: num){
            System.out.print(i+"  ");
        }
    }
}
