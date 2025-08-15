/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaparaunaexportadora;

/**
 *
 * @author Michael
 */
public class Producto {
    private String id;
    private String nombre;
    private String descripcion;
    private float precio;
    
    public Producto(String id, String nombre, String descripcion, float precio)
    {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }
    public String getId(){
        return id;
    }
    public String verProducto()
    {
        String cad;
        cad = "ID: " + id + "\nNombre: " + nombre + "\nDescripción: " + descripcion + "\nPrecio: " + precio + "$\n";
        return cad;
    }
}
