/*
 * Pedir 5 calificaciones de alumnos y decir al final si hay algún suspenso
 */

package com.mycompany.suspensos;

import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class App {

    public static void main(String[] args) {
        float nota;
        boolean suspensos= false;
        
        for (int i=0;i<5;i++){
            do {
                // Solicitar 
                nota = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la nota (del 0 al 10) del estudiante #"+(i+1)+": "));
                
            } while (nota < 0 || nota > 10); // Validar que la nota esté en el intervalo
        
            if (nota<4){
                suspensos = true;
            }
        }
        
        if (suspensos ==true){
            JOptionPane.showMessageDialog(null, "Hay al menos un estudiante suspenso.");
        } else {
            JOptionPane.showMessageDialog(null, "No hay estudiantes suspensos.");
        }
        
    }
}
