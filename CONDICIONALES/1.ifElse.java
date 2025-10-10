/*
 Sentencia if
 */

package com.mycompany.condicionales;

import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class App {

    public static void main(String[] args) {
        int numero, dato = 5;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero: "));
        
        // Verificar si el numero es 5
        if (numero == dato) {
            JOptionPane.showMessageDialog(null, "El numero es 5.");
        } else {
            JOptionPane.showMessageDialog(null, "El numero es diferente de 5.");
        }
        
        // Verificar que el numero sea dif de 5
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro número: "));
        
        if (numero != dato){
            JOptionPane.showMessageDialog(null, "El número es diferente de 5.");
        } else {
            JOptionPane.showMessageDialog(null, "El número es 5.");
        }
        
        // Verificar que el número sea mayor que 5
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro número: "));
        if (numero > dato){
            JOptionPane.showMessageDialog(null, "El número es mayor a 5.");
        } else {
            JOptionPane.showMessageDialog(null, "El numero es igual o menor a 5.");
        }
    }
}
