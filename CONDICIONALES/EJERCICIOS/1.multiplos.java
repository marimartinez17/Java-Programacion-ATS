/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.multiplos;

import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class App {

    public static void main(String[] args) {
        int numero;
        // Solicitar número al usuario
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número entero: "));

        // Determinar si es múltiplo de 10 y mostrar resultado
        if (numero%10 == 0){
            JOptionPane.showMessageDialog(null, numero+" es un múltiplo de 10.");
        } else {
            JOptionPane.showMessageDialog(null, numero+" no es un múltiplo de 10.");
        }
    }
}
