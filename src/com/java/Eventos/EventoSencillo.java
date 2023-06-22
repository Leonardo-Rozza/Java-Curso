package com.java.Eventos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventoSencillo {
    public static void main(String[] args) {
        MarcosBotonesColores marcosBotonesColores = new MarcosBotonesColores();
        marcosBotonesColores.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}


class MarcosBotonesColores extends JFrame {
    public MarcosBotonesColores(){
        setTitle("Botones y colores");
        setBounds(700, 300, 500,300);
        LaminaBotonesColores laminaBotonesColores = new LaminaBotonesColores();
        add(laminaBotonesColores);
        setVisible(true);
    }
}

class LaminaBotonesColores extends JPanel implements ActionListener {

    JButton botonAzul = new JButton("Azul");
    JButton botonAmarillo = new JButton("Amarillo");
    JButton botonRojo = new JButton("Rojo");

    public LaminaBotonesColores(){
        add(botonAzul);
        add(botonAmarillo);
        add(botonRojo);
        botonAzul.addActionListener(this);
        botonAmarillo.addActionListener(this);
        botonRojo.addActionListener(this);
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object botonPulsado = e.getSource();
        if (botonPulsado == botonAzul) setBackground(Color.BLUE);
        if (botonPulsado == botonAmarillo) setBackground(Color.YELLOW);
        if (botonPulsado == botonRojo ) setBackground(Color.RED);
    }
}