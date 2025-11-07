
package ClasesYObjetos;

import javax.swing.JOptionPane;

public class Operacion {
    // Atributos
    int num1;
    int num2;
    int suma;
    int resta;
    int mult;
    int div;
    
    // Métodos
    
    // Metodo para pedirle numeros al usuario
    public void leerNum(){
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro número: "));   
    }
    
    public void sumar(){
        suma = num1 + num2;
    }
    
    public void restar(){
        resta = num1 - num2;
    }
    
    public void multiplicar(){
        mult = num1 * num2;
    }
    
    public void dividir(){
        div = num1 / num2;
    }
    
    public void resultados(){
        System.out.println("Suma: "+suma);
        System.out.println("Resta: "+resta);
        System.out.println("Multiplicacion: "+mult);
        System.out.println("Division: "+div);
    }
}
