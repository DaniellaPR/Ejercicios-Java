/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package containerEscuchador;

/**
 *
 * @author danie
 */

import javax.swing.*;

public class ContainerEscuchador {

    public static void main(String[] args) {
        //Crea la ventana principal (JFrame)
        JFrame frame = new JFrame("Demo ContainerListener con Paneles y Etiquetas");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);

        //Configura la interfaz de usuario en la ventana
        ContainerListen.setupUI(frame);

        //Hace visible la ventana
        frame.setVisible(true);
    }
}
