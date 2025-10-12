/*
 * Leer un número y mostrar su cuadrado, repetir el proceso hasta que se introduzca un número negativo.
 */

package com.mycompany.cuadradonum;

import javax.swing.JOptionPane;

public class App {

    public static void main(String[] args) {
        int num;
        
        // Solicitar número al usuario
        num = Integer.parseInt(JOptionPane.showInputDialog("Ingtrese un número:"));
        
        while (num > 0){
            // Calcular cuadrado del número
            JOptionPane.showMessageDialog(null, "El cuadrado del número es: "+(Math.pow(num, 2)));
            // Pedir otro número
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingtrese otro número:"));
        }        
        
//        // Con casting de double a int
//        int cuadrado;
//        
//        // Solicitar número al usuario
//        num = Integer.parseInt(JOptionPane.showInputDialog("Ingtrese un número:"));
//        
//        while (num > 0){
//            // Calcular cuadrado del número
//            cuadrado = (int)Math.pow(num, 2);
//            JOptionPane.showMessageDialog(null, "El cuadrado del número es: "+(Math.pow(num, 2)));
//            // Pedir otro número
//            num = Integer.parseInt(JOptionPane.showInputDialog("Ingtrese otro número:"));
//        }
    }
}
