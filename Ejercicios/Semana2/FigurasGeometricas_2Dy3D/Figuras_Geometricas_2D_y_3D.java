package figuras_geometricas_2d_y_3d;

/**
 *
 * @author israe
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Figuras_Geometricas_2D_y_3D {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        float altura;
        float base;
        float diametro_superior;
        float diametro_inferior;
        float base_super;
        float base_infer;
        float altura_lateral;
        float lado_base;
        float radio;
        
        Rectangulo a = new Rectangulo();
        Rombo b = new Rombo();
        Trapecio c = new Trapecio();
        Piramide d = new Piramide();
        Esfera e = new Esfera();
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Rectangulo");
        System.out.println("Ingrese la altura del rectangulo");
        altura = Float.parseFloat(br.readLine());
        System.out.println("Ingrese la base del rectangulo");
        base = Float.parseFloat(br.readLine());
        a.settear_datos(altura, base);
        System.out.println("El area del rectangulo es: " + a.calcular_area());
        a.ver_datos();
        
        
        
        System.out.println("Rombo");
        System.out.println("Ingrese el diametro superior del rombo");
        diametro_superior = Float.parseFloat(br.readLine());
        System.out.println("Ingrese la diametro inferior del rombo");
        diametro_inferior = Float.parseFloat(br.readLine());
        b.settear_datos(diametro_superior, diametro_inferior);
        System.out.println("El area del rombo es: " + b.calcular_area());
        b.ver_datos();
        
        
        
        System.out.println("Trapecio");
        System.out.println("Ingrese la base superior del trapecio");
        base_super = Float.parseFloat(br.readLine());
        System.out.println("Ingrese la base inferior del trapecio");
        base_infer = Float.parseFloat(br.readLine());
        System.out.println("Ingrese la altura del trapecio");
        altura = Float.parseFloat(br.readLine());
        c.settear_datos(base_super, base_infer, altura);
        System.out.println("El area del trapecio es: " + c.calcular_area());
        c.ver_datos();
        
        
        
        System.out.println("Piramide");
        System.out.println("Ingrese la altura de la piramide");
        altura = Float.parseFloat(br.readLine());
        System.out.println("Ingrese la altura lateral de la piramide");
        altura_lateral = Float.parseFloat(br.readLine());
        System.out.println("Ingrese el lado base de la piramide");
        lado_base = Float.parseFloat(br.readLine());
        d.settear_datos(altura, altura_lateral, lado_base);
        System.out.println("El area de la piramide es: " + d.calcular_area());
        System.out.println("El volumen de la piramide es: " + d.calcular_volumen());
        d.ver_datos();
        
        
        
        System.out.println("Esfera");
        System.out.println("Ingrese el radio de la esfera");
        radio = Float.parseFloat(br.readLine());
        e.settear_datos(radio);
        System.out.println("El area de la esfera es: " + e.calcular_area());
        System.out.println("El volumen de la esfera es: " + e.calcular_volumen());
        e.ver_datos();
    }
    
}

