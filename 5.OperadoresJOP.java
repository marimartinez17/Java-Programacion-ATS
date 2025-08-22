/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.jop;

import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class App {

    public static void main(String[] args) {
        float num1,num2,suma,resta,mult,div,resto;
        
        //Entrada de datos
        num1 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese un número: "));
        num2 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese otro número"));
        
        //Operaciones aritmeticas
        suma = num1 + num2;
        resta = num1 - num2;
        mult = num1 * num2;
        div = num1 / num2;
        resto = num1 % num2;
        
        JOptionPane.showMessageDialog(null, "El resultado de la suma es: "+suma);
        JOptionPane.showMessageDialog(null, "El resultado de la resta es: "+resta);
        JOptionPane.showMessageDialog(null, "El resultado de la multiplicación es: "+mult);
        JOptionPane.showMessageDialog(null, "El resultado de la división es: "+div);
        JOptionPane.showMessageDialog(null, "El resto de la división es: "+resto);
    }
}
