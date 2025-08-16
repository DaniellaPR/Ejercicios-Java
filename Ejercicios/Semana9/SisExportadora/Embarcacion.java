/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaparaunaexportadora;

/**
 *
 * @author Michael
 */
public class Embarcacion extends Vehiculo{
    private String identificacionNaval;
    
    public Embarcacion(String marca, String modelo, int anioFabricacion, int capacidad, String identificacionNaval)
    {
        super(marca, modelo, anioFabricacion, capacidad);
        this.identificacionNaval = identificacionNaval;
    }
    public String getMatricula(){
        return identificacionNaval;
    }
    public String verEmbarcacion()
    {
        String cad = "";
        cad += "Marca: " + marca + "\nModelo: " + modelo + "\nAño de fabricación: " + anioFabricacion + "\nCapacidad:" + capacidad + "\nIdentificación naval: " + identificacionNaval + "\n";
        return cad;
    }
}
