package com.java.poo.abstractas;

import javax.swing.*;
import java.awt.event.*;
import java.util.Date;

public class PruebaTemporizador {
    public static void main(String[] args) {

        Temporizador oyente = new Temporizador();

        Timer miTemporizador = new Timer(2000, oyente);

        miTemporizador.start();

        JOptionPane.showMessageDialog(null, "Pulsa Aceptar para terminar");
    }
}


class Temporizador implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        Date horaActual = new Date();
        System.out.println(horaActual);
    }
}
