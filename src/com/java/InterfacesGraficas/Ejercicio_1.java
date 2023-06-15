package com.java.InterfacesGraficas;

import javax.swing.*;

public class Ejercicio_1 {
    public static void main(String[] args) {
        MisVentanas ventana1 = new MisVentanas("Miventana1",300,300, 500, 350);
        MisVentanas ventana2 = new MisVentanas("Miventana2",500,450,500, 350);
        MisVentanas ventana3 = new MisVentanas("Miventana3",700,600, 500, 350);
    }
}

class MisVentanas extends JFrame {
    public MisVentanas(String titulo, int x, int y, int width, int height){
        setTitle(titulo);
        setBounds(x, y, width, height);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
}
