/*
    Construir un programa que calcule y muestre por pantalla
    las raices de la ecuacion de segundo grado de coeficientes
    reales.
 */

package com.mycompany.raices;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class App {

    public static void main(String[] args) {
        double a,b,c, raizPos, raizNeg;
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Ingrese el valor de a: ");
        a = entrada.nextFloat();
        
        System.out.print("Ingrese el valor de b: ");
        b = entrada.nextFloat();
        
        System.out.print("Ingrese el valor de c: ");
        c = entrada.nextFloat();
        
        // Raiz positiva
        raizPos = (- b + Math.sqrt((Math.pow(b, 2))-(4*a*c))) / (2*a);
        
        // Raiz negativa
        
        raizNeg = (- b - Math.sqrt((Math.pow(b, 2))-(4*a*c))) / (2*a);
        
        System.out.println("Las raices de a="+a+", b="+b+" y c="+c+" son:");
        System.out.println("* Raíz positiva: "+raizPos);
        System.out.println("* Raíz negativa: "+raizNeg);
        
    }
}
