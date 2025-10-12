/*
 * Pedir un número N y calcular su factorial
 */

package com.mycompany.factorial;

import java.util.Scanner;


public class App {

    public static void main(String[] args) {
        int num, factorial=1;
        
        Scanner entrada = new Scanner(System.in);
        
        // Solicitar N
        System.out.print("Ingrese un número para calcular su factorial: ");
        num = entrada.nextInt();
        
        // Calcular factorial
        for (int i=1; i<=num; i++){
            factorial *= i;
        }
        
        // Mostrar factorial
        System.out.println("El factorial de "+num+" es: "+factorial);
    }
}
