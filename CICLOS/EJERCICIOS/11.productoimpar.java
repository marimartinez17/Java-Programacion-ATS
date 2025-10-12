/*
 * Diseñar un programa que permita mostrar el producto de los primeros 10 números impares
 */

package com.mycompany.prodimpares;

/**
 *
 * @author usuario
 */
public class App {

    public static void main(String[] args) {
        int producto = 1;
        
        for (int i=1; i<=20; i+=2){
            producto *= i;
            System.out.println("Producto("+i+"): "+producto);
        }
        
        System.out.println("El producto de los primeros 10 números impares es: "+producto);
    }
}
