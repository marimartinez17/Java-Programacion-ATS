/*
    Hacer un programa que simule un cajero automático con un saldo inicial de 1000 dólares, con el siguiente menú de opciones:
    1. Ingresar dinero a la cuenta
    2. Retirar dinero de la cuenta
    3. Salir
 */

package com.mycompany.cajeroatm;

import javax.swing.JOptionPane;

public class App {

    public static void main(String[] args) {
        final int SALDO_INICIAL = 1000;
        float ingreso, retiro, saldoActual;
        int opcion;
        
        // Solicitar operacion al cliente
        opcion = Integer.parseInt(JOptionPane.showInputDialog("¡Bienvenido al cajero ATM! :)\nSeleccione la operación que desea realizar:\n1) Ingresar dinero a la cuenta.\n2) Retirar dinero de la cuenta.\n3) Salir"));
        
        // Realizar operacion
        switch (opcion) {
            case 1:
                // Ingresar dinero
                ingreso = Float.parseFloat(JOptionPane.showInputDialog("Ingresar el monto a depositar: " ));
                
                //Monto debe ser mayor a 0
                if (ingreso > 0) {
                    saldoActual = SALDO_INICIAL + ingreso;
                    JOptionPane.showMessageDialog(null, "Su saldo actual es de: "+saldoActual+"$.");
                } else {
                    // Monto negativo o nulo
                    JOptionPane.showMessageDialog(null, "Monto inválido.");
                }
                break;
            case 2:
                // Retiro de fondos
                retiro = Float.parseFloat(JOptionPane.showInputDialog("Ingresar el monto a depositar: " ));
                if (retiro > 0 && retiro <= SALDO_INICIAL) {
                    saldoActual = SALDO_INICIAL - retiro;
                    JOptionPane.showMessageDialog(null, "Su saldo actual es de: "+saldoActual+"$.");
                } else {
                    // Monto negativo, nulo o menor al saldo inicial
                    JOptionPane.showMessageDialog(null, "Saldo insuficiente.");
                }
                break;
            case 3:
                // Opción de salida
                JOptionPane.showMessageDialog(null, "¡Gracias por visitar el cajero ATM!");
                break;
            default:
                // Operación no existente
                JOptionPane.showMessageDialog(null, "Operación inválida.");
                break;
        }
        
    }
}
