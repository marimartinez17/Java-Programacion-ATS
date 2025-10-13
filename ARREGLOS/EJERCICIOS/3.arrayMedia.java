/*
 * Leer 5 números por teclado, almacenarlos en un arreglo y a continuación realizar la media de los números positivos, 
 * la media de los números negativos y contar el número de ceros.
 */

package com.mycompany.arraymedia;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // Declaración del arreglo
        int[] num = new int[5];
        //Declaración de contadores
        int sumPos=0, sumNeg=0;
        //Declaración de acumuladores
        int contPos=0,contNeg=0, contCero=0;
        
        float mediaPos, mediaNeg;
        
        for (int i=0;i<5;i++){
            // Solicitar 5 números
            System.out.print((i+1)+"-. Ingresar un numero: ");
            num[i] = entrada.nextInt();
            
            if (num[i]>0){
                // Contar y acumular números positivos
                contPos++;
                sumPos+=num[i];
            } else if (num[i]<0){
                // Contar y acumular números negativos
                contNeg++;
                sumNeg+=num[i];
            } else {
                // Contar ceros
                contCero++;
            }
        }
        
        // Media números positivos
        if(contPos==0){
            System.out.println("No se ingresaron numeros positivos.");
        } else {
            mediaPos = (float)sumPos / contPos;
            System.out.println("Media de numeros positivos: "+mediaPos);
        }
        // Media números negativos
        if(contNeg==0){
            System.out.println("No se ingresaron numeros negativos.");
        } else {
            mediaNeg = (float)sumNeg/ contNeg;
            System.out.println("Media de numeros negativos: "+mediaNeg);
        }
        //Cantidad de ceros
        System.out.println("Cantidad de ceros: "+contCero);
    }
}
