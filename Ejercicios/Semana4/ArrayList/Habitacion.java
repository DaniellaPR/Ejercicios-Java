package ejemploarraylist;

/**
 *
 * @author danie
 */

public class Habitacion {
    
    private int numero;
    private String tipo;
    private double precioPorNoche;
    private boolean disponible;
    private String nombreCliente;

    public Habitacion(int numero, String tipo, double precioPorNoche) {
        this.numero = numero;
        this.tipo = tipo;
        this.precioPorNoche = precioPorNoche;
        this.disponible = true;
        this.nombreCliente = null;
    }

    public int getNumero() {
        return numero;
    }

    public String getTipo() {
        return tipo;
    }

    public double getPrecioPorNoche() {
        return precioPorNoche;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public void reservar(String nombreCliente) {
        this.disponible = false;
        this.nombreCliente = nombreCliente;
    }

    public String mostrarInfo() {
        if (disponible) {
            return "Habitacion " + numero + " (" + tipo + ") - $" + precioPorNoche + " por noche - Disponible";
        } else {
            return "Habitacion " + numero + " (" + tipo + ") - Reservada por " + nombreCliente;
        }
    }
}