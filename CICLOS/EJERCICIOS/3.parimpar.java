/*
 * Leer números hasta que se introduzca un 0, para cada uno indicar si es par o impar.
 */

package com.mycompany.parimpar;

import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class App {

    public static void main(String[] args) {
        int num;
        
        // Solicitar número
        num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número para\nsaber si es par o impar.\n(Ingrese 0 para salir) "));
    
        while (num != 0){
            // Si número es dif de 0
            if (num%2 == 0){
                // Si número es par
                JOptionPane.showMessageDialog(null, num+" es un número par.");
            } else {
                // Si número es impar
                JOptionPane.showMessageDialog(null, num+" es un número impar.");
            }
            
            //Solicitar otro número
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro número: "));
        }
    }
}
