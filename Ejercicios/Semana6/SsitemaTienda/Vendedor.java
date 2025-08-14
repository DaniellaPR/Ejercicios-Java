/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema_tienda;
import java.util.ArrayList;
/**
 *
 * @author Gab
 */
public class Vendedor extends Personal{
    private int numeroDeCaja;
    private ArrayList<Cliente> carteraDeClientes;
    public Vendedor(String nombre, String ID, int numeroDeCaja){
        super(nombre, ID);
        this.numeroDeCaja = numeroDeCaja;
        this.carteraDeClientes = new ArrayList<>();
    }
    public String atenderPrimerCliente(){
        float total = 0;
        String cad = "";
        if (carteraDeClientes.isEmpty()){
            cad += "No hay cliente por atender";
        }
        else{
            for (int i = 0; i < carteraDeClientes.get(0).getCarritoDeCompras().size();i++){
                cad += carteraDeClientes.getFirst().getCarritoDeCompras().get(i).getResumen();
                total += carteraDeClientes.getFirst().getCarritoDeCompras().get(i).getPrecio();
            }
            if (total == 0){
                cad += "Carrito Vacio \n";
            }
            cad += total + "$\n" + "Cliente Atendido: \nNombre: " + carteraDeClientes.getFirst().getNombre() + "\nID: " + carteraDeClientes.getFirst().getID() + "\nDireccion:" + carteraDeClientes.getFirst().getDireccion() + "\nAtendido por: \n" + nombre + "\nID: " + ID + "\nNumero de caja: " + numeroDeCaja;
            carteraDeClientes.removeFirst();
        }
        return cad;
    }
    public void agregarCliente(Cliente cliente){
        carteraDeClientes.add(cliente);
    }
    public String presentarListaCliente(){
        String cad = "";
        if (carteraDeClientes.equals(0)){
            cad = "No hay Clientes";
        }
        else{
            for (int i = 0; i < carteraDeClientes.size();i++){
                cad += carteraDeClientes.get(i).getResumen();
            }
        }
        return cad;
    }
    public void priorizarCliente(String ID){
        Cliente cambio;
        int pos = -1;
        if (!carteraDeClientes.isEmpty()){
            for (int i = 0; i < carteraDeClientes.size();i++){
                if (carteraDeClientes.get(i).getID().equals(ID)){
                    pos = i;
                }
            }
            cambio = carteraDeClientes.get(pos);
            carteraDeClientes.remove(pos);
            carteraDeClientes.addFirst(cambio);
        }
    }
    public ArrayList<Cliente> getCarteraDeCliente(){
        return this.carteraDeClientes;
    }
}
