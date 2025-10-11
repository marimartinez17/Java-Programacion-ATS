/*
 * Pedir el día, mes y año de una fecha e indicar si ña fecha es correcta. Suponiendo que todos los meses son de 30 días.
 */

package com.mycompany.fecha;

import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class App {

    public static void main(String[] args) {
        int dia, mes, año;
        
        // Solicitar datos de la fecha al usuario
        dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el día: "));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes: "));
        año = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año: "));
        
        if (dia >= 1 && dia <= 30){
            // Si el día es correcto
            if (mes >= 1 && mes <= 12){
                // Si el mes es correcto
                if (año > 0){
                    // Si el año es correcto
                    JOptionPane.showMessageDialog(null, "Fecha correcta.");
                } else {
                    JOptionPane.showMessageDialog(null, "Fecha incorrecta, año inválido.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Fecha incorrecta, mes inválido.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Fecha incorrecta, día inválido.");
        }
    }
}
