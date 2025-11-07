
package ClasesYObjetos;

import javax.swing.JOptionPane;

public class Operacion {
    // Atributos
    int suma;
    int resta;
    int mult;
    int div;
    
    // Métodos
   
    public void sumar(int num1, int num2){
       suma =  num1 + num2; 
    }
    
    public void restar(int num1, int num2){
        resta = num1 - num2;
    }
    
    public void multiplicar(int num1, int num2){
        mult = num1 * num2;
    }
    
    public void dividir(int num1, int num2){
        div = num1 / num2;
    }
    
    public void resultados(){
        System.out.println("Suma: "+suma);
        System.out.println("Resta: "+resta);
        System.out.println("Multiplicacion: "+mult);
        System.out.println("Division: "+div);
    }
}
