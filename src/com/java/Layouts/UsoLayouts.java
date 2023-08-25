package com.java.Layouts;

import javax.swing.*;
import java.awt.*;

public class UsoLayouts {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        MaroConLayout miMarco=new MaroConLayout();

        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        miMarco.setVisible(true);

    }

}

class MaroConLayout extends JFrame{
    public MaroConLayout(){

        setTitle("Disposiciones");

        setBounds(600,350,600,300);

        PanelConLayout lamina = new PanelConLayout();
        PanelConLayout2 lamina2 = new PanelConLayout2();

        //setLayout(new FlowLayout(FlowLayout.CENTER, 50, 100));

        add(lamina, BorderLayout.SOUTH);
        add(lamina2, BorderLayout.CENTER);
    }

}

class PanelConLayout extends JPanel{

    public PanelConLayout(){
        setLayout(new BorderLayout());

        add(new JButton("Amarillo"), BorderLayout.EAST);
        add(new JButton("Rojo"),BorderLayout.CENTER);
        add(new JButton("Azul"),BorderLayout.WEST);
    }
}

class PanelConLayout2 extends JPanel{
    PanelConLayout2(){
        setLayout(new FlowLayout(FlowLayout.CENTER));

        add(new JButton("Verde"));
        add(new JButton("Morado"));
    }
}