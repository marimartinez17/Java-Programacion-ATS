/*
 * Ejercicio #9: Crear un programa que lea por teclado una tabla de 10 números enteros y la desplace una posición hacia abajo
 */

package com.mycompany.deplazar;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        int arreglo[] = new int[10];
        int ultimo;
        Scanner entrada = new Scanner(System.in);
        
        //Solicitar números al usuario
        for (int i=0;i<10;i++){
            System.out.print((i+1)+") Ingrese un número entero: ");
            arreglo[i] = entrada.nextInt();
        }
        
        //Guardar número de la última posicion
        ultimo = arreglo[9];
      
        //OPCION #1 (MÍA)
//        //Desplazar posicion
//        for (int i=9;i>0;i--){
//            arreglo[i] = arreglo[i-1];
//        }
//        
//        //Ultimo elemento toma la primera posición
//        arreglo[0]=ultimo;
    
        // OPCIÓN #2 (ATS)      
        for (int i=8;i>=0;i--){
            arreglo[i+1]=arreglo[i];
        }
        arreglo[0]=ultimo;
        
        //Mostrar array ordenado
        for (int i=0;i<10;i++){
            System.out.print(arreglo[i]+"  ");
        }
    }
}
