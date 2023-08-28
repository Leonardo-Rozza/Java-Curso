package com.java.Swing.Ejercicios;

import javax.swing.*;
import java.awt.*;

public class EjercicioIntegradorBasico {
    public static void main(String[] args) {
        MarcoEjercicio2 ejercicio2 = new MarcoEjercicio2();
        ejercicio2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoEjercicio2 extends JFrame{
    MarcoEjercicio2(){
        setBounds(600,300,600,350);
        add(new LaminaEjercicio2());
        setVisible(true);
    }
}

class LaminaEjercicio2 extends JPanel{
    LaminaEjercicio2(){
        setLayout(new BorderLayout());

        JPanel superior = new JPanel();
        JPanel centro = new JPanel();
        JPanel inferior = new JPanel();

        //Superior
        nombre = new Label("Nombre:");
        apellido = new Label("Apellido:");
        name = new JTextField(15);
        lastName = new JTextField(15);
        superior.add(nombre);
        superior.add(name);
        superior.add(apellido);
        superior.add(lastName);
        add(superior, BorderLayout.NORTH);

        //Centro
        textArea = new JTextArea(12,30);
        textArea.setLineWrap(true);
        JScrollPane scrollPane = new JScrollPane(textArea);
        centro.add(scrollPane);
        add(centro, BorderLayout.CENTER);

        //Inferior
        casilla1 = new JCheckBox("Casilla 1");
        casilla2 = new JCheckBox("Casilla 2");
        radio1 = new JRadioButton("Radio 1");
        radio2 = new JRadioButton("Radio 2");
        boton1 = new JButton("Boton 1");
        boton2 = new JButton("Boton 2");

        inferior.add(boton1, BorderLayout.EAST);
        inferior.add(boton2, BorderLayout.EAST);
        inferior.add(casilla1, BorderLayout.CENTER);
        inferior.add(casilla2, BorderLayout.CENTER);
        inferior.add(radio1, BorderLayout.WEST);
        inferior.add(radio2, BorderLayout.WEST);
        add(inferior, BorderLayout.SOUTH);
    }

    private Label nombre, apellido;
    private JTextField name, lastName;
    private JTextArea textArea;
    private JCheckBox casilla1, casilla2;
    private JRadioButton radio1, radio2;
    private JButton boton1, boton2;
}
