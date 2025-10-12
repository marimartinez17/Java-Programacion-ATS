/*
 * Pedir 10 números. Mostrar la media de los números positivos, la media de los números negativos y la cantidad de ceros.
 */

package com.mycompany.medianum;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class App {

    public static void main(String[] args) {
        //Declaración de contadores
        int contPos = 0, contNeg= 0, contCer = 0;
        //Declaración de acumuladores
        int sumPos = 0, sumNeg = 0, num;
        
        Scanner entrada = new Scanner(System.in);
        
        for (int i=0; i < 10; i++){
            System.out.print("Ingrese un número: ");
            num = entrada.nextInt();
            if (num > 0){
                contPos++;
                sumPos += num;
            } else if (num < 0){
                contNeg++;
                sumNeg += num;
            } else {
                contCer++;
            }
        }
        if (contPos != 0){
            System.out.println("Media de números positivos: "+(sumPos/contPos));
        } else {
            System.out.println("No se ingresaron números positivos");
        }
        
        if (contNeg!= 0){
            System.out.println("Media de números negativos: "+(sumNeg/contNeg));
        } else {
            System.out.println("No se ingresaron números negativos");
        }

        System.out.println("Cantidad de ceros: "+contCer);
    }
}
