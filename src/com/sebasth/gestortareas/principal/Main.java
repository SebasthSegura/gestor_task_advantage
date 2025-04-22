package com.sebasth.gestortareas.principal;

/*
importamos las librerias que usaremos
*/
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame implements ActionListener {

    /*
    creamos controladores un label y boton
    */
    JLabel header = new JLabel("¡Bienvenido Tasku!");
    JLabel loging = new JLabel("Loging");
    JLabel usuarname = new JLabel("Ingrese su user name:");
    JLabel password = new JLabel("Contraseña:");
    JTextField username_text = new JTextField(20);
    JPasswordField password_text = new JPasswordField(20);
    JButton send = new JButton("Iniciar Sesion");

    public Main() {
        setTitle("Inicio de Sesión");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear un JPanel para organizar los componentes verticalmente
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20)); // Añadir un poco de espacio alrededor

        // Centrar los encabezados
        header.setAlignmentX(Component.CENTER_ALIGNMENT);
        loging.setAlignmentX(Component.CENTER_ALIGNMENT);

        // Añadir los componentes al panel
        panel.add(header);
        panel.add(Box.createRigidArea(new Dimension(0, 15))); // Espacio después del encabezado
        panel.add(loging);
        panel.add(Box.createRigidArea(new Dimension(0, 10))); // Espacio después de "Loging"
        panel.add(usuarname); // Añadir la etiqueta del nombre de usuario
        panel.add(Box.createRigidArea(new Dimension(0, 5))); // Espacio antes del campo de texto
        panel.add(username_text);
        panel.add(Box.createRigidArea(new Dimension(0, 15))); // Espacio entre campos
        panel.add(password); // Añadir la etiqueta de la contraseña
        panel.add(Box.createRigidArea(new Dimension(0, 5))); // Espacio antes del campo de contraseña
        panel.add(password_text);
        panel.add(Box.createRigidArea(new Dimension(0, 25))); // Espacio antes del botón
        panel.add(send);
        send.setAlignmentX(Component.CENTER_ALIGNMENT);; // Centrar el botón

        // Añadir el panel al JFrame
        add(panel);

        // Registrar el botón para escuchar eventos
        send.addActionListener(this);

        pack(); // Ajusta el tamaño de la ventana al de sus componentes
        setLocationRelativeTo(null); // Centra la ventana en la pantalla
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == send) {
            String username = username_text.getText();
            char[] passwordChars = password_text.getPassword();
            String password = new String(passwordChars); // ¡Cuidado con el manejo de contraseñas!

            // Aquí puedes agregar la lógica para verificar el usuario y la contraseña
            System.out.println("Usuario ingresado: " + username);
            System.out.println("Contraseña ingresada: " + password);

            // Limpiar el array de caracteres de la contraseña por seguridad
            java.util.Arrays.fill(passwordChars, ' ');

            // Puedes mostrar un mensaje de éxito o error aquí
            JOptionPane.showMessageDialog(this, "Intento de inicio de sesión con usuario: " + username, "Información", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Main());
    }
}