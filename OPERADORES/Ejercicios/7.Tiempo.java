package com.mycompany.tiempo;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class App {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int horasTotales, semanas, dias, horas;
       
    
        System.out.print("Ingrese el numero de horas: ");
        horasTotales = entrada.nextInt();
        
        // Calcular semanas
        semanas = horasTotales / 168;
        // Calcular dias restantes
        dias = horasTotales%168 / 24;
        // Calcilar horas restantes
        horas = horasTotales%24;
        
        // Mostrar datos al usuario
        System.out.println("El equivalente es:");
        System.out.println("Semanas: "+semanas);
        System.out.println("Dias: "+dias);
        System.out.println("Horas: "+horas);
    }
}
