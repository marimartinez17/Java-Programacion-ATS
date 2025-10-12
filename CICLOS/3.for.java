/*
 * Ciclo for
 */

package com.mycompany.forciclo;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        // Números del 1 al 10
        for (int i=1; i<=10; i++){
            System.out.println(i);
        }
        
        // Números de 10 hasta 1
        for (int i=10; i>=1; i--){
            System.out.println(i);
        }
        
        // n Números
        int num;
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de términos: ");
        num = entrada.nextInt();
        
        for (int i=1; i<=num; i++){
            System.out.println(i);
        }
    }
}
