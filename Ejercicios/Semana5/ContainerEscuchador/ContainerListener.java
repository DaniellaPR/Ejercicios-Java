/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package containerEscuchador;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ContainerListen{

    //Método principal que configura la interfaz de usuario
    public static void setupUI(JFrame frame) {
        //Crea un contenedor panel principal
        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS)); //distribución en la columna

        //Pone un ContainerListener para escuchar cambios en el contenedor
        contentPanel.addContainerListener(new java.awt.event.ContainerListener() {
            @Override
            public void componentAdded(ContainerEvent e) {
                //Cuando se añade un componente
                System.out.println("+ Se anadio un componente: " + e.getChild().getClass().getSimpleName());
            }

            @Override
            public void componentRemoved(ContainerEvent e) {
                //Cuando se elimina un componente
                System.out.println("- Se elimino un componente: " + e.getChild().getClass().getSimpleName());
            }
        });

        //Crea un botón que añade un nuevo panel
        JButton btnAddPanel = new JButton("Añadir Panel");
        btnAddPanel.addActionListener(e -> {
            JPanel newPanel = new JPanel();
            newPanel.setBorder(BorderFactory.createTitledBorder("Nuevo Panel"));
            contentPanel.add(newPanel);
            contentPanel.revalidate();
            contentPanel.repaint();
        });

        //Crea un botón que añade una nueva etiqueta
        JButton btnAddLabel = new JButton("Añadir Etiqueta");
        btnAddLabel.addActionListener(e -> {
            JLabel newLabel = new JLabel("Etiqueta " + (contentPanel.getComponentCount() + 1));
            contentPanel.add(newLabel);
            contentPanel.revalidate();
            contentPanel.repaint();
        });

        //Crea un botón que elimina el último panel o etiqueta añadido
        JButton btnRemoveComponent = new JButton("Eliminar Componente");
        btnRemoveComponent.addActionListener(e -> {
            int total = contentPanel.getComponentCount();
            if (total > 0) {
                contentPanel.remove(total - 1); //Elimina el último componente añadido
                contentPanel.revalidate();
                contentPanel.repaint();
            }
        });

        //Hace un panel para los botones
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(btnAddPanel);
        buttonPanel.add(btnAddLabel);
        buttonPanel.add(btnRemoveComponent);

        //Pone los paneles en la ventana principal
        frame.add(buttonPanel, BorderLayout.NORTH);  //Panel de botones en la parte superior
        frame.add(contentPanel, BorderLayout.CENTER);  //Panel donde se añaden/eliminas los paneles y etiquetas

    }
}
