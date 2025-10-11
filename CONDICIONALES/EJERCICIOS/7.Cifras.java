/*
 * Pedir un número entre 0 y 99999 y decir cuantas cifras tiene
 */

package com.mycompany.cifras;

import javax.swing.JOptionPane;

public class App {

    public static void main(String[] args) {
        int num;
        do {
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número entre 0 y 99999:"));
        } while (num < 0 || num > 99999);
        
        if (num <10){
            JOptionPane.showMessageDialog(null, num+" tiene una cifra.");
        } else if (num < 100) {
            JOptionPane.showMessageDialog(null, num+" tiene dos cifras.");
        } else if (num < 1000) {
            JOptionPane.showMessageDialog(null, num+" tiene tres cifras.");
        } else if (num < 10000) {
            JOptionPane.showMessageDialog(null, num+" tiene cuatro cifras.");
        } else {
            JOptionPane.showMessageDialog(null, num+" tiene cinco cifras.");
        }
    }
}
