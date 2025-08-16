/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaparaunaexportadora;
import java.util.ArrayList;
/**
 *
 * @author Michael
 */
public class OrdenExportacion {
    private String numeroIdentificacion;
    private String destino;
    private String fecha;
    private ArrayList<Producto> productos;
    private Vehiculo vehiculo;
    private Conductor conductor;
    
    public OrdenExportacion(String numeroIdentificacion, String destino, String fecha, ArrayList<Producto> productos, Vehiculo vehiculo, Conductor conductor)
    {
        this.numeroIdentificacion = numeroIdentificacion;
        this.destino = destino;
        this.fecha = fecha;
        this.productos = productos;
        this.vehiculo = vehiculo;
        this.conductor = conductor;
    }
    public String verOrdenExportacion()
    {
        String cad;    
        cad = "Núnero: " + numeroIdentificacion + "\nDestino: " + destino + "\nFecha: " + fecha + "\n\nVehículo: ";
        if (vehiculo instanceof Automovil automovil){
                cad += ("Automovil:\n" + vehiculo.verVehiculo(automovil) + "\n");
            }
        else if (vehiculo instanceof Aeronave aeronave){
                cad += "Aeronave:\n" + vehiculo.verVehiculo(aeronave) + "\n";
            }
        else if (vehiculo instanceof Embarcacion embarcacion){
                cad += "Embarcación:\n" + vehiculo.verVehiculo(embarcacion) + "\n";
            }
        cad += "Conductor: " + conductor.verConductor() + "Productos:";
        for (int i = 0; i < productos.size(); i++)
            cad += "\n" + productos.get(i).verProducto() + "\n";
        return cad;
    }
    public String getNumeroIdentificacion(){
        return numeroIdentificacion;
    }
    public Vehiculo getVehiculo(){
        return vehiculo;
    }
}
