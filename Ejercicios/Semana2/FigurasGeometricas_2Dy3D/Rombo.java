/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras_geometricas_2d_y_3d;

/**
 *
 * @author danie
 */
public class Rombo {
    float diametro_superior;
    float diametro_inferior;
    public void settear_datos(float diametro_super, float diametro_infer)
    {
        this.diametro_superior = diametro_super;
        this.diametro_inferior = diametro_infer;
    }
    public float calcular_area()
    {
        return (diametro_superior*diametro_inferior)/2;
    }
    public void ver_datos()
    {
        System.out.println("Diametro superior: " + this.diametro_superior + "\n" + "Diametro superior: " + this.diametro_inferior);
    }
}

