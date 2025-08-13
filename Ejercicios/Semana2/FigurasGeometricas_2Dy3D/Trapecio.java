/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras_geometricas_2d_y_3d;

/**
 *
 * @author danie
 */
public class Trapecio {
    float base_super;
    float base_infer;
    float altura;
    public void settear_datos(float base_super, float base_infer, float altura)
    {
        this.base_super = base_super;
        this.base_infer = base_infer;
        this.altura = altura;
    }
    public float calcular_area()
    {
        return (base_super+base_infer)/2*altura;
    }
    public void ver_datos()
    {
        System.out.println("Base superior: " + this.base_super + "\n" + "Base superior: " + this.base_infer + "\n" + "Altura: " + this.altura);
    }
}

