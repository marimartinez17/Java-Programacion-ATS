/*
 * Hacer un programa que pase de Kg a otra unidad de medida de masa, mostrar en pantalla un menú con las opciones posibles.
 */

package com.mycompany.masa;

import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class App {

    public static void main(String[] args) {
        int opcion;
        float masa, conversion;
        
        // Solicitar monto en kg
        masa = Float.parseFloat(JOptionPane.showInputDialog("CONVERSOR DE MASA (KG)\nIngresar la masa en kg:"));
        
        // Mostrar menú de opciones
        opcion = Integer.parseInt(JOptionPane.showInputDialog("""
                                                              Ingrese la unidad a la que desea convertir los Kg:
                                                              1) Hectogramo (hg).
                                                              2) Decagramo (dag).
                                                              3) Gramo (g).
                                                              4) Decigramo (dg).
                                                              5) Centigramo (cg).
                                                              6) Miligramo (mg).
                                                              7) Salir."""));
    
        // Convertir kilogramos
        switch (opcion) {
            case 1:
                // Hectogramos
                conversion = masa * 10;
                JOptionPane.showMessageDialog(null, "La masa es de: "+conversion+" hg.");
                break;
            case 2:
                // Decagramos
                conversion = masa * 100;
                JOptionPane.showMessageDialog(null, "La masa es de: "+conversion+" dag.");
                break;
            case 3:
                // Gramos
                conversion = masa * 1000;
                JOptionPane.showMessageDialog(null, "La masa es de: "+conversion+" g."); 
                break;
            case 4:
                // Decigramos
                conversion = masa * 10000;
                JOptionPane.showMessageDialog(null, "La masa es de: "+conversion+" dg.");
                break;
            case 5:
                // Centigramos
                conversion = masa * 100000;
                JOptionPane.showMessageDialog(null, "La masa es de: "+conversion+" cg.");
                break;
            case 6:
                // Miligramos
                conversion = masa * 1000000;
                JOptionPane.showMessageDialog(null, "La masa es de: "+conversion+" mg.");
                break;
            case 7:
                // Salir
                break;
            default:
                
                // Error
                JOptionPane.showMessageDialog(null, "Opción invalida.");
        }
    }
}
