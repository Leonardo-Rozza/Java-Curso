package com.java.Eventos;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class EventoTeclado {
    public static void main(String[] args) {
        MarcoVentanaTeclado marcoVentanaTeclado = new MarcoVentanaTeclado();
        marcoVentanaTeclado.addKeyListener(new EventoDeTeclado());
    }
}

class MarcoVentanaTeclado extends JFrame {
    public MarcoVentanaTeclado(){
        setBounds(600, 300, 400, 200);
        setTitle("Evento Teclado");
        setVisible(true);
    }
}

class EventoDeTeclado implements KeyListener{
    @Override
    public void keyTyped(KeyEvent e) {
       // System.out.println("Has tecleado una tecla");

    }

    @Override
    public void keyPressed(KeyEvent e) {
        //System.out.println("Has pulsado la tecla " + e.getKeyCode());
        // if (e.getKeyCode()  == 83) System.out.println("Pulsate la tecla s");
        System.out.println("Has pulsado la tecla " + KeyEvent.getKeyText(e.getKeyCode()));
    }

    @Override
    public void keyReleased(KeyEvent e) {
       // System.out.println("Has soltado una tecla");

    }
}