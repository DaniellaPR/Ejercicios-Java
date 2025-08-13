/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras_geometricas_2d_y_3d;

/**
 *
 * @author danie
 */
public class Piramide {
    float altura;
    float altura_lateral;
    float lado_base;
    public void settear_datos(float altura, float altura_lateral, float lado_base)
    {
        this.altura = altura;
        this.altura_lateral = altura_lateral;
        this.lado_base = lado_base;
    }
    public double calcular_area()
    {
        return java.lang.Math.pow(this.lado_base, 2)+2*this.lado_base*this.altura_lateral;
    }
    public double calcular_volumen()
    {
        return (java.lang.Math.pow(this.lado_base, 2)*this.altura)/3;
    }
    public void ver_datos()
    {
        System.out.println("Altura: " + this.altura + "\n" + "Altura lateral: " + this.altura_lateral + "\n" + "Lado base: " + this.lado_base);
    }
}

