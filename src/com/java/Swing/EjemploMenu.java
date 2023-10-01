package com.java.Swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EjemploMenu {
    public static void main(String[] args) {
        MarcoMenu marcoMenu = new MarcoMenu();
        marcoMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}


class MarcoMenu extends JFrame{
    MarcoMenu(){
        setBounds(500,250,600,350);
        add(new LaminaMenu());
        setVisible(true);
    }
}

class LaminaMenu extends JPanel{
    LaminaMenu(){
        JMenuBar miBarra = new JMenuBar();

        //Elementos del menú
        JMenu archivo = new JMenu("Archivo");
        JMenu edicion = new JMenu("Edicion");
        JMenu herramientas = new JMenu("Herramientas");

        //Agregamos a la barra los elementos del menú
        miBarra.add(archivo);
        miBarra.add(edicion);
        miBarra.add(herramientas);

        //Aqui iran los elementos de Archivos.
        JMenuItem guardar = new JMenuItem("Guardar");
        JMenuItem guardarComo = new JMenuItem("Guardar como");

        guardarComo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Has seleccionado el GUARDAR COMO");
            }
        });

        archivo.add(guardar);
        archivo.add(guardarComo);


        //Aqui iran los elementos de Edición.
        JMenuItem copiar = new JMenuItem("Copiar");
        JMenuItem pegar = new JMenuItem("Cortar");
        JMenuItem cortar = new JMenuItem("Pegar");

        edicion.add(copiar);
        edicion.add(cortar);
        edicion.add(pegar);


        //Aqui iran los elementos de Herramientas.
        JMenuItem opciones = new JMenuItem("Opciones");
        JMenu preferencias = new JMenu("Preferencias");

        herramientas.add(opciones);
        herramientas.addSeparator();  //Linea separadora
        herramientas.add(preferencias);

        //Items de preferencias
        JMenuItem generales = new JMenuItem("Generales");
        JMenuItem ayuda = new JMenuItem("Ayuda");
        preferencias.add(generales);
        preferencias.add(ayuda);


        //Agregamos la barra a la lámina.
        add(miBarra);
    }

}