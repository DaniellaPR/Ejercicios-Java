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
public class Vuelo {
    private String TipoVuelo;   
    private float Precio;
    private String FechaSalida;
    private String FechaRegreso;    
    private String CodigoVuelo;
    private String Destino;
    private String Origen;

    
    public Vuelo(String TipoVuelo,float Precio, String FechaSalida,String FechaRegreso,String CodigoVuelo,String Destino,String Origen){
        this.TipoVuelo=TipoVuelo;       
        this.Precio=Precio;
        this.FechaSalida=FechaSalida;
        this.FechaRegreso=FechaRegreso;
        this.CodigoVuelo=CodigoVuelo;      
        this.Destino=Destino;
        this.Origen=Origen;
    }
    public String getTipoVuelo(){
        return this.TipoVuelo;
    }
    public float getPrecio(){
        return this.Precio;
    }
    public String getFechaSalida(){
        return this.FechaSalida;
    }
    public String getFechaRegreso(){
        return this.FechaRegreso;
    }
    public String getCodigoVuelo(){
        return this.CodigoVuelo;
    }
    public String setDestino(String destino){
        return this.Destino=destino;
    }
    public String getOrigen(){
        return this.Origen;
    }
    public String getDestino(){
        return this.Destino;
    }
    public String getDatos(){
        String cad="Tipo vuelo: "+TipoVuelo+"\nPrecio: "+Precio+"\nFecha de Salida: " +FechaSalida+"\nFecha de Regreso: "+FechaRegreso+"\nCodigo de vuelo: "+ CodigoVuelo+"\nDestino: "+ Destino+"\nOrigen: "+ Origen ;
        return cad;       
    }
}
