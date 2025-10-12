/*
 * Pedir números hasta que se introduzca uno negativo y calcula la media.
 */

package com.mycompany.medianum;

import javax.swing.JOptionPane;


public class App {

    public static void main(String[] args) {
        int numero, suma = 0, contador = 0;
        
        // Solicitar num inicial
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número positivo: "));
        
        while (numero >= 0) {
            // Acumular num ingresados
            suma+= numero;
            // Contar num ingresados
            contador++;
            // Mostrar contador y suma
            JOptionPane.showMessageDialog(null, "Suma actual: "+suma+"\nNúmeros ingresados: "+contador);
            // Solicitar otro número
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro número positivo: "));
        }

    }
}
