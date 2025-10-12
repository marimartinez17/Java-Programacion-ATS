/*
 * Pedir 10 num y escribir la suma total
 */

package com.mycompany.num;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class App {

    public static void main(String[] args) {
        
        int num, suma = 0;
        
        Scanner entrada = new Scanner(System.in);
        
        for (int i=0; i<10; i++){
            System.out.print("Ingrese un número: ");
            num = entrada.nextInt();
            suma += num;
        }
        
        System.out.println("La suma de los números es: "+suma);
    }
}
