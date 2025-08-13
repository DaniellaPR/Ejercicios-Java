/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplolinkedlist;

/**
 *
 * @author israe
 */
public class Usuario {
    private String nombre;
    private Problema problema;
    private String ID;
    
    public Usuario(String nombre, Problema problema, String ID){
        this.nombre=nombre;
        this.problema=problema;
        this.ID=ID;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public Problema getProblema(){
        return problema;
    }
    
    public String getID(){
        return ID;
    }
    
    
    public void ver(){
        System.out.println("Nombre: " + this.nombre);
        System.out.println("problema: " );
        problema.ver();
    
        
    }
  
}
