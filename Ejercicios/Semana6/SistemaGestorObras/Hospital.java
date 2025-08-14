/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemagestorobras;
import java.util.*;
/**
 *
 * @author danie
 */
public class Hospital extends Obra{
    private String Tipo;
    private int Capacidad;
    private String UltimaRemodelacion;
    private String ProximaRemodelacion;
    private List<Personal> Trabajadores=new ArrayList<>();
    
    public Hospital(String Zona, Double CosteTotalConstruccion,int PoblacionBeneficiada,String Nombre,String Tipo, int Capacidad, String UltimaRemodelacion)
    {            
            super(Zona,CosteTotalConstruccion,PoblacionBeneficiada,Nombre);            
            this.Capacidad=Capacidad;
            this.Tipo = Tipo;
            this.UltimaRemodelacion=UltimaRemodelacion;
            this.ProximaRemodelacion=null;
    }
    public void ProgramarRemodelacion(String fecha){
        ProximaRemodelacion = fecha;
    }
    public void CambiarTipo(String tipo){
        Tipo = tipo;
    }
    @Override
    public String getInformacion(){
        return super.getInformacion()+"\nTipo de Hospital: "+Tipo+"\nCapacidad: "+Capacidad+"\nUltima Remodelacion del Hospital: "+UltimaRemodelacion+"\nProxima Remodelacion del Hospital: "+ProximaRemodelacion+"\n";
    }
    
     public void AnadirPersonal(String Rol, Float Salario,String ID){
        Personal a=new Personal(Rol,Salario,ID);
        Trabajadores.add(a);
    }
      @Override
    public String getPersonal(){ 
        String InfCom="";
        for(int i=0;i<Trabajadores.size();i++){
            InfCom=InfCom+Trabajadores.get(i).getInf();
        }
        return super.getPersonal()+InfCom;
    }
}
