
package Retorno;

import javax.swing.JOptionPane;


public class main {
    public static void main(String [] args){
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro número: "));
        
        Operacion op = new Operacion();
        
        // Llamado de los métodos en java
        int suma = op.sumar(n1, n2);
        int resta = op.restar(n1, n2);
        int mult = op.multiplicar(n1, n2);
        int div = op.dividir(n1, n2);
        
        op.resultados(suma,resta,mult,div);
    }
}
