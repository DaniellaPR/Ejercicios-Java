/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemavuelos;
import java.util.*;
/**
 *
 * @author israe
 */
public class Aerolinea {
    private String nombre;
    private List<Vuelo> vuelos=new ArrayList<>();
    
    public Aerolinea(String nombre){
        this.nombre=nombre;
    }
    public void AnadirVuelo(String TipoVuelo,float Precio, String FechaSalida,String FechaRegreso,String CodigoVuelo,String Destino,String Origen){
        Vuelo b=new Vuelo(TipoVuelo,Precio,FechaSalida,FechaRegreso,CodigoVuelo,Destino,Origen);
        vuelos.add(b);
    }
    public List<Vuelo> getVuelo(){
        return vuelos;
    }    
    public String getNombre(){
        return this.nombre;
    }
    public String getInf(int posicion){
        String cad= nombre +vuelos.get(posicion).getCadena();
        return cad;
    }
}
