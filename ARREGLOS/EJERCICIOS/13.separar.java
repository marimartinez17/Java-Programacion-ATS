/*
 * Ejercicio #13:  Leer 10 enteros en una tabla.
 * Guardar en una tabla los elementos pares de la primera, y a continuación los elementos impares.
 */

package com.mycompany.separararrays;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class App {

    public static void main(String[] args) {
        // Declaración de la tabla inicial
        int tablaInicial[] = new int[10];
        
        // Declaración del scánner
        Scanner entrada = new Scanner(System.in);
        
        // Leer enteros
        for (int i=0;i<10;i++){
            System.out.print("Ingrese un numero entero: ");
            tablaInicial[i] =  entrada.nextInt();
        }
        
        // Separar pares e impares
        int contPar = 0, contImpar = 0;
        
        for (int i=0;i<10;i++){
            if (tablaInicial[i]%2 == 0){
                tablaPar[contPar] = tablaInicial[i];
                contPar++;
            } else {
                tablaImpar[contImpar] = tablaInicial[i];
                contImpar++;
            }
        }
        
        // Declaración de las tablas
        int tablaPar[] = new int[contPar];
        int tablaImpar[] = new int[contImpar];
        
        // Mostrar arreglos separados
        System.out.print("Tabla inicial:");
        for (int i=0;i<10;i++){
            System.out.print("  "+tablaInicial[i]);
        }
        System.out.println("");
        
        System.out.print("Tabla con numeros pares: ");
        for (int i=0;i<contPar;i++){
            System.out.print("  "+tablaPar[i]);
        }
        System.out.println("");
        
        System.out.print("Tabla con numeros impares: ");
        for (int i=0;i<contImpar;i++){
            System.out.print("  "+tablaImpar[i]);
        }
    
    }
}
