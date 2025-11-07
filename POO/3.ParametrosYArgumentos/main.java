
package ClasesYObjetos;
        
import javax.swing.JOptionPane;

public class main {
    public static void main(String [] args){
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro número: "));
    
        Operacion op = new Operacion();
        
        // Realizar operaciones
        op.sumar(n1, n2);
        op.restar(n1, n2);
        op.multiplicar(n1, n2);
        op.dividir(n1, n2);
        
        // Mostrar resultados
        op.resultados();
    }
    
}
