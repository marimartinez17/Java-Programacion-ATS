package com.mycompany.calificaciones;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class App {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float participacion, parcial1, parcial2, parcialFinal, notaFinal;
        
        System.out.print("Ingrese la nota de participacion: ");
        participacion = entrada.nextFloat();
        
        System.out.print("Ingrese la nota del primer parcial: ");
        parcial1 = entrada.nextFloat();
        
        System.out.print("Ingrese la nota del segundo parcial: ");
        parcial2 = entrada.nextFloat();
        
        System.out.print("Ingrese la nota del parcial final: ");
        parcialFinal = entrada.nextFloat();
        
        participacion *= 0.10f;
        parcial1 *= 0.25f;
        parcial2 *= 0.25f;
        parcialFinal *= 0.40f;
        
        notaFinal = participacion + parcial1 + parcial2 + parcialFinal;
    
        System.out.println("La calificacion final del estudiante es: "+notaFinal);
        
    }
  
}
