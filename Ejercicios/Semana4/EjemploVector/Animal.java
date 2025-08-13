/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplovector;

/**
 *
 * @author Michael
 */
public class Animal {
    private String nombre;
    private String especie;
    private String sexo;
    private int anioNacimiento;
    
    // Constructor
    public Animal (String nombre, String especie, String sexo, int anioNacimiento){
        this.nombre = nombre;
        this.especie = especie;
        this.sexo = sexo;
        this.anioNacimiento = anioNacimiento;
    }
    public String getSexo(){
        return sexo;
    }
    public void verAnimal(){
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Especie: " + this.especie);
        System.out.println("Sexo: " + this.sexo);
        System.out.println("Anio de nacimiento: " + this.anioNacimiento);
    }
}
