// Clase Math

package com.mycompany.proyecto8;

public class Proyecto8 {

    public static void main(String[] args) {
        
        // METODO SQRT (SQUARE ROOT)------------------------------------
        
        // sqrt solo admite double
        double raiz = Math.sqrt(36.67);
        //int raiz = (int)Math.sqrt(9); Si se quiere una raiz que da int
        
        System.out.println("Raiz cuadrada: "+raiz);
    
        // METODO POTENCIACION
        double base = 5, exponente = 2;
        double resultado = Math.pow(base, exponente);
    
        System.out.println("Resultado de "+base+" elevado a la "+exponente+": "+resultado);
    
        // METODO DE REDONDEO
        float numero = 4.56f;
        int redondeo = Math.round(numero);
        System.out.println(redondeo);
        
        double num2 = 8.56;
        long redondeado = Math.round(num2);
        System.out.println(redondeado);
        
        // METODO RANDOM
        double aleatorio = Math.random();
        System.out.println(aleatorio);
    }
}
