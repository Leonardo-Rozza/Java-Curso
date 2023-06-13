package com.java.poo.abstractas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class PruebaTemporizador2 {
    public static void main(String[] args) {
        Reloj miReloj = new Reloj();

        miReloj.iniciarTemporizador(3000, true);

        JOptionPane.showMessageDialog(null, "Pulsa aceptar para terminar");
    }
}

class Reloj{
    public void iniciarTemporizador(int intervalo, boolean sonido){
//        class DameLaHora implements ActionListener{  //Clase interna en métodos.
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                Date dia_hora = new Date();
//                System.out.println("Se coloca la hora cada 3seg" + dia_hora);
//                if (sonido) Toolkit.getDefaultToolkit().beep();
//            }
//        }
//        ActionListener oyente = new DameLaHora();
        Timer miTemporizador = new Timer(intervalo, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date dia_hora = new Date();
                System.out.println("Se coloca la hora cada 3seg" + dia_hora);
                if (sonido) Toolkit.getDefaultToolkit().beep();
            }
        });
        miTemporizador.start();
    }
}
