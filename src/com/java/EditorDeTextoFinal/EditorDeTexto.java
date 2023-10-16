package com.java.EditorDeTextoFinal;

import javax.swing.*;
import javax.swing.text.BadLocationException;
import javax.swing.text.StyledEditorKit;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EditorDeTexto {
    public static void main(String[] args) throws BadLocationException {
        marcoEditorDeTexto marcoEditorDeTexto = new marcoEditorDeTexto();
        marcoEditorDeTexto.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class marcoEditorDeTexto extends JFrame{
    marcoEditorDeTexto() throws BadLocationException {
        setBounds(700,300,700,400);
        add(new laminaMenu());
        setVisible(true);
    }
}

class laminaMenu extends JPanel{
    laminaMenu(){
        setLayout(new BorderLayout());

        //Creamos la barra
        JMenuBar barraMenu = new JMenuBar();

        JPanel laminaMenu2 = new JPanel();

        //Elementos del Menu
        fuente = new JMenu("Fuente");
        estilo = new JMenu("Estilo");
        tamanio = new JMenu("Tamaño");

        //Añadimos los elementos de la fuente.
        configuraMenu("Arial", "fuente","Arial", 1, 15);
        configuraMenu("Verdana", "fuente","Verdana", 1, 15);
        configuraMenu("Courier", "fuente","Courier", 1, 15);

        //Añadimos los elementos de los Estilos.
        configuraMenu("Negrita", "estilo","", Font.BOLD, 1);
        configuraMenu("Cursiva", "estilo","", Font.ITALIC, 1);

        //Añadimos los elementos de los tamaños.
        configuraMenu("12", "tamaño","", 1, 12);
        configuraMenu("16", "tamaño","", 1, 16);
        configuraMenu("20", "tamaño","", 1, 20);
        configuraMenu("24", "tamaño","", 1, 24);


        //Añadimos los elementos del menu a la barra.
        barraMenu.add(fuente);
        barraMenu.add(estilo);
        barraMenu.add(tamanio);


        //Añadimos la barra a la lámina
        laminaMenu2.add(barraMenu);
        add(laminaMenu2, BorderLayout.NORTH);
        //Creamos el area de Texto con JtexPane
        miAreaTexto = new JTextPane();
        add(miAreaTexto, BorderLayout.CENTER);
    }

    public void configuraMenu(String rotulo,String menu, String tipoLetra, int estilos, int tamanios){
        JMenuItem itemMenu = new JMenuItem(rotulo);
        if (menu == "fuente") {
            fuente.add(itemMenu);
            itemMenu.addActionListener(new StyledEditorKit.FontFamilyAction("cambiaLetra", tipoLetra));
        }
        else if (menu == "estilo") {
            estilo.add(itemMenu);
            if (estilos == Font.BOLD) itemMenu.addActionListener(new StyledEditorKit.BoldAction());
            if (estilos == Font.ITALIC) itemMenu.addActionListener(new StyledEditorKit.ItalicAction());
        }
        else if (menu == "tamaño") {
            tamanio.add(itemMenu);
            itemMenu.addActionListener(new StyledEditorKit.FontSizeAction("cambiaTamanio", tamanios));

        }

      //  itemMenu.addActionListener(new GestionaEventos(rotulo, tipoLetra, estilos, tamanios));
    }
/*
    private class GestionaEventos implements ActionListener{

        public GestionaEventos(String rotulo, String tipoLetra, int estilos, int tamanios) {
            this.tipoLetra = tipoLetra;
            this.rotulo = rotulo;
            this.tamanios = tamanios;
            this.estilos = estilos;
        }

        @Override
        public void actionPerformed(ActionEvent e) {

            letraExistente = miAreaTexto.getFont();

            if (rotulo == "Italica" || rotulo == "Courier" || rotulo == "Verdana"){
                    estilos = letraExistente.getStyle();
                    tamanios = letraExistente.getSize();
            } else if (rotulo == "Negrita" || rotulo == "Cursiva"){
                if (letraExistente.getStyle() == Font.BOLD || letraExistente.getStyle() == Font.ITALIC) estilos = 3;
                    tipoLetra = letraExistente.getFontName();
                    tamanios = letraExistente.getSize();
            } else if (rotulo == "12" || rotulo == "16" || rotulo == "20" || rotulo == "24") {
                    tipoLetra = letraExistente.getFontName();
                    estilos = letraExistente.getStyle();
            }

            miAreaTexto.setFont(new Font(tipoLetra, estilos, tamanios));

        }

        String rotulo, tipoLetra;
        int estilos, tamanios;
    }

 */

    JTextPane miAreaTexto;
    JMenu fuente, estilo, tamanio;
    Font letraExistente;
}

