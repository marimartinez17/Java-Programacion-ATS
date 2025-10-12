/*
 * Dadas las edades y alturas de 5 alumnos, mostrar la edad y la estatura media, la cantidad de alumnos mayores de 18 años 
 * y la cantidad de alumnos que miden más de 1.75
 */

package com.mycompany.alumnos;

import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class App {

    public static void main(String[] args) {
        int edad;
        float altura, edadMedia, alturaMedia;
        
        // Contadores y acumuladores
        int acumEdades = 0, acumAlturas= 0, contMayores=0, contAltos=0;
        
        for (int i=0; i<5; i++){
            
            // Solicitar edad
            edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del alumno #"+(i+1)+":"));
            acumEdades += edad;
            
            if (edad > 18){
                contMayores++;
            }
            
            // Solicitar altura
            altura = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la altura del alumno #"+(i+1)+":"));
            acumAlturas += altura;
            
            if (altura > 1.75){
                contAltos++;
            }
        }
        
        // Calcular altura y edad media
        edadMedia = acumEdades / 5;
        alturaMedia = acumAlturas / 5;
        
        // Salida de datos
        JOptionPane.showMessageDialog(null, "INFORMACIÓN DE LOS ESTUDIANTES\n"
                +"\nEdad media: "+edadMedia
                +"\nEstatura media: "+alturaMedia
                +"\nAlumnos mayores de 18 años: "+contMayores
                +"\nAlumnos que miden más de 1.75: "+contAltos);
    }
}
