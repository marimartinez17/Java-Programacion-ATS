
package com.mycompany.mayus;

import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class App {

    public static void main(String[] args) {
        char letra;
        
        letra = JOptionPane.showInputDialog("Ingrese una letra: ").charAt(0);

        if (Character.isUpperCase(letra)){
            JOptionPane.showMessageDialog(null, letra+" es una letra mayúscula");
        } else {
            JOptionPane.showMessageDialog(null, letra+" es una letra minúscula.");
        }
    }
}

