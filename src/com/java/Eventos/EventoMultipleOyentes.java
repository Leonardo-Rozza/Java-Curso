package com.java.Eventos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventoMultipleOyentes {
    public static void main(String[] args) {
        MarcoMultiplesOyentes marco = new MarcoMultiplesOyentes();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}


class MarcoMultiplesOyentes extends JFrame {
    MarcoMultiplesOyentes(){
        setTitle("Multiples Oyentes");
        setBounds(700, 100, 300, 200);
        add(new LaminaMultiplesOyentes());
        setVisible(true);
    }
}

class LaminaMultiplesOyentes extends JPanel{
    LaminaMultiplesOyentes(){
        JButton boton_nuevo = new JButton("Nuevo");
        boton_cerrar = new JButton("Cerrar Todo");
        add(boton_nuevo);
        add(boton_cerrar);

        boton_nuevo.addActionListener(new CrearMarco());
    }

    private class CrearMarco implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            MarcoNuevo marcoNuevo = new MarcoNuevo(boton_cerrar);
            marcoNuevo.setVisible(true);
        }
    }

    JButton boton_cerrar;
}

class MarcoNuevo extends JFrame{
    MarcoNuevo(JButton boton){
        contador ++;
        setTitle("Ventana " + contador);
        setBounds(50 * contador, 50 * contador, 350, 200);
        boton.addActionListener(new CerrarTodo());
    }


    private class CerrarTodo implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            dispose();
        }
    }
    private static int contador;
}