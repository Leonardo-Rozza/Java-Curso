package com.java.InterfacesGraficas;

import javax.swing.*;
import java.awt.*;

public class LetrasEnLocal {
    public static void main(String[] args) {
//        String [] misFuentes = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
//
//        for (String fuente: misFuentes) {
//            System.out.println(fuente);
//        }
        Marco marco = new Marco();
    }
}

class Marco extends JFrame{
    public Marco(){
        setBounds(400, 200, 500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Ejercicio 2");
        Lamina lamina = new Lamina();
        add(lamina);
        setVisible(true);
    }
}

class Lamina extends JPanel{

    public Lamina(){
        mensaje = JOptionPane.showInputDialog("Ingresa el mensaje que quieres mostrar");
        fuente = JOptionPane.showInputDialog("Ingresa la fuente que queres usar");
        misFuentes = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        letraPresente = false;
        Font letra = new Font("Arial", Font.PLAIN, 18);
        for (String fuentes:misFuentes) {
            if (fuentes.equals(fuente)){
                letraPresente = true;
                break;
            }
        }
        if (letraPresente) {
            letra = new Font(fuente, Font.PLAIN, 18);
        } else {
            JOptionPane.showMessageDialog(null, "La fuente no existe");
        }
        setFont(letra);
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g; //Hacemos el casting para poder usar Graphics 2D
        g2.drawString(mensaje, 100, 50);
    }

    private String mensaje;
    private String fuente;
    private boolean letraPresente;
    private String [] misFuentes;
}