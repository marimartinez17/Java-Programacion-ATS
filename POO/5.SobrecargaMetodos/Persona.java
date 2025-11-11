// Sobrecarga de constructores: Es cuando existe más de un método constructor.

// Se pueden sobrecargar mientras tengan un número de parámetros diferente o por el tipo de parametros
package ClasesYObjetos;

public class Persona {
    //Atributos
    String nombre;
    int edad;
    String id;
    
    // Sobrecarga de constructores
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        
    }

    public Persona(String id) {
        this.id = id;
    }
    
    // Sobrecarga de métodos
    public void correr(){
        System.out.println("Soy "+nombre+", tengo "+edad+" años y estoy corriendo una maraton");
    }
    
    public void correr(int km){
        System.out.println("He corrido "+km+" kilometros");
    }
    
}
