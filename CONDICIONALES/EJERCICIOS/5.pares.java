/*
 *  Hacer un programa que tome dos números y diga si ambos son pares o impares
 */

package com.mycompany.pares;

import javax.swing.JOptionPane;

public class App {

    public static void main(String[] args) {
        int num1, num2;
        
        // Solicitar dos numeros al usuario
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número: "));
        
        // Determinar si los números son pares o impares y mostrar resultados
        if ((num1%2 == 0) && (num2%2 == 0)){
            JOptionPane.showMessageDialog(null, "Ambos números son pares.");
        } else if ((num1%2 == 0) && (num1%2 != 0)){
            JOptionPane.showMessageDialog(null, num1+" es par y "+num2+" es impar.");
        } else if ((num1%2 != 0) && (num2%2 == 0)){
            JOptionPane.showMessageDialog(null, num1+" es impar y "+num2+" es par.");
        } else {
            JOptionPane.showMessageDialog(null, "Ambos números son impares.");
        }
    }
}
