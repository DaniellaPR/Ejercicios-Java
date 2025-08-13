/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemaempresarial;

/**
 *
 * @author israe
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class SistemaEmpresarial {
    //Funcion Obtener Sueldo por Cargo
    public static void ObtenerSueldo(Empleado[][] empleados) throws IOException{
        String cargo;
        float SueldoTotal=0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Cual es el cargo que va a buscar? ");
        cargo=br.readLine();
        int i,j;
        for (i=0;i<2;i++){
            for(j=0;j<2;j++){
                if(empleados[i][j].getCargo().equals(cargo)){
                    SueldoTotal = SueldoTotal + empleados[i][j].getSalario();
                }
            }
        }  
        System.out.println("El valor total del salario del empleado con el cargo "+cargo+" es: "+SueldoTotal);
    }
    
    //Funcion OBtener Productos en un intervalo minimo y maximo
    public static void ObtenerProductos(Producto[]productos)throws IOException{
        float minimo=0,maximo=100;
        int i;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Cual es el valor minimo para buscar? ");
        minimo=Float.parseFloat(br.readLine());
        System.out.println("Cual es el valor maximo para buscar? ");
        maximo=Float.parseFloat(br.readLine());
        for(i=0;i<5;i++){
            if(minimo<=productos[i].getValor() && productos[i].getValor()<=maximo ){
                System.out.println("El producto "+ productos[i].getNombre() + " tiene su precio en el rango de valores");
            }
        }
        
    }
    public static void main(String[] args)throws IOException {
        // TODO code application logic here
        float Salario;
        String ID;
        String Nombre_Empleado;
        String Cargo;
        float Valor;
        String Codigo;  
        String Nombre_Producto;             
        int i,j,contador;        
       

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Empleado[][] empleados=new Empleado[2][2];
        Producto[] productos=new Producto[5];
        contador=1;
    
          
        //Ingresamos los datos de los empleados en matriz 2x2
        for (i=0;i<2;i++){
            for(j=0;j<2;j++){   
                System.out.println("Ingrese el salario del empleado "+ contador);
                Salario=Integer.parseInt(br.readLine());
                System.out.println("Ingrese el ID del empleado "+ contador);
                ID=br.readLine();
                System.out.println("Ingrese el Nombre del empleado "+ contador);
                Nombre_Empleado=br.readLine();
                System.out.println("Ingrese el Cargo del empleado "+ contador);
                Cargo=br.readLine();
                empleados[i][j]=new Empleado(Salario,ID,Nombre_Empleado,Cargo);
                contador++;
            }
        }
        
        //Obtenemos el salario del empleado
        ObtenerSueldo(empleados);

        //Ingresamos los datos de los productos en un arreglo de 5       
        for (i=0;i<5;i++){
            System.out.println("Ingrese el Valor del producto "+ i+1);
            Valor=Integer.parseInt(br.readLine());
            System.out.println("Ingrese el Caodigo del producto "+ i+1);
            Codigo=br.readLine();
            System.out.println("Ingrese el Nombre del producto "+ i+1);
            Nombre_Producto=br.readLine();            
            productos[i]=new Producto(Valor,Codigo,Nombre_Producto);
        }
        
        //Obtenemos los productos en el rango deseado
        ObtenerProductos(productos);
        

        
        
    }
    
}
