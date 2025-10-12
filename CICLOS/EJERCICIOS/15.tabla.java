/*
 * Pide un número entre 1 y 10 y muestra la tabla de multiplicar de dicho número
 */

package com.mycompany.tabla;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class App {

    public static void main(String[] args) {
        int num;
        Scanner entrada = new Scanner(System.in);
        
        do {
            System.out.print("Ingrese un número del 1 al 10 para ver su tabla de multiplicar: ");
            num = entrada.nextInt();
        } while (num < 0 || num > 10);
        
        
        
        for (int i=0; i<=10; i++){
            System.out.println(num+" x "+i+" = "+(num*i));
        }
    }
}
