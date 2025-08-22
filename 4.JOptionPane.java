
package com.mycompany.proyecto4;

import javax.swing.JOptionPane;

public class Proyecto4 {

    public static void main(String[] args) {
        String cadena;
        int entero;
        char letra;
        double decimal;
        
        cadena = JOptionPane.showInputDialog("Ingrese una cadena de texto: ");
        entero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un entero: "));
        letra = JOptionPane.showInputDialog("Ingrese un caracter: ").charAt(0);
        decimal = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un número decimal: "));
        //Lo mismo se realiza para float
        
        JOptionPane.showMessageDialog(null,"La cadena es: "+cadena);
        JOptionPane.showMessageDialog(null,"El número entero es: "+entero);
        JOptionPane.showMessageDialog(null,"El caracter es: "+letra);
        JOptionPane.showMessageDialog(null,"El número decimal es: "+decimal);
    }
}
