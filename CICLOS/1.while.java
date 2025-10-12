/*
 * while
 */

package com.mycompany.whil;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class App {

    public static void main(String[] args) {
        int i = 1;
        
        // 1 al 10
        while (i<=10){
            System.out.println(i);
            i++;
        }
         
         // 10 al 1
        i = 10;
        while (i>=1){
            System.out.println(i);
            i--;
        }
        
        // Ingresados por user
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese los números que desea ver en pantalla: ");
        i = 1;
        int num = entrada.nextInt();
        
        // De 1 en 1
        while (i <= num){
            System.out.println(i);
            i++; // ´Puede ser de n en n si usas acumuladores: i +=2
        }
        
    }
}
