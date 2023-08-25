package com.java.Swing;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;

public class EventoCuadroTexto {
    public static void main(String[] args) {
        MarcoEventoCuadroTexto marco = new MarcoEventoCuadroTexto();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}


class MarcoEventoCuadroTexto extends JFrame {
    public MarcoEventoCuadroTexto(){
        setBounds(500,300,400,200);
        add(new LaminaEventoCuadroTexto());
        setVisible(true);
    }
}

class LaminaEventoCuadroTexto extends JPanel{
    public LaminaEventoCuadroTexto(){
        JTextField texto = new JTextField(20);
        Document documento = texto.getDocument();
       documento.addDocumentListener(new EscuchaTexto());
        add(texto);
    }

    private class EscuchaTexto implements DocumentListener{

        @Override
        public void insertUpdate(DocumentEvent e) {
            System.out.println("Has introducido Texto");
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            System.out.println("Has borrado Texto");
        }

        @Override
        public void changedUpdate(DocumentEvent e) {

        }
    }
}
