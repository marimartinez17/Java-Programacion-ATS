
package Retorno;

public class Operacion {
    // Atributos
    int suma;
    int resta;
    int mult;
    int div;

    // Métodos

    public int sumar(int num1, int num2){
       suma =  num1 + num2; 
       return suma;
    }

    public int restar(int num1, int num2){
        resta = num1 - num2;
        return resta;
    }

    public int multiplicar(int num1, int num2){
        mult = num1 * num2;
        return mult;
    }

    public int dividir(int num1, int num2){
        div = num1 / num2;
        return div;
    }

    public void resultados(int sum, int res, int mul, int div){
        System.out.println("Suma: "+suma);
        System.out.println("Resta: "+resta);
        System.out.println("Multiplicacion: "+mult);
        System.out.println("Division: "+div);
    }
}
