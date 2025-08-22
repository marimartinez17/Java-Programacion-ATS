/*

    Hacer un programa que calcule e imprima el salario semanal
de un empleado a partir de sus horas semanales trabajadas y de
su salario por hora

 */

package com.mycompany.ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        
        int horasTrabajadas;
        float salarioHora, salarioSemanal;
        
        Scanner inputHoras = new Scanner(System.in);
        Scanner inputSalario = new Scanner(System.in);
        
        // Solicitar datos al usuario
        System.out.print("Ingrese las horas semanales trabajadas: ");
        horasTrabajadas = inputHoras.nextInt();
        
        System.out.print("Ingrese el salario por hora del empleado: ");
        salarioHora = inputSalario.nextFloat();
        
        // Calculo de salario semanal
        salarioSemanal = horasTrabajadas * salarioHora;
        
        // Salida de datos
        System.out.println("El salario semanal del empleado es: "+salarioSemanal);
    }
}
