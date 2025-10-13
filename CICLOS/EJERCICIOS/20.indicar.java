/*
 * Pedir 10 números e indicar si hay algún negativo
 */

package com.mycompany.indicar;

import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class App {

    public static void main(String[] args) {
        int num;
        boolean numNeg = false;
        
        for (int i=0; i<10; i++){
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingresar un número: "));
            if (num < 0){
                numNeg = true;
            }
        }
        
        if (numNeg == true){
            JOptionPane.showMessageDialog(null, "Sí existe al menos un número negativo.");
        } else {
            JOptionPane.showMessageDialog(null, "No existe ningún número negativo.");
        }
    }
}
