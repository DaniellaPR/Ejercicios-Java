package sistemahospitalario;

/**
 *
 * @author danie
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SistemaHospitalario  {
    public static void main(String[] args)throws IOException {
        
        String ID;
        String Nombre;
        int edad;
        String genero;
        String sintoma;
        float salario;
        String especialidad;
        String hospital_asignado;
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Paciente paciente = new Paciente();
        Doctor doctor = new Doctor();
        
        
        System.out.println("Paciente Nuevo:");
        System.out.println("Ingrese el nombre: ");
        Nombre = br.readLine();
        System.out.println("Ingrese el ID: ");
        ID = br.readLine();
        System.out.println("Ingrese la edad: ");
        edad = Integer.parseInt(br.readLine());
        System.out.println("Ingrese el genero: ");
        genero = br.readLine();
        System.out.println("Ingrese el sintoma: ");
        sintoma = br.readLine();
        paciente.setear_datos(ID, Nombre, edad, genero, sintoma);
        paciente.ver_datos();
        // TODO code application logic here
        
        System.out.println("Doctor:");
        System.out.println("Ingrese el nombre del doctor: ");
        Nombre = br.readLine();
        System.out.println("Ingrese el ID: ");
        ID = br.readLine();
        System.out.println("Ingrese la edad: ");
        edad = Integer.parseInt(br.readLine());
        System.out.println("Ingrese el salario: ");
        salario = Integer.parseInt(br.readLine());
        System.out.println("Ingrese el especialidad: ");
        especialidad = br.readLine();
        System.out.println("Ingrese el hospital asignado: ");
        hospital_asignado = br.readLine();
        doctor.setear_datos(ID, Nombre, edad, especialidad, salario, hospital_asignado);
        doctor.ver_datos();
    }
    
}
