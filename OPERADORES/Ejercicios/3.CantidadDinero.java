/* Ejercicio 3:
Guillermo tiene N dólares. Luis tiene la mitad de lo que posee Guillermo.
Juan tiene la mitad de lo que poseen Luis y Guillermo juntos. Hacer un programa
que calcule e imprima la cantidad de dinero que tienen entre los tres.
 */

package com.mycompany.ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        float guillermo,luis,juan,total;
        
        // Entrada de datos
        System.out.print("Ingrese la cantidad de dinero que posee Guillermo: ");
        guillermo = entrada.nextFloat();

        // Calculos
        luis = guillermo/2;
        juan = (guillermo + luis)/2;
        total = guillermo+luis+juan;

        // Salida de datos
        System.out.println("Guillermo tiene : "+guillermo+"$");
        System.out.println("Luis tiene: "+luis+"$");
        System.out.println("Juan tiene: "+juan+"$");
        System.out.println("Por lo tanto, los tres tienen : "+total+"$ en total.");
    }
}
