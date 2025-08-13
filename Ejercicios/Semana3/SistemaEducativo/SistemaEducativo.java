/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemaeducativo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author Michael
 */
public class SistemaEducativo{

    /**
     * @param args the command line arguments
     */

    public static Estudiante buscarEstudiante(Estudiante[] datos, String codigo){
        /* Si se encuentra al estudiante se devuelve un objeto Estudiante con los datos de dicho estudiante
        Caso contrario regresa un objeto con datos genéricos; los strings son null y los datos enteros son -1
        */
        Estudiante encontrado = new Estudiante();
        String idActual;
        for (int i = 0; i < 5; i++){
            idActual = datos[i].getId();
            if (codigo.equals(idActual)){
                encontrado = datos[i];
            }
        }
        return encontrado;
    }
    public static void main(String[] args) throws IOException{
        String nombre;
        String id;
        int edad;
        String curso;
        String paralelo;
        String idABuscar;
        Estudiante[] datos = new Estudiante[5];
        Estudiante temporal, encontrado = new Estudiante();
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        datos[0] = new Estudiante("Daniel", "P001", 18, "4", "A");
        datos[1] = new Estudiante("Daniel", "P003", 18, "4", "A");
        datos[2] = new Estudiante("Daniel", "P004", 18, "4", "A");
        datos[3] = new Estudiante("Daniel", "P005", 18, "4", "A");
        datos[4] = new Estudiante("Daniel", "P006", 18, "4", "A");
        
        System.out.println("Ingrese el ID del estudiante que desea buscar:");
        idABuscar = br.readLine();
        
        encontrado = buscarEstudiante(datos ,idABuscar);
        if (encontrado.getId() == null)
            System.out.println("No se ha encontrado al estudainte con el ID: " + idABuscar);
        else{
            System.out.println("El estudiante con el ID " + idABuscar + " ah sido encontrado \nDatos del estudiante:");
            encontrado.Ver();
        }
    }
    
}
