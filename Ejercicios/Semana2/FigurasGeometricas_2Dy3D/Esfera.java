/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras_geometricas_2d_y_3d;

/**
 *
 * @author danie
 */
public class Esfera {
    float radio;
    public void settear_datos(float radio)
    {
        this.radio = radio;
    }
    public double calcular_area()
    {
        return 4*java.lang.Math.PI*java.lang.Math.pow(this.radio, 2);
    }
    public double calcular_volumen()
    {
        return (4*java.lang.Math.PI*java.lang.Math.pow(this.radio, 3))/3;
    }
    public void ver_datos()
    {
        System.out.println("Radio: " + this.radio);
    }
}

