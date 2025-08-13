/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplolinkedlist;

/**
 *
 * @author israe
 */
public class Problema {
    private String descripcion;
    private int importancia;
    private boolean activo;
    
    public Problema(String descripcion, int importancia, boolean activo){
        this.descripcion=descripcion;
        this.importancia=importancia;
        this.activo=activo;
    }
    
    public String getDescripcion(){
        return descripcion;
    }
    
    public int getImportancia(){
        return importancia;
    }
    public boolean getActivo(){
        return activo;
    }
    
     public void setActivo(boolean activo){
        this.activo=activo;
    }
    
     public void setDescripcion(String descripcion){
        this.descripcion=descripcion;
    }
    
    public void setImportancia(int importancia){
        this.importancia=importancia;
    }
    public void ver(){          
        System.out.println("Descripcion: " + this.descripcion);
        System.out.println("Importancia: " + this.importancia);
        System.out.println("Activo: : " + this.activo);
    }
    
}
