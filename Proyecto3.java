
package com.mycompany.proyecto3;

import java.util.Scanner;

public class Proyecto3 {

    public static void main(String[] args) {
        //Ingresar un numero entero
        Scanner entrada = new Scanner(System.in);
        int numero;
        
        System.out.print("Ingrese un numero entero: ");
        numero=entrada.nextInt();
        
        System.out.println("El numero entero es: "+numero);
        
        //Ingresar un numero decimal flotante
        Scanner entrada2 = new Scanner(System.in);
        float numero2;
        
        System.out.print("Ingrese un numero flotante: ");
        numero2 = entrada2.nextFloat();
        
        System.out.println("El numero flotante es: "+numero2);
        
        // Ingresar un numero decimal double
        Scanner entrada3 = new Scanner(System.in);
        double numero3;
        
        System.out.print("Ingrese un numero decimal (double): ");
        numero3 = entrada3.nextDouble();
        
        System.out.println("El numero double es: "+numero3);
        
        // Ingresar cadenas de texto
        Scanner entrada4 = new Scanner(System.in);
        String cadena;
        
        System.out.print("Ingrese una cadena de texto: ");
        cadena = entrada4.nextLine();
        System.out.println("La cadena es: "+cadena);
        
        // Ingresar un solo caracter
        Scanner entrada5 = new Scanner(System.in);
        char letra;
        
        System.out.print("Ingrese una letra: ");
        letra = entrada5.next().charAt(0);
        
        System.out.println("La letra es: "+letra);
    }
}
