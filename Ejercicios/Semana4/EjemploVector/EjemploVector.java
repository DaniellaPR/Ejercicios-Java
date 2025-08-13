/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplovector;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Vector;

/**
 *
 * @author danie
 */
public class EjemploVector {
    
    // Buscar a los animales por su sexo
    public static Vector<Animal> buscarPorSexo(Vector<Animal> animales, String sexo){
        Vector<Animal> encontrados = new Vector<>();
        for (int i = 0; i < animales.size(); i++){
            if (animales.get(i).getSexo().toLowerCase().equals(sexo))
                encontrados.add(animales.get(i));
        }
        return encontrados;
    }
    public static void verAnimales(Vector<Animal> animales){
        for (int i = 0; i < animales.size(); i++){
            animales.get(i).verAnimal();
            System.out.println("-------------------------");
        }
    }
    public static Vector<Animal> eliminarPorSexo(Vector<Animal> animales, String sexo){
        for (int i = 0; i < animales.size(); i++){
            if (animales.get(i).getSexo().toLowerCase().equals(sexo))
                animales.remove(i);
        }
        return animales;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        
        Vector<Animal> animales = new Vector<>(); // Crear un Vector para almacenar los animales
        Vector<Animal> hembras = new Vector<>(); // Vector que almacenará los animales que son hembras
        Vector<Animal> machos = new Vector<>(); // Vector que almacenará los animales que son machos
        String nombre;
        String especie;
        String sexo;
        int anioNacimiento;
        
        // Ingreso de objetos animales al vector animales
        animales.add(new Animal ("Auru", "Leon", "Macho", 2010));
        animales.add(new Animal ("Lira", "Lobo", "Hembra", 2013));
        animales.add(new Animal ("Agitha", "Tortuga", "Hembra", 2012));
        animales.add(new Animal ("Zant", "Loro", "Macho", 2016));
        animales.add(new Animal ("Ashei", "Oso", "Hembra", 2020));
        
        // Buscar animales que son hembras
        hembras = buscarPorSexo(animales, "hembra");
        System.out.println("\nAnimales hembra: ");
        verAnimales(hembras);
        
        // Buscar animales que son machos
        machos = buscarPorSexo(animales, "macho");
        System.out.println("\nAnimales machos: ");
        verAnimales(machos);
        
        // Ingreso por consola de un nuevo animal
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese el nombre del nuevo animal: ");
        nombre = br.readLine();
        System.out.println("Ingrese la especie del nuevo animal: ");
        especie = br.readLine();
        System.out.println("Ingrese el sexo del nuevo animal: ");
        sexo = br.readLine();
        System.out.println("Ingrese el anio de nacimiento del nuevo animal: ");
        anioNacimiento = Integer.parseInt(br.readLine());
        animales.add(new Animal (nombre, especie, sexo, anioNacimiento));

        // Ver todos los animales
        System.out.println("\nTodos los animales: ");
        verAnimales(animales);
        
        // Sacar del vector los animaes machos
        animales = eliminarPorSexo(animales, "macho");
        System.out.println("\nSe quito del vector los animales macho: ");
        verAnimales(animales);
    }
    
}

