package com.sebasth.gestortareas.principal;

/*
importamos las librerias que usaremos
*/
import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        /*
        creamos la vista principal la libreria JFrame que importamos al proyecto
        */
        JFrame frame = new JFrame("Gestor de Tareas");

        /*
        declaramos un contenedor JPanel como una variable llamada panel que va a ser un nuevo Jpanel,
        le damos a nuestro panel declarado una alineacion centrada y espaciada
         */
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10)); /*Layout con alineación centrada y espaciado*/

        /*
        creamos controladores un label y boton
        */
        JLabel saludoLabel = new JLabel("¡Bienvenido!");
        JButton iniciarButton = new JButton("Comenzar");

        /*
        agregamos los controladores a al contenedor usando "panel.add(saludoLabel)"
         */
        panel.add(saludoLabel);
        panel.add(iniciarButton);

        /*
        usamos la funcion frame.getcontendpane().add(panel) para poder añadir el panel a la vista principal
         */
        frame.getContentPane().add(panel);

        /*
        configuramos los detalles para poder dar salida a la vista
         */
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)

        /*
         damos tamaño a la vista de la pestaña
         */;
        frame.setSize(300, 200);

        /*
        centramos la  pestaña dando un valor null para que no este estatica en un solo lugar
         */
        frame.setLocationRelativeTo(null);

        /*
        hacemos la pestaña visible declarando frame como true
         */
        frame.setVisible(true);
    }
}