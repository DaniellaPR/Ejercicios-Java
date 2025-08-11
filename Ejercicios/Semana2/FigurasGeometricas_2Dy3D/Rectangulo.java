/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras_geometricas_2d_y_3d;

/**
 *
 * @author Gab
 */
public class Rectangulo {
    float altura;
    float base;
    public void settear_datos(float altura, float base)
    {
        this.altura = altura;
        this.base = base;
    }
    public float calcular_area()
    {
        return altura*base;
    }
    public void ver_datos()
    {
        System.out.println("Altura: " + this.altura + "\n" + "Base: " + this.base);
    }
}
