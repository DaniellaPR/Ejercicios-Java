/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplolinkedlist;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

/**
 *
 * @author israe
 */
public class EjemploLinkedList {

    /**
     * @param args the command line arguments
     */
    
    //Usamos el metodo removeFirst() para eliminar los usuarios de alta importancia que situamos en las primeras posiciones
    public static LinkedList<Usuario> ResolverAltaImportancia(LinkedList<Usuario> usuarios){
        LinkedList<Usuario> Auxiliar=new LinkedList<>();
        Auxiliar=usuarios;
        //Usamos getFirst() para obtener el nodo en la primera posicion y de tener el valor de importancia alto (1) entonces se elimina        
        while(usuarios.getFirst().getProblema().getImportancia()==1)
            Auxiliar.removeFirst();
        return Auxiliar;
    }
     //Usamos el metodo removeLast() para eliminar los usuarios de alta importancia que situamos en las primeras posiciones
    public static LinkedList<Usuario> ResolverBajaImportancia(LinkedList<Usuario> usuarios){
        LinkedList<Usuario> Auxiliar=new LinkedList<>();
        Auxiliar=usuarios;
        //Usamos getLast() para obtener el nodo en la ultima posicion y de tener el valor de importancia bajo (0) entonces se elimina        
        while(usuarios.getLast().getProblema().getImportancia()==0)
            Auxiliar.removeLast();
        return Auxiliar;
    }
    
    public static LinkedList<Usuario> OrdenarImportancia(LinkedList<Usuario> usuarios){
        LinkedList<Usuario> UsuariosOrdenados=new LinkedList<>();
        for(int i=0;i<usuarios.size();i++){
            //Usamos el metodo addFirst para poner los usuarios con problemas de alta importancia primeros
            if(usuarios.get(i).getProblema().getActivo()==true && usuarios.get(i).getProblema().getImportancia()==1){
                UsuariosOrdenados.addFirst(usuarios.get(i));
            }
            //Usamos el metodo addLast para poner los usuarios con problemas de alta importancia primeros
            else if(usuarios.get(i).getProblema().getActivo()==true){
                UsuariosOrdenados.addLast(usuarios.get(i));
            }                
            else{
                usuarios.get(i).getProblema().setDescripcion("");
                usuarios.get(i).getProblema().setImportancia(-1);
                
            }
            
        }
        return UsuariosOrdenados;
    }
    
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        LinkedList<Usuario> usuarios=new LinkedList<>();
        LinkedList<Usuario> ordenDeImportancia=new LinkedList<>();
        LinkedList<Usuario> sinUsuariosAltaImportancia=new LinkedList<>();
        LinkedList<Usuario> sinUsuariosBajaImportancia=new LinkedList<>();
        //Generacion de problemas        
        Problema p1=new Problema("Sistema lento",0,true);
        Problema p2=new Problema("Dificultad en instalar actualizaciones",0,true);
        Problema p3=new Problema("Caida del sistema",1,true);
        Problema p4=new Problema("Carajo",1,false);
        
        
        //Ingreso de los datos de usuarios
        usuarios.add(new Usuario("Juan",p1,"00001"));
        usuarios.add(new Usuario("Pedro",p2,"00002"));
        usuarios.add(new Usuario("Maria",p3,"00003"));
        usuarios.add(new Usuario("Rodgrigo",p4,"00003"));
        /*
        for(int i=0;i<usuarios.size();i++){
            usuarios.get(i).ver();
        }*/
        
       System.out.println("Lista ordenada");
        ordenDeImportancia=OrdenarImportancia(usuarios);        
        for(int i=0;i<ordenDeImportancia.size();i++){
            ordenDeImportancia.get(i).ver();
        }
        System.out.println();
        
        sinUsuariosAltaImportancia=ResolverAltaImportancia(ordenDeImportancia);
        System.out.println("LinkedList sin usuarios de importancia alta");
         for(int i=0;i<sinUsuariosAltaImportancia.size();i++){
            sinUsuariosAltaImportancia.get(i).ver();
        }
        System.out.println();

       ordenDeImportancia=OrdenarImportancia(usuarios); 
        
        sinUsuariosBajaImportancia=ResolverBajaImportancia(ordenDeImportancia);
        System.out.println("LinkedList sin usuarios de importancia baja");
         for(int i=0;i<sinUsuariosBajaImportancia.size();i++){
            sinUsuariosBajaImportancia.get(i).ver();
        }
        System.out.println();

        
         
    }
    
}
