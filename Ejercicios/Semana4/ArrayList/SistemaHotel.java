/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploarraylist;

import java.util.ArrayList;

public class SistemaHotel {
    private ArrayList<Habitacion> habitaciones = new ArrayList<>();

    public SistemaHotel() {
        habitaciones = new ArrayList<>();
    }

    public ArrayList<Habitacion> getHabitaciones() {
        return habitaciones;
    }

    public void agregarHabitacion(Habitacion h) {
        habitaciones.add(h);
    }

    public void mostrarHabitaciones() {
        for (int i = 0; i < habitaciones.size(); i++) {
            Habitacion h = habitaciones.get(i);
            System.out.println(h.mostrarInfo());
        }
    }

    public void reservarHabitacion(int numeroHabitacion, String nombreCliente) {
        for (int i = 0; i < habitaciones.size(); i++) {
            Habitacion h = habitaciones.get(i);
            if (h.getNumero() == numeroHabitacion && h.isDisponible()) {
                h.reservar(nombreCliente);                
                return;
            }
        }       
    }
}
