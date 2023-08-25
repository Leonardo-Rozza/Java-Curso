package com.java.Swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ManejoCuadroTexto {
    public static void main(String[] args) {
        MarcoManejoCuadroTexto miMarco = new MarcoManejoCuadroTexto();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoManejoCuadroTexto extends JFrame {
    public MarcoManejoCuadroTexto(){
        setBounds(600, 300, 600, 400);
        add(new LaminaManejoCuadroTexto());
        setVisible(true);
    }
}

class LaminaManejoCuadroTexto extends JPanel{
    public LaminaManejoCuadroTexto(){
        cuadroTexto = new JTextField(20);
        cuadroTexto2 = new JTextField(20);
        add(cuadroTexto);
        add(cuadroTexto2);

        JButton boton = new JButton("Nuevo texto");
        boton.addActionListener(new ObtenerTexto());
        add(boton);
    }

    private class ObtenerTexto implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            cuadroTexto2.setText(cuadroTexto.getText());
        }
    }
    private JTextField cuadroTexto,cuadroTexto2;;
}