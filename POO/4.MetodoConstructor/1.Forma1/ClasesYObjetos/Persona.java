
package ClasesYObjetos;

public class Persona {
    //Atributos
    String nombre;
    int edad;
    
    //Métodos
    
    //Método constructor
    public Persona(String _nombre, int _edad){
        nombre = _nombre;
        edad = _edad;
    }
    
    //Metodo para mostrar los datos
    public void mostrarDatos(){
        System.out.println("El nombre es: "+nombre);
        System.out.println("La edad es: "+edad);
    }
}
