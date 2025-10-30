/*
    Búsqueda Secuencial
 */

package com.mycompany.busquedalinear;

import javax.swing.JOptionPane;


public class App {

    public static void main(String[] args) {
        int arreglo[]={4,1,5,2,3};
        int dato;
        boolean bandera = false;
        
        dato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número a buscar: "));
        
        // Busqueda secuencial
        int i=0;
        while((i<5) && (bandera == false)){
            if (arreglo[i]==dato){
                bandera = true;
            }
            i++;
        }
        
        if (bandera==false){
            JOptionPane.showMessageDialog(null, "El número no se encuentra en el arreglo.");
        } else {
            JOptionPane.showMessageDialog(null,"El número ha sido encontrado en la posicion "+(i-1)+"." );
        }
    }
}
