package com.java.Swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RadioButtons {
    public static void main(String[] args) {
        MarcoRadioButtons marcoRadioButtons = new MarcoRadioButtons();
        marcoRadioButtons.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoRadioButtons extends JFrame {
    MarcoRadioButtons(){
        setBounds(600,200,500,300);
        add(new LaminaRadioButtons());
        setVisible(true);
    }
}

class LaminaRadioButtons extends JPanel{
    LaminaRadioButtons(){
        ButtonGroup miGrupo1 = new ButtonGroup();
        boton1 = new JRadioButton("Masculino");
        boton2 = new JRadioButton("Femenino");
        boton3 = new JRadioButton("No binarie");
        boton1.addActionListener(new ManejaRadioButtons());
        miGrupo1.add(boton1);
        miGrupo1.add(boton2);
        miGrupo1.add(boton3);
        add(boton1);
        add(boton2);
        add(boton3);
    }

    private class ManejaRadioButtons implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
           // if (boton1.isSelected()){
           //     System.out.printf("Has seleccionado Maculino");
           // }
            // Otra forma de hacerlo
            if (e.getSource() == boton1){
                System.out.println("Has seleccionado Maculino");
            }
        }
    }
    private JRadioButton boton1, boton2, boton3;
}