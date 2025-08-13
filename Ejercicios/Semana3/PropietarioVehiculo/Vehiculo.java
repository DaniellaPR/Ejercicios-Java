/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package propetario_vehiculo;

/**
 *
 * @author Gab
 */
public class Vehiculo {
    private String placa;
    private String marca;
    private String modelo;
    private int anioDeFabricacion;
    public Vehiculo(){
        placa = null;
        marca = null;
        modelo = null;
        anioDeFabricacion = -1;
    }
    public Vehiculo(String placa, String marca, String modelo, int anioDeFabricacion){
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.anioDeFabricacion = anioDeFabricacion;
    }
    public String getMarca(){
        return this.marca;
    }
    public String getPlaca(){
        return this.placa;
    }
    public void Ver(){
        System.out.println("Marca: " + marca + "\nModelo: " + modelo + "\nPlaca: " + placa + "\nAño de fabricacion: " + anioDeFabricacion);
    }
}
