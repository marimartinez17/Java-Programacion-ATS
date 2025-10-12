/*
 * Leer un número e indicar si es positivo o negativo. El proceso se repetirá hasta que se ingrese un 0.
 */

package com.mycompany.leernum;

import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class App {

    public static void main(String[] args) {
        int num;
        
        // Solicitar número
        num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número para\nsaber si es positivo o negativo.\n(Ingrese 0 para salir) "));
    
        while (num != 0){
            // Si número es dif de 0
            if (num > 0){
                // Si número es positivo
                JOptionPane.showMessageDialog(null, num+" es un número positivo.");
            } else {
                // Si número es negativo
                JOptionPane.showMessageDialog(null, num+" es un número negativo.");
            }
            
            //Solicitar otro número
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro número: "));
        }
    }
}
