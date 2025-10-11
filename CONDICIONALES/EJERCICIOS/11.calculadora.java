/*
 * Construir un programa que simule el funcionamiento de una calculadora que puede realizar las cuatro operaciones 
 * aritméticas básicas (suma, resta, producto y división) con valores numéricos enteros. El usuario debe especificar 
 * la operación con el primer carácter del primer parámetro de la línea de comandos: S o s para la suma, R o r para 
 * la resta, P, p, M o m para el producto y D o d para la división.
 */

package com.mycompany.calculadora;

import javax.swing.JOptionPane;

public class App {

    public static void main(String[] args) {
        char op;
        float num1, num2;
        
        // Solicitar operación al usuario
        op = Character.toUpperCase(JOptionPane.showInputDialog("Seleccione la operación que desee realizar:\n1) Suma (S)\n2) Resta (R)\n3) Multiplicación (M o P)\n4) División (D)\n").charAt(0));
        
        // Solicitar números al usuario
        num1 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el número #1: "));
        num2 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el número #2: "));
        
        // Realizar operación y mostrar resultado
        
        switch (op) {
            // Adición
            case 'S':
                JOptionPane.showMessageDialog(null,"La suma de "+num1+" y "+num2+" es: "+(num1+num2));
                break;
            // Sustracción
            case 'R':
                JOptionPane.showMessageDialog(null,"La resta de "+num1+" y "+num2+" es: "+(num1-num2));
                break;
            // Multiplicación
            case 'P':
            case 'M':
                JOptionPane.showMessageDialog(null,"El producto de "+num1+" y "+num2+" es: "+(num1*num2));
                break;
            // División
            case 'D':
                JOptionPane.showMessageDialog(null,"La división de "+num1+" y "+num2+" es: "+(num1/num2));
                break;
            // Operación inválida
            default:
                JOptionPane.showMessageDialog(null,"Operación inválida.");
        }
    }
}
