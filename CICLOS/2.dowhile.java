/*
 * Do while
 */

package com.mycompany.dowhil;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class App {

    public static void main(String[] args) {
        int i = 1, contador;
        
        // Números del 1 al 10
        do {
            System.out.println(i);
            i++;
        } while (i <= 10);
        
        // Numeros del 10 al 1
        
        i = 10;
        do {
            System.out.println(i);
            i--;
        } while (i >=1);
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de términos: ");
        contador = entrada.nextInt();
        
        i = 1;
        
        do {
            System.out.println(i);
            i++;
        } while (i <= contador);
    }
}
