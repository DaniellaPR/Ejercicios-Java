/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaeducativo;

/**
 *
 * @author Michael
 */
public class Estudiante {
    // Ver datos Id, curso, paralelo, nombre, edad
    private String nombre;
    private String id;
    private int edad;
    private String curso;
    private String paralelo;
    
    public Estudiante(){
        nombre = null;
        id  = null;
        edad = -1;
        curso = null;
        paralelo = null;
    }
    public Estudiante(String nombre, String id, int edad, String curso, String paralelo){
        this.nombre = nombre;
        this.id  = id;
        this.edad = edad;
        this.curso = curso;
        this.paralelo = paralelo;
    }
    public String getId(){
        return this.id;
    }
    public void Ver(){
        System.out.println("Nombre: " + nombre + "\nId: " + id + "\nEdad: " + edad + "\nCurso: " + curso +"\nParalelo: " + paralelo);
    }
}
