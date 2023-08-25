package com.java.Swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextArea {
    public static void main(String[] args) {
        MarcoTextArea marcoTextArea = new MarcoTextArea();
        marcoTextArea.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}


class MarcoTextArea extends JFrame{
    public MarcoTextArea(){
        setBounds(600,400,450,300);
        add(new LaminaTextArea());
        setVisible(true);
    }
}

class LaminaTextArea extends JPanel{
    public LaminaTextArea(){
        JTextArea textArea = new JTextArea(7,25);
        textArea.setLineWrap(true);
        JScrollPane panelArea = new JScrollPane(textArea);
        JButton botonArea = new JButton("Enviar");
        botonArea.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Lo que escribiste fue \n" + textArea.getText());
            }
        });
        add(panelArea);
        add(botonArea);
    }
}
