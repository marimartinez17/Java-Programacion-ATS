/*
 * Ejercicio # 14: Leer dos series de 10 enteros que estarán ordenados crecientemente. 
 * Copiar (fusionar) las dos tablas en una tercera, de forma que sigan ordenados.
 */

package com.mycompany.fusionartablas;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class App {

    public static void main(String[] args) {
        //Declarar tablas
        int tabla1[] = new int[10];
        int tabla2[] = new int[10];
        int fusion[] = new int[20];
        boolean crec1,crec2;
        // Declarar éscaner
        Scanner entrada = new Scanner(System.in);
        
        // Leer tabla # 1
        do{     
            crec1 = true;
            // Solicitar números
            System.out.println("Llendando la tabla # 1 ...");
            for (int i=0;i<10;i++){
                System.out.print((i+1)+") Ingrese un número entero: ");
                tabla1[i]= entrada.nextInt();
            }
            // Determinar si está en orden creciente
            for (int i=0;i<9;i++){
                if (tabla1[i]<tabla1[i+1]){
                    crec1 = true;
                } else {
                    crec1 = false;
                    break;
                }
            }
            // Mensaje en caso de estar desordenada
            if (crec1 == false){
                System.out.println("Arreglo no ordenado de forma creciente. Intente nuevamente.");
            }
        } while (crec1 == false);
        
        // Leer tabla # 2
        do{ 
            crec2 = true;
            // Solicitar números
            System.out.println("Llendando la tabla # 2 ...");
            for (int i=0;i<10;i++){
                System.out.print((i+1)+") Ingrese un número entero: ");
                tabla2[i]= entrada.nextInt();
            }
            // Determinar si está en orden creciente
            for (int i=0;i<9;i++){
                if (tabla2[i]<=tabla2[i+1]){
                    crec2 = true;
                } else {
                    crec2 = false;
                    break;
                }
            }
            // Mensaje en caso de estar desordenada
            if (crec2 == false){
                System.out.println("Arreglo no ordenado de forma creciente. Intente nuevamente.");
            }
        } while (crec2 == false);
        
        
        // Combinar tablas
        int j=0, num1=0, num2=0;
        while (num1<10 && num2<10){
            if (tabla1[num1]<tabla2[num2]){
                fusion[j]=tabla1[num1];
                j++;
                num1++;
            } else if (tabla2[num2]<tabla1[num1]){
                fusion[j]=tabla2[num2];
                j++;
                num2++;
            } else {
                fusion[j]=tabla1[num1];
                j++;
                num1++;
                fusion[j]=tabla2[num2];
                j++;
                num2++;
            }
        }
        
        if (num1==10){
            while (num2<10){
                fusion[j]=tabla2[num2];
                j++;
                num2++;
            }
        } else {
            while (num1<10){
                fusion[j]=tabla1[num1];
                j++;
                num1++;
            }
        }
        
        // Mostrar tablas iniciales y tabla combinada
        System.out.print("Tabla #1:");
        for (int i=0;i<10;i++){
            System.out.print(" "+tabla1[i]);
        }
        System.out.println("");
        
        System.out.print("Tabla #2:");
        for (int i=0;i<10;i++){
            System.out.print(" "+tabla2[i]);
        }
        System.out.println("");
        
        System.out.print("Tabla combinada:");
        for (int i=0;i<20;i++){
            System.out.print(" "+fusion[i]);
        }
    }
}
