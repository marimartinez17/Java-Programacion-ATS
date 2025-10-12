/*
 * Pedir números hasta que se introduzca uno negativo y calcula la media.
 */

package com.mycompany.medianum;

import javax.swing.JOptionPane;


public class App {

    public static void main(String[] args) {
        int numero, suma = 0, contador = 0, media;
        
        // Solicitar num inicial
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número positivo\n(Ingrese uno negativo para terminar)"));
        
        while (numero >= 0) {
            // Acumular num ingresados
            suma+= numero;
            
            // Contar num ingresados
            contador++;

            // Solicitar otro número
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro número positivo: "));
        }
        
        // Calcular media de los números ingresados
        media = suma / contador;
        
        // Mostrar el resultado
        JOptionPane.showMessageDialog(null, "La media de los números ingresados es: "+media);
    }
}
