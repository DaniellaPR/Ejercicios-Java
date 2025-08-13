/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package propetario_vehiculo;

/**
 *
 * @author Gab
 */
public class Propietario {
    private String nombre;
    private String ID;
    private String telefono;
    private String direccion;
    private Vehiculo carro;
    public Propietario()
    {
        nombre = null;
        ID = null;
        telefono = null;
        direccion = null;
        carro = null;
    }
    public Propietario(String nombre, String ID, String telefono, String direccion, Vehiculo carro)
    {
        this.nombre = nombre;
        this.ID = ID;
        this.telefono = telefono;
        this.direccion = direccion;
        this.carro = carro;
    }
    public Vehiculo getCarro(){
        return this.carro;
    }
    public void Ver(){
        System.out.println("Nombre: " + nombre + "\nID: " + ID + "\nTelefono: " + telefono + "\nDireccion: " + direccion +"\nMarca de carro: " + carro.getMarca() + "\nPlaca: " + carro.getPlaca());
    }
}
