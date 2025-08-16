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
public class Pasajero {
    private String nombre;
    private String ID;
    private String Nacionalidad;
    private String Genero;
    private List<Boleto> boleto=new ArrayList<>();
    
    public Pasajero(String nombre,String ID,String Nacionalidad, String Genero){
        this.nombre=nombre;
        this.ID=ID;
        this.Nacionalidad=Nacionalidad;
        this.Genero=Genero;
    }
    public void ComprarBoleto(String TipoVuelo,float Precio, String FechaSalida,String FechaRegreso,String CodigoVuelo,String Destino,String Origen,int numeroDeAsiento){
        Boleto a =new Boleto( TipoVuelo, Precio,  FechaSalida, FechaRegreso,CodigoVuelo,Destino,Origen,numeroDeAsiento);
        boleto.add(a);
    }    
    
    public String VerVuelo(){
        String cad="";
        for(int i=0;i<boleto.size();i++){
            cad=cad+"\n"+boleto.get(i).getDatos();
        }
        return "\nPasajero: "+nombre+"\nID: "+ID+"\nNacionalidad: "+Nacionalidad+"\nGenero: "+Genero+cad;
    }
    
    public String getPasajero(){
        return nombre+","+ID+","+Nacionalidad+","+Genero;
    }
}
