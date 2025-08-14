/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema_tienda;

import java.util.ArrayList;
/**
 *
 * @author israe
 */
public class Cliente {
    private String nombre;
    private String ID;
    private String direccion;
    private ArrayList<Producto> carritoDeCompras;
    public Cliente(String nombre, String ID, String direccion){
        this.nombre = nombre;
        this.ID = ID;
        this.direccion = direccion;
        this.carritoDeCompras = new ArrayList<>();
    }
    public Cliente(){
        this.nombre = null;
        this.ID = null;
        this.direccion = null;
        this.carritoDeCompras = new ArrayList<>();
    }
    public ArrayList<Producto> getCarritoDeCompras(){
        return this.carritoDeCompras;
    }
    public void agregarAlCarrito(Producto producto){
        this.carritoDeCompras.add(producto);
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getID(){
        return this.ID;
    }
    public String getDireccion(){
        return this.direccion;
    }
    public String getResumen(){
        String cad = nombre + "\t" + ID + "\t" + direccion + "\n";
        return cad;
    }
}

