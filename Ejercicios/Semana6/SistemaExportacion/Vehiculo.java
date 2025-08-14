/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemadeexportacion;

/**
 *
 * @author Michael
 */
public class Vehiculo {
    protected String marca;
    protected String modelo;
    protected int anioFabricacion;
    protected int capacidad;
    
    public Vehiculo(){
        this.marca = null;
        this.modelo = null;
        this.anioFabricacion = -1;
        this.capacidad = -1;
    }
    public Vehiculo(String marca, String modelo, int anioFabricacion, int capacidad)
    {
        this.marca = marca;
        this.modelo = modelo;
        this.anioFabricacion = anioFabricacion;
        this.capacidad = capacidad;
    }
    public String getMarca(){
        return marca;
    }
    public String getMatricula(Automovil automovil){
        return automovil.getMatricula();
    }
    public String getMatricula(Aeronave aeronave){
        return aeronave.getMatricula();
    }
    public String getMatricula(Embarcacion embarcacion){
        return embarcacion.getMatricula();
    } 
    public String verVehiculo(Automovil automovil){
        return automovil.verAutomovil();
    }
    public String verVehiculo(Aeronave aeronave){
        return aeronave.verAeronave();
    }
    public String verVehiculo(Embarcacion embarcacion){
        return embarcacion.verEmbarcacion();
    }
}
