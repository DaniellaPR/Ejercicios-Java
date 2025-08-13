/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vectores2dy3d;

/**
 *
 * @author israe
 */
public class Vector3D {
    private float x;
    private float y;
    private float z;
  
    
    public Vector3D(float x, float y,float z){
        this.x=x;
        this.y=y;    
        this.z=z;
    }
    
    public Vector3D(){
        x=0;
        y=0;
        z=0;
    }
    
    public float getX(){
        return x;
    }
    
    public float getY(){
        return y;
    }
    public float getZ(){
        return z;
    }
}
