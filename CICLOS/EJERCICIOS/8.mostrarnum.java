/*
 * Pedir un número N y mostrar todos los números del 1 al N.
 */

package com.mycompany.mostrarnum;

import javax.swing.JOptionPane;

public class App {

    public static void main(String[] args) {
        // Declarar e inicializar indice en 1
        int i=1, num;
        
        // Solicitar cantidad de números a mostrar
        num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
        
        do {
            // Imprimir números
            System.out.println(i);
            i++;
        } while (i<=num);
    }
}
