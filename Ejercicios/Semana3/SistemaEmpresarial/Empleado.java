/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaempresarial;

/**
 *
 * @author israe
 */
public class Empleado {
    private float Salario;
    private String ID;
    private String Nombre;
    private String Cargo;
    
    public Empleado(float Salario, String ID, String Nombre, String Cargo){
        this.Salario=Salario;
        this.ID=ID;
        this.Nombre=Nombre;
        this.Cargo=Cargo;      
    }
    
    public Empleado(){
        Salario=470;
        ID=null;
        Nombre=null;
        Cargo=null;
    }
    
    public float getSalario(){
        return Salario;
    }
    
    public String getCargo(){
        return Cargo;
    }
    
}
