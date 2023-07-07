package com.java.Calculadora;

import javax.swing.*;
import java.awt.*;

public class LaminaResultado extends JPanel {
    LaminaResultado() {
        //Le decimos que tipo de Layout es.
        setLayout(new BorderLayout());
        JButton pantalla = new JButton("0");
        pantalla.setEnabled(false);
        add(pantalla, BorderLayout.NORTH);
    }
}
