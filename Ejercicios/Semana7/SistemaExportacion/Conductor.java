/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemadeexportacion;

/**
 *
 * @author Michael
 */
public class Conductor {
    private String cedula;
    private String nombre;
    private boolean licenciaProfesionalVehiculo;
    private boolean licenciaPiloto;
    private boolean licenciaNavegacion;
    
    public Conductor(){
        this.cedula = null;
        this.nombre = null;
        this.licenciaProfesionalVehiculo = false;
        this.licenciaPiloto = false;
        this.licenciaNavegacion = false;
    }
    public Conductor(String cedula, String nombre, boolean licenciaProfesionalVehiculo, boolean licenciaPiloto, boolean licenciaNavegacion)
    {
        this.cedula = cedula;
        this.nombre = nombre;
        this.licenciaProfesionalVehiculo = licenciaProfesionalVehiculo;
        this.licenciaPiloto = licenciaPiloto;
        this.licenciaNavegacion = licenciaNavegacion;
    }
    public String getCedula(){
        return cedula;
    }
    public String verConductor()
    {
        String cad = "";
        cad += "Cedula: " + cedula + "\nNombre: " + nombre + "\n";
        // Licencia de vehículo
        if (licenciaProfesionalVehiculo)
            cad += "Sí tiene una licencia profesional de vehículo.\n";
        else
            cad += "No tiene una licencia profesional de vehículo.\n";
        // Licencia de aeronave
        if (licenciaPiloto)
            cad += "Sí tiene una licencia de piloto de avión.\n";
        else
            cad += "No tiene una licencia de piloto de avión.\n";
        // Licencia de embarcación
        if (licenciaNavegacion)
            cad += "Sí tiene una licencia de navegación.\n";
        else
            cad += "No tiene una licencia de navegación.\n";
        cad += "\n";
        return cad;
    }
}
