package com.java.Eventos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class EventoFoco {
    public static void main(String[] args) {
        MarcoEventoFoco marcoEventoFoco = new MarcoEventoFoco();
        marcoEventoFoco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marcoEventoFoco.setVisible(true);
    }
}

class MarcoEventoFoco extends JFrame {
    MarcoEventoFoco(){
        setBounds(500, 300, 400, 250);
        setTitle("Evento Foco");
        add(new LaminaEventoFoco());
    }
}


class LaminaEventoFoco extends JPanel{
    private class EventoDeFoco implements FocusListener {
        @Override
        public void focusGained(FocusEvent e) {
        }
        @Override
        public void focusLost(FocusEvent e) {
            if (e.getSource() == campoTexto1){
                System.out.println("El cuadro 1 ha perdido el foco");
            } else {
                System.out.println("El cuadro 2 ha perdido el foco");
            }
        }
    }

    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        //Instanciamos las variables de tipo JTextField.
        campoTexto1 = new JTextField();
        campoTexto2 = new JTextField();

        //Le damos dimension a los campos recientemente creados
        campoTexto1.setBounds(100, 10, 120, 20);
        campoTexto2.setBounds(100, 50, 120, 20);

        //Agregamos los campos a la lámina
        add(campoTexto1);
        add(campoTexto2);

        //Creamos la variable de tipo EventoDeFoco, que contiene la interfaz FocusListener
        EventoDeFoco eventoDeFoco = new EventoDeFoco();
        //Ponemos a la escucha al campoTexto1(variable de tipo JTextField), pasandole como parámetro la variable recientemente creada.
        campoTexto1.addFocusListener(eventoDeFoco);
        campoTexto2.addFocusListener(eventoDeFoco);
    }

    //Creamos las variables de tipo JTextField
    private JTextField campoTexto1, campoTexto2;
}

