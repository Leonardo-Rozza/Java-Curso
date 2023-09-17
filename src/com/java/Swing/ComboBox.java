package com.java.Swing;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComboBox {
    public static void main(String[] args) {
        MarcoComboBox marcoComboBox = new MarcoComboBox();
        marcoComboBox.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoComboBox extends JFrame{
    MarcoComboBox(){
        setBounds(600,400,500,300);
        add(new LaminaComboBox());
        setVisible(true);
    }
}

class LaminaComboBox extends JPanel{
    LaminaComboBox() {
        setLayout(new BorderLayout());
        texto = new JLabel("Soy programador JAVA");
        texto.setFont(new Font("Serif", Font.PLAIN, 18));
        add(texto, BorderLayout.CENTER);

        JPanel superior = new JPanel();
        fuentes = new String[4];
        fuentes[0] = "Serif";
        fuentes[1] = "Verdana";
        fuentes[2] = "Dialog";
        fuentes[3] = "Monospaced";
        miCombo = new JComboBox(fuentes);
        miCombo.addActionListener(new EventoComboFuente());
        superior.add(miCombo);
        miSlider = new JSlider(8,36,24);
        miSlider.setMajorTickSpacing(12); //Separacion de barras grandes
        miSlider.setMinorTickSpacing(2);  //Separacion de barras chicas
        miSlider.setPaintTicks(true);     //Visualizacion de la barra con las lineas.
        miSlider.setPaintLabels(true);    //Visualizamos la numeracion.
        miSlider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                texto.setFont(new Font((String) miCombo.getSelectedItem(), Font.PLAIN, miSlider.getValue()));
            }
        });
        superior.add(miSlider);
        add(superior, BorderLayout.NORTH);

    }

    private class EventoComboFuente implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            texto.setFont(new Font((String) miCombo.getSelectedItem(), Font.PLAIN, miSlider.getValue()));
        }
    }

    JLabel texto;
    JComboBox miCombo;
    JSlider miSlider;
    String[] fuentes;
}