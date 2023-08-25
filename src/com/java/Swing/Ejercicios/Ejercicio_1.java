package com.java.Swing.Ejercicios;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ejercicio_1 {
    public static void main(String[] args) {
        Marco marco = new Marco();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class Marco extends JFrame{
    public Marco(){
        setBounds(400,300,600,400);
        add(new Lamina());
        setVisible(true);
    }
}


class Lamina extends JPanel{
    public Lamina(){
        cuadro = new JTextField(15);
        cuadro2 = new JTextField(15);
        add(cuadro);
        boton = new JButton("Comprobar");
        boton.addActionListener(new ComprobarEmail());
        add(cuadro2);
        add(boton);

    }

    private class ComprobarEmail implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String email = cuadro.getText();
            int contador = contadorArrobas(email);
            if (contador == 1){
                cuadro2.setText("Mail correcto");
            } else{
                cuadro2.setText("Mail incorrecto");
            }
        }

        public int contadorArrobas(String mail){
            int contador = 0;
            for (int i = 0; i < mail.length(); i++){
                if(mail.charAt(i) == '@'){
                    contador++;
                }
            }
            return contador;
        }
    }
    JTextField cuadro, cuadro2;
    JButton boton;
}