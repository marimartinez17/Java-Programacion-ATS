
package ClasesYObjetos;

public class Persona {
    //Atributos
    String nombre;
    int edad;
    
    //Métodos
    
    //Método constructor
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    
    //Metodo para mostrar los datos
    public void mostrarDatos(){
        System.out.println("El nombre es: "+nombre);
        System.out.println("La edad es: "+edad);
    }
}
