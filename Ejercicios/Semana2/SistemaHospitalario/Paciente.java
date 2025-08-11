
package sistemahospitalario;

/**
 *
 * @author danie
 */
public class Paciente {
    String ID;
    String Nombre;
    int Edad;
    String genero;
    String sintoma;
    public void setear_datos(String ID, String Nombre, int Edad, String genero, String sintoma)
    {
        this.ID = ID;
        this.Nombre = Nombre;
        this. Edad = Edad;
        this. genero = genero;
        this. sintoma = sintoma;
    }
    public void ver_datos()
    {
        System.out.println("ID: " + this.ID + "\n" + "Nombre: " + this.Nombre +"\n" + "Edad: " + this.Edad + "\n" + "Genero: "+this.genero + "\n" + "Sintoma: "+ this.sintoma);
    }
}
