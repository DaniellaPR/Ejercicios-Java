/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemagestorobras;

/**
 *
 * @author danie
 */

public class Obra {
    protected String Zona;
    protected Double CosteTotalConstruccion;
    protected int PoblacionBeneficiada;
    protected String Nombre;
    
    
    public Obra(String Zona, Double CosteTotalConstruccion,int PoblacionBeneficiada,String Nombre){
        this.Zona=Zona;
        this.CosteTotalConstruccion=CosteTotalConstruccion;
        this.PoblacionBeneficiada=PoblacionBeneficiada;
        this.Nombre=Nombre;
    }
    
    public void DemolerObra(){
        this.Zona=null;
        this.CosteTotalConstruccion=null;
        this.PoblacionBeneficiada=-1;
        this.Nombre=null;
    }
    
    public String getNombre(){
        return Nombre;
    }
    
    public String getInformacion(){
        return "\nZona: "+ Zona + "\nCoste Total: "+CosteTotalConstruccion+"\nPoblacion Beneficiada: "+PoblacionBeneficiada+"\nNombre del proyecto: "+Nombre;
    }
    
    public String getPersonal(){
        return "";
    }
    
}

    
