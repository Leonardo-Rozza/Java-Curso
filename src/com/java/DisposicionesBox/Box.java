package com.java.DisposicionesBox;

import javax.swing.*;

public class Box {
    public static void main(String[] args) {
        MarcoBox marcoBox = new MarcoBox();
        marcoBox.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marcoBox.setVisible(true);
    }
}

class MarcoBox extends JFrame{
    MarcoBox(){
        setTitle("Practica con Box");
        setBounds(600,350,500,350);

        //Primer Box
        JLabel user = new JLabel("Nombre");
        JTextField textUser = new JTextField(10);
        textUser.setMaximumSize(textUser.getPreferredSize());
        javax.swing.Box boxUser = javax.swing.Box.createHorizontalBox();

        boxUser.add(user);
        boxUser.add(javax.swing.Box.createHorizontalStrut(4));
        boxUser.add(textUser);

        //Segundo Box
        JLabel password = new JLabel("Contraseña");
        JTextField textPass = new JTextField(10);
        textPass.setMaximumSize(textPass.getPreferredSize());
        javax.swing.Box boxPass = javax.swing.Box.createHorizontalBox();

        boxPass.add(password);
        boxPass.add(javax.swing.Box.createHorizontalStrut(4));
        boxPass.add(textPass);

        //Tercer Box
        JButton boton1 = new JButton("OK");
        JButton boton2 = new JButton("Cancelar");
        javax.swing.Box boxButton = javax.swing.Box.createHorizontalBox();
        boxButton.add(boton1);
        boxButton.add(javax.swing.Box.createGlue());
        boxButton.add(boton2);

        //Caja Vertical contenedora
        javax.swing.Box verticalBox = javax.swing.Box.createVerticalBox();

        verticalBox.add(boxUser);
        verticalBox.add(boxPass);
        verticalBox.add(boxButton);

        add(verticalBox);
    }
}