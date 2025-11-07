
package Retorno;

import javax.swing.JOptionPane;


public class main {
    public static void main(String [] args){
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro número: "));
        
        Operacion op = new Operacion();
        
        System.out.println("La suma es: "+op.sumar(n1, n2));
        System.out.println("La resta es: "+op.restar(n1, n2));
        System.out.println("La multiplicacipn es: "+op.multiplicar(n1, n2));
        System.out.println("La division es: "+op.dividir(n1, n2));
    }
}
