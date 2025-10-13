/*
 * Dadas 6 notas escribir la cantidad de alumnos aprobados,
condicionados (=6) y suspensos
 */

package com.mycompany.alumnos;

import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class App {

    public static void main(String[] args) {
        float nota;
        int contAprobados=0, contCondicionados=0, contSuspensos=0;
    
        for (int i=0; i<6; i++){
            do {
                // Solicitar 
                nota = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la nota (del 0 al 10) del estudiante #"+(i+1)+": "));
                
            } while (nota < 0 || nota > 10); // Validar que la nota esté en el intervalo
            
            // Determinar condicion del estudiante
            if (nota == 4){
                contCondicionados ++;
            } else if (nota >= 5){
                contAprobados++;
            } else {
                contSuspensos++;
            }
        }
        
        JOptionPane.showMessageDialog(null, "Estudiantes aprobados: "+contAprobados
                +"\nEstudiantes condicionados: "+contCondicionados
                +"\nEstudiantes reprobados: "+contSuspensos);
    }
}
