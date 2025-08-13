/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vectores2dy3d;

/**
 *
 * @author israe
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Vectores2Dy3D {

    /**
     * @param args the command line arguments
     */
    public static void CompararVectores(Vector3D[] vectores3D , Vector2D[] vectores2D){
        int i,j;        
       
        //Compara vectores 3d con 2d
        for (i=0;i<3;i++){
            if(vectores3D[i].getZ()==0){
                for(j=0;j<2;j++){
                    if(vectores2D[j].getX()==vectores3D[i].getX() && vectores2D[j].getY()==vectores3D[i].getY()){
                        System.out.println("El vector 3D \n x:" + vectores3D[i].getX()+ " y:"+vectores3D[i].getY()+" z:0");
                        System.out.println("Es igual al vector 2D \n x:" + vectores2D[j].getX()+ " y:"+vectores2D[j].getY());
                    }                    
                }
            }          
        }
        
        //Compara vectores 3d con 3d
        for(i=0;i<3;i++){
            for(j=1;j<3;j++){
                if(j!=i){
                    if(vectores3D[i].getX()==vectores3D[j].getX() && vectores3D[i].getY()==vectores3D[j].getY() && vectores3D[i].getZ()==vectores3D[j].getZ()){
                        System.out.println("El vector 3D \n x:" + vectores3D[i].getX()+ " y:"+vectores3D[i].getY()+" z:"+vectores3D[i].getZ());
                        System.out.println("Es igual al vector 3D \n x:" + vectores3D[j].getX()+ " y:"+vectores3D[j].getY()+" z:"+vectores3D[j].getZ());
                    }
                    
                }
            }
        }
        
        //Compara vectores 2d con 2d
        if(vectores2D[0].getX()==vectores2D[1].getX() && vectores2D[0].getY()==vectores2D[1].getY()){
            System.out.println("El vector 2D \n x:" + vectores3D[0].getX()+ " y:"+vectores3D[0].getY());
            System.out.println("Es igual al vector 2D \n x:" + vectores3D[1].getX()+ " y:"+vectores3D[1].getY());
        }
    
        
    }
    
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        float x,y,z;
        int i,contador=1;
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        Vector3D[] vectores3D=new Vector3D[3];
        Vector2D[] vectores2D=new Vector2D[2];
        
        for(i=0;i<3;i++){   
            System.out.println("Ingrese el valor de x en el vector 3D numero "+ contador);
            x=Float.parseFloat(br.readLine());
            System.out.println("Ingrese el valor de y en el vector 3D numero "+ contador);
            y=Float.parseFloat(br.readLine());
            System.out.println("Ingrese el valor de z en el vector 3D numero "+ contador);
            z=Float.parseFloat(br.readLine());
            vectores3D[i]=new Vector3D(x,y,z);
            contador++;
        }
        contador=1;
        for(i=0;i<2;i++){   
            System.out.println("Ingrese el valor de x en el vector 2D numero "+ contador);
            x=Float.parseFloat(br.readLine());
            System.out.println("Ingrese el valor de y en el vector 2D numero "+ contador);
            y=Float.parseFloat(br.readLine());      
            vectores2D[i]=new Vector2D(x,y);
            contador++;
        }
         
        CompararVectores(vectores3D,vectores2D);
    }
    
}
