/*
 * Ejericicio #8: Diseñar una aplicación que declare una tabla de 10 elementos enteros. 
 * Leer mediante el teclado 8 números. Después se debe pedir un número y una posición, 
 * insertarlo en la posición indicada, desplazando los que estén detrás.
 */

package com.mycompany.posicion;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        int num, posicion;
        int tabla[] = new int[10];
        Scanner entrada = new Scanner(System.in);
        
        // Solicitar números al usuario
        System.out.println("Declaración de la tabla inicial:");
        for (int i=0;i<10;i++){
            System.out.print((i+1)+") Ingrese un número entero: ");
            tabla[i] = entrada.nextInt();
        }

        //Solicitar posición
        System.out.println("INSERTAR NUEVO NÚMERO A LA TABLA");
        do {
            System.out.print("Ingrese la posición (1-10) en donde desea insertar un nuevo número: ");
            posicion = entrada.nextInt();
        } while (posicion < 1 || posicion > 10);
        posicion--;
        
        //Solicitar número
        System.out.print("Ingrese el nuevo número: ");
        num = entrada.nextInt();

        //Desplazar números hacia la derecha
        for(int i=9;i>posicion;i--){
            tabla[i]=tabla[i-1];
        }
        //Insertar número en la posición indicada
        tabla[posicion] = num;
        
        //Mostrar tabla
        System.out.println("TABLA FINAL:");
        for(int i=0;i<10;i++){
            System.out.print(tabla[i]+" ");
        }
    }
}
