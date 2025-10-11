/*
 Pedir tres números y ordenarlos de mayor a menor
 */

package com.mycompany.orden;

import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class App {

    public static void main(String[] args) {
        int num1, num2, num3, numMayor, numSeg, numTer;
        
        // Solicitar tres números al usuario
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número #1: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número # 2: "));
        num3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número # 3: "));
        
       if (num1 > num2 && num1 > num3){
           numMayor = num1;
           
           if (num2 > num3){
              numSeg = num2;
              numTer = num3;
           } else {
                numSeg = num3;
                numTer = num2;
           }
       } else if (num2 > num1 && num2> num3){
           numMayor = num2;
           if (num1 > num3){
               numSeg = num1;
               numTer = num3;
           } else {
                numSeg = num3;
                numTer = num1;
           }
       } else {
           numMayor = num3;
           if (num1 > num2){
               numSeg = num1;
               numTer = num2;
           } else {
               numSeg = num2;
               numTer = num1;
           }
       }
       
       JOptionPane.showMessageDialog(null, "NÚMEROS ORDENADOS DE MAYOR A MENOR:\n1) "+numMayor+"\n2) "+numSeg+"\n3) "+numTer);
    }
}
