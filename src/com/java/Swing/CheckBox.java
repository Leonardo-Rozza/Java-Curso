package com.java.Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckBox {
    public static void main(String[] args) {
        MarcoCheckBox marco = new MarcoCheckBox();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoCheckBox extends JFrame{
    public MarcoCheckBox(){
        setBounds(400,300,450,300);
        //add(new LaminaTexto(), BorderLayout.NORTH);
        add(new LaminaCheckBox());
        setVisible(true);
    }
}

class LaminaCheckBox extends JPanel {
    public LaminaCheckBox() {
        setLayout(new BorderLayout());
         negrita = new JCheckBox("Colocar en Negrita");
         cursiva = new JCheckBox("Colocar en Cursiva");
         texto = new JLabel("Hola, soy Programador en JAVA");
         JPanel superior = new JPanel();
         JPanel inferior = new JPanel();
         superior.add(texto, BorderLayout.NORTH);
         inferior.add(negrita, BorderLayout.SOUTH);
         inferior.add(cursiva, BorderLayout.SOUTH);

         cursiva.addActionListener(new ManejaCheks());
         negrita.addActionListener(new ManejaCheks());

        add(superior,BorderLayout.NORTH);
        add(inferior,BorderLayout.SOUTH);
    }

    private class ManejaCheks implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            int negrita_cursiva = 0;
            if (negrita.isSelected()) negrita_cursiva += Font.BOLD;
            if (cursiva.isSelected()) negrita_cursiva += Font.ITALIC;

            texto.setFont(new Font("Verdana", negrita_cursiva, 14));
        }
    }

    private JLabel texto;
    private JCheckBox negrita, cursiva;
}

