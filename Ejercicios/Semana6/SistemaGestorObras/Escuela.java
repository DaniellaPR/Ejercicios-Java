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
public class Escuela extends Obra{
    private int Capacidad;
    private String Tipo;
    private String Jornada;
    private String UltimaRemodelacion;
    private List<Personal> Trabajadores= new ArrayList<>();
    
    public Escuela(String Zona, Double CosteTotalConstruccion,int PoblacionBeneficiada,String Nombre,int Capacidad, String Tipo, String Jornada, String UltimaRemodelacion){
        super(Zona,CosteTotalConstruccion,PoblacionBeneficiada,Nombre);  
        this.Capacidad=Capacidad;
        this.Tipo=Tipo;
        this.Jornada=Jornada;
        this.UltimaRemodelacion=UltimaRemodelacion;
    }
    public void ProgramarRemodelacion(String fecha){
        UltimaRemodelacion = fecha;
    }
    public void CambiarTipo(String tipo){
        Tipo = tipo;
    }
    public void CambiarJornada(String nueva){
        Jornada=nueva;
    }
    public String getTipo(){
        return Tipo;
    }
    public void AnadirPersonal(String Rol, Float Salario,String ID){
        Personal a=new Personal(Rol,Salario,ID);
        Trabajadores.add(a);
    }
    
     @Override
    public String getInformacion(){
        return super.getInformacion()+"\nTipo de Escuela: "+Tipo+"\nCapacidad: "+Capacidad+"\nJordana de trabajo: "+Jornada+"\nUltima Remodelacion de la escuela"+UltimaRemodelacion+"\n";
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