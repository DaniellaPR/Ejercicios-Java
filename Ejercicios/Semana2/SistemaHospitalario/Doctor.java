/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemahospitalario;

/**
 *
 * @author danie
 */
public class Doctor {
    String ID;
    String Nombre;
    int Edad;
    float salario;
    String especialidad;
    String hospital_asignado;
    public void setear_datos(String ID, String Nombre, int Edad, String especialidad, float salario, String hospital_asignado)
    {
        this.ID = ID;
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.salario = salario;
        this.hospital_asignado = hospital_asignado;
    }
    public void ver_datos()
    {
        System.out.println("ID: " + this.ID + "\n" + "Nombre: " + this.Nombre +"\n" + "Edad" + this.Edad + "\n" + "Salario: "+this.salario + "\n" + "Especialidad: "+ this.especialidad+ "\n" +"Hospital Asignado: " + this.hospital_asignado);
    }
}
