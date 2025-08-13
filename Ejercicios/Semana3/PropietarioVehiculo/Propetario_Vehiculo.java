/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package propetario_vehiculo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author Gab
 */
public class Propetario_Vehiculo {

    public static Propietario[] CompararMarcas(Propietario[][] datos, String marcaBuscada){
        
        int contador = 0;
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                if (datos[i][j].getCarro().getMarca().equals(marcaBuscada)){
                    contador++;
                }
            }
        }
        Propietario[] Encontrado = new Propietario[contador];
        contador = 0;
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                if (datos[i][j].getCarro().getMarca().equals(marcaBuscada)){
                    Encontrado[contador] = datos[i][j];
                    contador++;
                }
            }
        }
        return Encontrado;
    }
    public static Vehiculo[] OrdenarPlacas(Vehiculo[] datos){
        int i = 0;
        Vehiculo temporal;
        while (i < 3){
            if (datos[i].getPlaca().charAt(0) < datos[i+1].getPlaca().charAt(0)){
                temporal = datos[i];
                datos[i] = datos[i+1];
                datos[i+1] = temporal;
                i = 0;
            }
            else{
                i++;
            }
        }
        return datos;
    }
    public static void main(String[] args) throws IOException {
        String nombre;
        String ID;        
        String telefono;
        String direccion;
        String placa;
        String marca;
        String modelo;
        int anioDeFabricacion;
        String marcaBuscada;
        Propietario[][] datosPropietario = new Propietario[3][3];
        Vehiculo[] datosVehiculos = new Vehiculo[4];
        Propietario temporal;
        Vehiculo carroTemporal;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++){
                System.out.println("Ingrese nombre del propietario #" + (i+1));
                nombre = br.readLine();
                System.out.println("Ingrese ID del propietario:");
                ID = br.readLine();
                System.out.println("Ingrese el telefono del propietario");
                telefono = br.readLine();
                System.out.println("Ingrese la direccion del propietario");
                direccion = br.readLine();
                System.out.println("Ingrese la marca del carro que posea el propietario");
                marca = br.readLine();
                System.out.println("Ingrese la placa del carro que posea el propietario");
                placa = br.readLine();
                System.out.println("Ingrese el modelo del carro del propietario");
                modelo = br.readLine();
                System.out.println("Ingrese el año de fabricacion del carro del propietario");
                anioDeFabricacion = Integer.parseInt(br.readLine());
                carroTemporal = new Vehiculo(placa, marca, modelo, anioDeFabricacion);
                temporal = new Propietario(nombre, ID, telefono, direccion, carroTemporal);
                datosPropietario[i][j] = temporal;
            }
        }
        System.out.println("¿Cual es la marca que desea buscar?");
        marcaBuscada = br.readLine();
        Propietario[] Encontrado; 
        Encontrado = CompararMarcas(datosPropietario, marcaBuscada);
        if (Encontrado.length != 0){
            for (int i = 0; i < Encontrado.length; i++){
                Encontrado[i].Ver();
            }
        }
        else{
            System.out.println("No se ha encontrado coincidencias");
        }
        for(int i = 0; i < 4; i++){
            System.out.println("Ingrese la marca del carro que posea el propietario");
            marca = br.readLine();
            System.out.println("Ingrese la placa del carro que posea el propietario");
            placa = br.readLine();
            System.out.println("Ingrese el modelo del carro del propietario");
            modelo = br.readLine();
            System.out.println("Ingrese el año de fabricacion del carro del propietario");
            anioDeFabricacion = Integer.parseInt(br.readLine());
            carroTemporal = new Vehiculo(placa, marca, modelo, anioDeFabricacion);
            datosVehiculos[i] = carroTemporal; 
        }
        datosVehiculos = OrdenarPlacas(datosVehiculos);
        for (int i = 0; i < 4; i++){
            datosVehiculos[i].Ver();
        }
    }    
}
