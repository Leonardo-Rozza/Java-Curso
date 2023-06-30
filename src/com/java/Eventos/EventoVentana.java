package com.java.Eventos;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class EventoVentana {
    public static void main(String[] args) {
        MarcoVentana marcoVentana = new MarcoVentana();
        marcoVentana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        marcoVentana.addWindowListener(new EventosVentanaComoTieneQueSer());
    }
}

class MarcoVentana extends JFrame{
    public MarcoVentana(){
        setBounds(600, 300, 400, 200);
        setTitle("Evento Ventana");
        setVisible(true);
    }
}

class EventosVentana implements WindowListener{

    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println("Ventana abierta");

    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println("Cerrando Ventana ");
    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("Ventana cerrada");
    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println("Ventana minimizada");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println("Ventana restaurada, luego de minimizar");
    }

    @Override
    public void windowActivated(WindowEvent e) {
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println("Ventana en 2do plano");
    }
}


//Para evitar lo que tenemos que hacer con la implementacion de la interfaz, utilizamos la clase WindowsAdapter.

class EventosVentanaComoTieneQueSer extends WindowAdapter{
    @Override
    public void windowClosed(WindowEvent e) {
        super.windowClosed(e);
        System.out.println("Chau, gracias por usar la APP!");
    }
}