/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemadeexportacion;

/**
 *
 * @author Michael
 */
public class Automovil extends Vehiculo{
    private String placa;
    
    public Automovil(String marca, String modelo, int anioFabricacion, int capacidad, String placa)
    {
        super(marca, modelo, anioFabricacion, capacidad);
        this.placa = placa;
    }
    public String getMatricula(){
        return placa;
    }
    public String verAutomovil()
    {
        String cad = "";
        cad += "Marca: " + marca + "\nModelo: " + modelo + "\nAño de fabricación: " + anioFabricacion + "\nCapacidad:" + capacidad + "\nPlaca: " + placa + "\n";
        return cad;
    }
}
