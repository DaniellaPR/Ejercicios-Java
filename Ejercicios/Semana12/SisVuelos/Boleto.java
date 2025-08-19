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
public class Boleto extends Vuelo{
   
    private int numeroDeAsiento;
  
    
    public Boleto(String TipoVuelo,float Precio, String FechaSalida,String FechaRegreso,String CodigoVuelo,String Destino,String Origen,int numeroDeAsiento){
        super(TipoVuelo,Precio,FechaSalida,FechaRegreso,CodigoVuelo,Destino,Origen);        
        this.numeroDeAsiento=numeroDeAsiento;      
        
    }
    public String getDatos(){
        return super.getDatos()+"\n numero de asiento: "+ numeroDeAsiento;
    }
    
}
