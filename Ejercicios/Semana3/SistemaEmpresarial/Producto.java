/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaempresarial;

/**
 *
 * @author israe
 */
public class Producto {
    private float Valor;
    private String Codigo;
    private String Nombre;  
    
    public Producto(float Valor, String Codigo, String Nombre){
        this.Valor=Valor;
        this.Codigo=Codigo;
        this.Nombre=Nombre;              
    }
    
    public Producto(){
        Valor=999;
        Codigo=null;
        Nombre=null;        
    }
    
    public float getValor(){
        return Valor;
    }   
    
    public String getNombre(){
        return Nombre;
    }
    
    
}
