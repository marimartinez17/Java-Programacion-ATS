// Arrays unidimensionales

package com.mycompany.arrays;

public class App {

    public static void main(String[] args) {
        // Definir un arreglo
        int[] numeros = new int[3];
        
        // Llenado manual
        numeros[0]=7;
        numeros[1]=10;
        numeros[2]=13;
        
        // Imprimir arreglo
        for (int i=0;i<3;i++){
            System.out.println(numeros[i]);
        }
        
        // Definicion de otro array forma #2
        int[] num = {5,7,9,10};
        
        for (int i=0;i<4;i++){
            System.out.println(num[i]);
        }
    }
}
