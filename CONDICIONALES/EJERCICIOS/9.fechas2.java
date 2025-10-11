/*
 * Pedir el día mes y año de una fecha e indicar si la fecha es correcta, con meses de 28, 30 y 31 días
 */

package com.mycompany.fech;

import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class App {

    public static void main(String[] args) {
        int dia, mes, año;
        
        dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el día: "));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes: "));
        año = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año: "));
        
        if (año > 0){
            if (mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12){
                if (dia >=1 && dia <=31){
                    JOptionPane.showMessageDialog(null, "Fecha correcta.");
                } else {
                    JOptionPane.showMessageDialog(null, "Fecha incorrecta, día inválido.");
                }
            } else if (mes==4 || mes==6 || mes==9 || mes==11 ){
                if (dia >=1 && dia <=30){
                    JOptionPane.showMessageDialog(null, "Fecha correcta.");
                } else {
                    JOptionPane.showMessageDialog(null, "Fecha incorrecta, día inválido.");
                }
            } else if (mes ==2) {
                if (dia >=1 && dia <=28){
                    JOptionPane.showMessageDialog(null, "Fecha correcta.");
                } else {
                    JOptionPane.showMessageDialog(null, "Fecha incorrecta, día inválido.");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Fecha incorrecta, mes inválido.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Fecha incorrecta, año inválido.");
        }
    }
}
