/*
 * Pedir números hasta que se teclee un 0, mostrar la suma de todos los números introducidos.
 */

package com.mycompany.sumarnum;

import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class App {

    public static void main(String[] args) {
        int num, suma = 0;
        
        do {
            // Solicitar número
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingresar un número:\n(Ingrese 0 para salir)"));
            // Acumular números
            suma += num;
            // Mostrar suma
            JOptionPane.showMessageDialog(null, "La suma acumulada hasta el momento es: "+suma);
        } while (num != 0); // Terminar proceso si num == 0
    }
}
