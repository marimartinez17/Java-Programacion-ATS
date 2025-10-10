/*
 * Sentencia Switch - Case
 */

package com.mycompany.switchcase;

import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class App {

    public static void main(String[] args) {
        int dato;
        
        dato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número entre 1 y 5: "));
        
        switch(dato) {
            case 1: JOptionPane.showMessageDialog(null, "El número es 1.");
                    break;
            case 2: JOptionPane.showMessageDialog(null, "El número es 2.");
                    break;
            case 3: JOptionPane.showMessageDialog(null, "El número es 3.");
                    break;
            case 4: JOptionPane.showMessageDialog(null, "El número es 4.");
                    break;
            case 5: JOptionPane.showMessageDialog(null, "El número es 5.");
                    break;
            default: JOptionPane.showMessageDialog(null, "El número no está en el rango de 1 a 5.");
        }
    }
}
