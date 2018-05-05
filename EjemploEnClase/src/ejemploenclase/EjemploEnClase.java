
package ejemploenclase;
import java.util.Scanner;
class Contacto
{
    String nombre;
    int telefono;
    
    void inicializar(String nombre, int telefono)
    {
        this.nombre = nombre;
        this.telefono = telefono;
    }
    
    void imprimir()
    {
        System.out.println("Nombre: " + nombre);
        System.out.println("Telefono: " + telefono);
    }
}
public class EjemploEnClase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tamano = 5;
        Contacto contactos[] = new Contacto[tamano];
        for(int i=0; i<tamano; i++)
            contactos[i] = new Contacto();
        
        int opcion;
        do
        {
            System.out.println("Menu:");
            System.out.println("1. Agregar");
            System.out.println("2. Mostrar");
            System.out.println("0. Salir");
            System.out.println("Opcion: ");
            opcion = scanner.nextInt();
            
            if(opcion == 1)
            {
                String nombre;
                int telefono;
                int posicion;
                System.out.print("Ingrese el nombre: ");
                nombre = scanner.next();
                System.out.print("Ingrese el telefono: ");
                telefono = scanner.nextInt();
                System.out.print("Ingrese la posicion: ");
                posicion = scanner.nextInt();
                
                contactos[posicion].inicializar(nombre, telefono);
            }
            
            if(opcion == 2)
            {
                for(int i=0; i<tamano; i++)
                {
                    contactos[i].imprimir();
                }
            }
            
        }while(opcion!=0);
    }
}