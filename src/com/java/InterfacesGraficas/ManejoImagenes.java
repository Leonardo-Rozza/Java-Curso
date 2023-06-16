package com.java.InterfacesGraficas;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class ManejoImagenes {
    public static void main(String[] args) {
        MarcoImagen marcoImagen = new MarcoImagen();
    }
}

class MarcoImagen extends JFrame {
    public MarcoImagen(){
        setBounds(300, 300, 800, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        LaminaImagen lamina = new LaminaImagen();
        add(lamina);
        setVisible(true);
    }
}


class LaminaImagen extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        File miImagen = new File("src/InterfacesGraficas/corazon.jpg");
        try {
            imagen = ImageIO.read(miImagen);
        } catch (IOException e) {
            // throw new RuntimeException(e);
            System.out.println("Lo siento la imagen no sea ha encontrado. ");
        }
        g.drawImage(imagen, 100, 50, null);
    }
    private Image imagen;
}