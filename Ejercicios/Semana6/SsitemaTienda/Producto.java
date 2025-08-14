/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema_tienda;

/**
 *
 * @author Gab
 */
public class Producto extends Catalogo{
    private String nombre;
    private String codigo;
    private double precio;
    public Producto(String tipo, String nombre, String codigo, double precio){
        super(tipo);
        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;
    }
    public double getPrecio(){
        return this.precio;
    }
    public String getResumen(){
        String cad;
        cad = nombre + "\t" + codigo + "\t" + precio + "$\n";
        return cad;
    }
}
