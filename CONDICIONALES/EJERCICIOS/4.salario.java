/*
 * Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera:
 * * Si trabaja 40 horas o menos se le paga 16$ por hora.
 * * Si trabaja más de 40 horas se le paga 16$ por cada una de las primeras horas y 20$ por cada hora extra.
 */

package com.mycompany.obreros;

import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class App {

    public static void main(String[] args) {
        int horas;
        float salario;
        
        // Solicitar horas trabajadas
        horas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas trabajadas: "));
        
        // Determinar salario
        if (horas <= 40){
            // 16$ la hora
            salario = horas * 16;
        } else {
            //16$ la hora más 20$ por cada hora extra
            salario = ((horas - 40) * 20) + (40 * 16);
        }
        
        // Salida de datos
        JOptionPane.showMessageDialog(null,"El salario semanal del trabajador es: "+salario+"$.");
    }
}
