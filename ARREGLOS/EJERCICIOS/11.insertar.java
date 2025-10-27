/*
 * Ejercicio # 11:  Leer 5 elementos numéricos que se introducirán ordenados de forma creciente. 
 * Éstos los guardaremos en una tabla de tamaño 10. Leer un número N, e insertarlo en el lugar 
 * adecuado para que la tabla continúe ordenada.
 */

package com.mycompany.insertar;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class App {

    public static void main(String[] args) {
        // Declaraciones
        int arreglo[] = new int[10];
        int num, numAnterior;
        boolean creciente = true;
        Scanner entrada = new Scanner(System.in);
 
        // Solicitar ingresar números mientras el arreglo no esté en forma creciente. 
        do {
            // Llenado del array
            System.out.println("Ingrese los primeros 5 núm del arreglo.");
            for (int i=0;i<5;i++){
                System.out.print("Número "+(i+1)+": ");
                arreglo[i]=entrada.nextInt();
            }
            //Verificar que el array esté ordenado de forma creciente
            for (int i=0;i<4;i++){
                if (arreglo[i]<arreglo[i+1]){
                    creciente = true;
                } else if (arreglo[i]>arreglo[i+1]){
                    creciente = false;
                    break;
                } else {
                    creciente = false;
                }
            }

            if (creciente == false){
                System.out.println("El arreglo no está ordenado en forma creciente. Vuelva a digitar.");
            }
        } while (creciente == false);
        
        System.out.print("Ingrese el número a insertar:  ");
        num = entrada.nextInt();
        
        //Determinar posicion del num ingresado
        int j=0, sitioNum=0;
        while (j<5 && arreglo[j]<num){
            sitioNum++;
            j++;
        }
        
        // Trasladar una posicion el arreglo a los elementos que van detras del numero
        for (int i=4;i>=sitioNum;i--){
            arreglo[i+1]=arreglo[i];
        }
        
        //Insertar num
        arreglo[sitioNum]=num;
        
        // Mostrar arreglo
        System.out.print("ARREGLO: ");
        for (int i=0;i<6;i++){
            System.out.print(arreglo[i]+" ");
        }
    
    }
}
