package com.java.InterfacesGraficas;

import javax.swing.*;
import java.awt.*;

public class EscribiendoEnMarco {
    public static void main(String[] args) {
        MarcoTexto miMarco = new MarcoTexto();
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoTexto extends JFrame{
    public MarcoTexto(){
        setBounds(400, 200, 600, 450);
        setTitle("Escritura en JFrame");

       //PrimerPanel miLamina = new PrimerPanel(); //Creamos una instancia de tipo JPanel.
        // add(miLamina); //Agregamos la lámina del tipo JPanel al marco.

        add(new JPanel(){
            public void paintComponent(Graphics g) {
                super.paintComponent(g);

//                Color miColor = new Color(255, 100, 190);
//                g.setColor(miColor);

                //Otra forma de hacerlo.
                g.setColor(new Color(0,100,200));

                //Font miFuente = new Font("Helvetica", Font.BOLD, 20);
                //g.setFont(miFuente);

                //Lo mismo se puede hacer con la fuente.
                g.setFont(new Font("Verdana", Font.BOLD, 20));

                //Colocamos un color de fondo al JPane.
                setBackground(new Color(6, 69, 6));

                g.drawString("Hola mundo desde el primer Panel", 150, 100);


            }});

        setVisible(true);
    }
}
//
//class PrimerPanel extends JPanel{
//    public void paintComponent(Graphics g){
//        super.paintComponent(g);
//
//        Color miColor = new Color(255, 100, 190);
//        g.setColor(miColor);
//
//        Font miFuente = new Font("Helvetica", Font.BOLD, 20);
//        g.setFont(miFuente);
//
//        g.drawString("Hola mundo desde el primer Panel", 150, 100);
//    }
//}