
package clasesyobjetos;

public class Coche {
    // Atributos
    int id;
    String color;
    String marca;
    int km;
    
    public static void main(String[] args){
        // Creación de un objeto
        Coche coche1 = new Coche();
        coche1.id = 1;
        coche1.color = "Blanco";
        coche1.marca = "Audi";
        coche1.km = 0;
        
        System.out.println("DATOS DEL COCHE #"+coche1.id+": \n");
        System.out.println("Color: "+coche1.color);
        System.out.println("Marca: "+coche1.marca);
        System.out.println("Kilometraje: "+coche1.km+"km");
        
        // Creación de un objeto
        Coche coche2 = new Coche();
        coche2.id = 2;
        coche2.color = "Rojo";
        coche2.marca = "Ferrari";
        coche2.km = 0;
        
        System.out.println("\nDATOS DEL COCHE #"+coche2.id+": \n");
        System.out.println("Color: "+coche2.color);
        System.out.println("Marca: "+coche2.marca);
        System.out.println("Kilometraje: "+coche2.km+"km");
    }
}
