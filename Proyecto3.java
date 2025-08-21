
package com.mycompany.proyecto3;

import java.util.Scanner;

public class Proyecto3 {

    public static void main(String[] args) {
        //Ingresar un numero entero
        Scanner entrada = new Scanner(System.in);
        int numero;
        
        System.out.print("Ingrese un numero entero: ");
        numero=entrada.nextInt();
        
        System.out.println("El numero es: "+numero);
        
        //Ingresar un numero decimal
        Scanner entrada2 = new Scanner(System.in);
        float numero2;
        
        System.out.print("Ingrese un numero decimal: ");
        numero2 = entrada2.nextFloat();
        
        System.out.println("El numero decimal es: "+numero2);
    }
}
