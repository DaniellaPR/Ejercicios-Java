/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemagestorobras;

/**
 *
 * @author danie
 */
public class Puente extends Obra{
    private int Capacidad;
    private String Tipo;   
    private float Longitud;
    private String UltimoMantenimiento;
    
    public Puente(String Zona, Double CosteTotalConstruccion,int PoblacionBeneficiada,String Nombre,int Capacidad, String Tipo, float Longitud, String UltimoMantenimiento){
        super(Zona,CosteTotalConstruccion,PoblacionBeneficiada,Nombre);  
        this.Capacidad=Capacidad;
        this.Tipo=Tipo;                  
        this.Longitud=Longitud;
        this.UltimoMantenimiento=UltimoMantenimiento;
    }
    public void ProgramarMantenimiento(String fecha){
        UltimoMantenimiento = fecha;
    }
    public void VerDatos(){
        System.out.println("Capcidad: " + this.Capacidad);
        System.out.println("Tipo: " + this.Tipo);   
        System.out.println("Longitud: " + this.Longitud);
        System.out.println("Ultimo Mantenimiento: " + this.UltimoMantenimiento);
    }
    
     @Override
    public String getInformacion(){
        return super.getInformacion()+"\nTipo de Puente: "+Tipo+"\nCapacidad: "+Capacidad+"\nLongitud Total: "+Longitud+"\nUltimo mantenimiento realizado:"+UltimoMantenimiento+"\n";
    }
}
