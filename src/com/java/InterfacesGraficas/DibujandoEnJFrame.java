package com.java.InterfacesGraficas;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;

public class DibujandoEnJFrame {
    public static void main(String[] args) {
        MarcoDibujo Marco = new MarcoDibujo();
    }
}

class MarcoDibujo extends JFrame{
    public MarcoDibujo(){
        setBounds(200, 200, 600, 300);
        setTitle("Dibujanding...");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        LaminaDibujo Panel = new LaminaDibujo();
        add(Panel);
        setVisible(true);
    }
}

class LaminaDibujo extends JPanel{
    LaminaDibujo(){
        setBackground(new Color(22,20,220));
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(new Color(200,200,0));
        g.setFont(new Font("Helvetica", Font.BOLD, 10));
        g.drawString("hola!", 220, 30);
//        g.drawRect(20, 20, 125, 75);  //Se crea un rectangulo
//        g.drawLine(20, 20, 145, 95 ); //Se crea una linea
//        g.fillRect(20, 150, 125, 75); //Se crea un rectangulo pero con relleno.
        Graphics2D g2 = (Graphics2D) g;
        Rectangle2D rectangulo = new Rectangle2D.Double(100, 100, 200, 150);
        g2.setPaint(new Color(150,100,0));
        BasicStroke miLapiz = new BasicStroke(4);
        g2.setStroke(miLapiz);
        g2.draw(rectangulo);
        g2.fill(rectangulo);
        Font miLetra = new Font("Courier New", Font.ITALIC, 20);
        g2.setFont(miLetra);
        g2.drawString("Hola, desde el graphis 2", 100, 80);
    }
}