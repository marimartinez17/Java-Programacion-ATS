/*
 * Pedir números hasta que se teclee uno negativo y mostrar cuántos números se han introducido.
 */

package com.mycompany.numeros;

import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class App {

    public static void main(String[] args) {
        int num, contador = 0;
        
        // Solicitar número
        num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número:"));
        
        while (num >= 0){
            // Contar números ingresados
            contador ++;
            // Mostrar cantidad
            JOptionPane.showMessageDialog(null, "Números ingresados: "+contador);
            // Solicitar otro número
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro número:"));
        }
    }
}
