/*
 */

package com.mycompany.megaplaza;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author usuario
 */
public class App {

    public static void main(String[] args) {
        float precio;
        
        precio = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el monto de su compra: "));
        
        if (precio > 300){
            // Restar descuento del 20%
            precio = (float)(precio -(precio * 0.20));
            JOptionPane.showMessageDialog(null, "Su total es de: "+precio+"$.");
        } else {
            JOptionPane.showMessageDialog(null, "Su total es de: "+precio+"$.");
        }
    }
}
