/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemagestorobras;

/**
 *
 * @author israe
 */
public class Personal {
    private String Rol;
    private float Salario;
    private String ID;
    
    public Personal(String Rol, float Salario,String ID){
        this.Rol=Rol;
        this.Salario=Salario;
        this.ID=ID;
    }
    
    public String getInf(){
        return "Rol: "+ Rol +"\nSalario: "+Salario+"\nID: "+ID+"\n";
    }
    public float getSalario(){
        return Salario;
    }
    public String getID(){
        return ID;
    }         
    
}
