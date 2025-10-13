/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sueldos;

import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class App {

    public static void main(String[] args) {
        int num;
        float sueldo, sueldoMax = 0;
        
        num = Integer.parseInt(JOptionPane.showInputDialog("Ingresar un número: "));
        
        for (int i=0; i<num; i++){
            sueldo = Float.parseFloat(JOptionPane.showInputDialog("Ingresar el sueldo #"+(i+1)+":"));
            
            if (sueldo > sueldoMax){
                sueldoMax = sueldo;
            }
        }
        
        JOptionPane.showMessageDialog(null, "El mayor sueldo es: "+sueldoMax+"$.");
    }
}
