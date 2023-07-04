package com.java.Eventos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class EventosMultiples {
    public static void main(String[] args) {
        MarcoEventosMultiples marcoEventosMultiples = new MarcoEventosMultiples();
        marcoEventosMultiples.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoEventosMultiples extends JFrame {
    MarcoEventosMultiples(){
        setBounds(450, 200,400, 250);
        setTitle("Eventos Multiples");
        add(new LaminaEventosMultiples());
        setVisible(true);
    }
}

class LaminaEventosMultiples extends JPanel {
    LaminaEventosMultiples() {
//        JButton botonAzul = new JButton("Azul");
//        JButton botonRojo = new JButton("Rojo");
//        JButton botonVerde = new JButton("Verde");
//
//        add(botonAzul);
//        add(botonRojo);
//        add(botonVerde);
        EventoColorFondo colorAzul = new EventoColorFondo("azul", Color.BLUE);
        EventoColorFondo colorRojo = new EventoColorFondo("rojo", Color.RED);
        EventoColorFondo colorVerde = new EventoColorFondo("verde", Color.GREEN);

        JButton botonAzul = new JButton(colorAzul);
        JButton botonRojo = new JButton(colorRojo);
        JButton botonVerde = new JButton(colorVerde);

        add(botonAzul);
        add(botonRojo);
        add(botonVerde);

        //Creamos el mapa
        InputMap mapaEntrada = getInputMap(JPanel.WHEN_IN_FOCUSED_WINDOW);

        //La combinacion de teclas-
        KeyStroke teclaAzul = KeyStroke.getKeyStroke("ctrl A");

        //Asignamos combinaciones de tecla(KeyStroke), a un obj Descripcion(InputMap).
        mapaEntrada.put(teclaAzul, "fondo azul");

        //Asignamos el objeto descripcion recientemente creado a la Accion que debe realizar.

        //GetActionMap, nos retorna un obj de tipo AccionMap, que necesitamos para realizar nuestra asignacion.
        ActionMap mapaAccion = getActionMap();

        //Le pasamos la referencia creada en el paso 3, y el evento que va a desencadenar, anteriormente creado.
        mapaAccion.put("fondo azul", colorAzul);
    }
    private class EventoColorFondo extends AbstractAction{

        public EventoColorFondo(String nombre, Color color_fondo) {
            putValue(Action.NAME, nombre);
            putValue("Color", color_fondo);

        }
        @Override
        public void actionPerformed(ActionEvent e) {
            Color color = (Color) getValue("Color");
            setBackground(color);
        }
    }
}
