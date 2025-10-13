/*
 * Uso de for each
 */

package com.mycompany.foreach;

public class App {

    public static void main(String[] args) {
        String[] nombres = {"Alejandro","María","Luisa","Juan","Narcisa","Luis","Roberto","Jessica"};
        
        // Cuando no sepamos cuantos elementos tiene el array:
        System.out.println("Uso de length:");
        for (int i=0;i<nombres.length;i++){
            System.out.println(nombres[i]);
        }
        
        // Bucle For Each
        System.out.println("\nUso de for each:");
        for(String i: nombres){
            System.out.println("Nombres: "+i);
        }
    
    }
}
