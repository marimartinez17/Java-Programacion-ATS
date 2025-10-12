/*
 * Realizar un juego para adivinar un número. Para ello generar un número aleatorio entre 0-100, y luego ir pidiendo números indicando 
 * "es mayor" o "es menor" según sea mayor o menor con respecto a N. El proceso termina cuando el usuario acierta y mostrar el número de intentos.
 */

package com.mycompany.randomnum;

import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class App {

    public static void main(String[] args) {
        int res, numAle, numPos, contIntentos=0;
        
        // Preguntar al user si desea jugar
        res = Integer.parseInt(JOptionPane.showInputDialog("¡Adivina el número del 1 al 100!\n(Ingresa 0 para salir)"));
        
        // Inicio del juego
        while (res != 0) {
            numAle = (int)Math.round(Math.random()*100);
            do {
                
                // Solicitar número posible
                numPos = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un número:"));
                if (numPos > numAle && numPos!=numAle) {
                    // Num random es menor
                    JOptionPane.showMessageDialog(null,"El número que buscas es menor al que ingresaste.");
                    // +1 intento
                    contIntentos++;
                } else if (numPos < numAle && numPos!=numAle){
                    // Num random es mayor
                    JOptionPane.showMessageDialog(null,"El número que buscas es mayor al que ingresaste.");
                    // +1 intento
                    contIntentos++;
                } else {
                    // numPos == numAle
                    contIntentos++;
                    JOptionPane.showMessageDialog(null, "¡Adivinaste! El número es: "+numAle+"\nNúmero de intentos: "+contIntentos);
                }
            } while (numPos != numAle);
            
            // Preguntar al user si desea seguir jugando
            res = Integer.parseInt(JOptionPane.showInputDialog("Presiona cualquier número para jugar nuevamente.\n(Ingresa 0 para salir)"));
        }
    }
}
