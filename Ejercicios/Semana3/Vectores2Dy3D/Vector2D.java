/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vectores2dy3d;

/**
 *
 * @author israe
 */
public class Vector2D {
    private float x;
    private float y;
  
    
    public Vector2D(float x, float y){
        this.x=x;
        this.y=y;             
    }
    
    public Vector2D(){
        x=0;
        y=0;
    }
    
    public float getX(){
        return x;
    }
    
    public float getY(){
        return y;
    }
    
}
