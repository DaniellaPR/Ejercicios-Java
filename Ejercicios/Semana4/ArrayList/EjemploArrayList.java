package ejemploarraylist;

/**
 *
 * @author danie
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;

public class EjemploArrayList {
    
     public static void mostrarHabitaciones(ArrayList<Habitacion>habitaciones) {
        for (int i = 0; i < habitaciones.size(); i++) {
            Habitacion h = habitaciones.get(i);
            System.out.println(h.mostrarInfo());
        }
    }

    public static void reservarHabitacion(int numeroHabitacion, String nombreCliente,ArrayList<Habitacion>habitaciones) {
        for (int i = 0; i < habitaciones.size(); i++) {
            Habitacion h = habitaciones.get(i);
            if (h.getNumero() == numeroHabitacion && h.isDisponible()) {
                h.reservar(nombreCliente);                
                return;
            }
        }       
    }
    
    public static void modificarHabitacion(ArrayList<Habitacion>habitaciones,int numeroHabitacion){
        int NuevoNumero=203;
        String NuevoTipo="Simple";
        double NuevoValor=50.0;
        for(int i=0;i<habitaciones.size();i++){
            //Usamos .isEmpty() para asegurarnos que donde vamos a buscar no esta vacia
            if(habitaciones.isEmpty()==false){
                //Usamos .set(indice,elemento) para reemplazar un elemento en la lista
                if(habitaciones.get(i).getNumero()==numeroHabitacion){
                    habitaciones.set(i,new Habitacion(NuevoNumero,NuevoTipo,NuevoValor));
                }
                
            }
        }
    }
 
    
    public static void main(String[] args) throws IOException {
        
      
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Habitacion> habitaciones = new ArrayList<>();
        
        //Usamos add(elemento) para añadir las habitaciones
        habitaciones.add(new Habitacion(101, "Simple", 50.0));
        habitaciones.add(new Habitacion(102, "Doble", 80.0));
        habitaciones.add(new Habitacion(201, "Suite", 150.0));
        
        //Usamos add(indice,elemento) para añadir en una posicion especifica del arreglo las habitaciones y que se mantenga en orden
        habitaciones.add(0,new Habitacion(100, "Doble", 80.0));
        habitaciones.add(3,new Habitacion(200, "Suite", 150.0));
        modificarHabitacion(habitaciones,200);

        boolean salir = false;
        while (!salir) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Ver habitaciones");
            System.out.println("2. Reservar habitacion");
            System.out.println("3. Salir");
            System.out.print("Que desea realizar: ");
            String opcion = reader.readLine();

            switch (opcion) {
                case "1":
                    mostrarHabitaciones(habitaciones);
                    break;
                case "2":
                    System.out.print("Ingrese el nombre: ");
                    String nombre = reader.readLine();
                    System.out.print("Numero de habitacion que va a reservar: ");
                    int numero = Integer.parseInt(reader.readLine());
                    reservarHabitacion(numero, nombre,habitaciones);
                    break;
                case "3":
                    salir = true;
                    System.out.println("Gracias por usar el programa...");
                    break;
                default:
                    System.out.println("Ingrese de nuevo");
            }
        }
    }
}
