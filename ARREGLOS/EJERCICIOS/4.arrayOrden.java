/*
 * Leer 10 números enteros, guardarlos en un arreglo.
 * Debemos mostrarlos en el siguiente orden: El primero, el último, el segundo, el penúltimo, el tercero, etc.
 */

package com.mycompany.arrayyorden;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class App {

    public static void main(String[] args) {
        // Declaraciones
        int[] num = new int[10];
        Scanner entrada = new Scanner(System.in);
        
        //Solicitar números
        System.out.println("Llenado del array: ");
        for (int i=0;i<10;i++){
            System.out.print((i+1)+"-. Ingrese un numero: ");
            num[i] =entrada.nextInt();
        }
        
        // Salida de datos
        System.out.println("Números ingresados: ");
        for (int i=0;i<5;i++){
            System.out.print(num[i]+"  ");
            System.out.print(num[9-i]+"  ");
        }
    }
}
