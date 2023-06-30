package com.java.Eventos;

import javax.swing.*;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.awt.event.InputEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class EventoMouse {
    public static void main(String[] args) {
        MarcoRaton marcoRaton = new MarcoRaton();
        marcoRaton.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marcoRaton.addMouseListener(new EventosRatonExtens());
        marcoRaton.addMouseMotionListener(new EventosRatonExtens());
    }
}


class MarcoRaton extends JFrame{
    MarcoRaton(){
        setBounds(200, 200, 300, 200);
        setTitle("Eventos Mouse");
        setVisible(true);
    }
}
class EventosDeRaton implements MouseListener {

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Has echo Click");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("Has presionado");

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("Has soltado");

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("Has entrado");

    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("Has salido");

    }
}

class EventosRatonExtens extends MouseAdapter{
    @Override
    public void mousePressed(MouseEvent e) {
//        System.out.println("X = " + e.getX());
//        System.out.println("Y = " + e.getY());
        //System.out.println(e.getModifiersEx());
        if (e.getModifiersEx() == InputEvent.BUTTON1_DOWN_MASK) System.out.println("Has pulsado el boton izquierdo");
        if (e.getModifiersEx() == InputEvent.BUTTON3_DOWN_MASK) System.out.println("Has pulsado el boton derecho");
        if (e.getModifiersEx() == 0) System.out.println("Has pulsado el la rueda");
    }


    //Estamos usando los 2 Métodos de la interfaz MouseMotionListener.
    @Override
    public void mouseDragged(MouseEvent e) {
        System.out.println("Te estas arrastrando dentro del marco");
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        System.out.println("Estas moviendo dentro del marco");
    }
}