/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaparaunaexportadora;

/**
 *
 * @author Michael
 */
public class Aeronave extends Vehiculo{
    private String registroAeronave;
    
    public Aeronave(String marca, String modelo, int anioFabricacion, int capacidad, String registroAeronave)
    {
        super(marca, modelo, anioFabricacion, capacidad);
        this.registroAeronave = registroAeronave;
    }
    public String getMatricula(){
        return registroAeronave;
    }
    public String verAeronave()
    {
        String cad = "";
        cad += "Marca: " + marca + "\nModelo: " + modelo + "\nAño de fabricación: " + anioFabricacion + "\nCapacidad:" + capacidad + "\nRegistro de aeronave: " + registroAeronave + "\n";
        return cad;
    }
}
