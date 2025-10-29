/*
 * Ejercicio # 15: Leer 10 enteros ordenados crecientemente.
 * Leer N y buscarlo en la tabla. Se debe mostrar la posición en que se encuantra.
 * Si no está, indicarlo con un mensaje
 */

package com.mycompany.buscar;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class App {

    public static void main(String[] args) {
        int arreglo[] = new int[10];
        int num;
        boolean creciente;
        
        Scanner entrada = new Scanner(System.in);
        
        creciente = true;
        do{
            for (int i=0;i<10;i++){
                System.out.print((i+1)+") Ingrese un numero entero: ");
                arreglo[i]= entrada.nextInt();
            }

            for (int i = 0;i<9;i++){
                if (arreglo[i]<=arreglo[i+1]){
                    creciente = true;
                } else {
                    creciente = false; 
                    break;
                }
            }

            if (creciente == false){
                System.out.println("Arreglo no ordenado de forma creciente, intente nuevamente.");
            }
        } while (creciente == false);
        
        System.out.print("Ingrese un numero para conocer su posición en el arreglo: ");
        num = entrada.nextInt();
        
        // Forma #1 (mía)
        for (int i=0;i<10;i++){
            if (num == arreglo[i]){
                System.out.println("La posición de "+(num)+" es: "+(i));
            } else {
                System.out.println("El número no se encuentra en el arreglo.");
            }
        }
        
        // Forma # 2 (ATS)
        int i=0;
        while (i<10 && arreglo[i]<num){
            i++;
        }
        
        if (i==10){
            System.out.println("Número no encontrado.");
        } else {
            if (arreglo[i]==num){
                System.out.println("Número encontrado en la posición: "+(i));
            } else {
                System.out.println("Número no encontrado.");
            }
        }
    }
}
