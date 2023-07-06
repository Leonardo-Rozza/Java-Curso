package com.java.Calculadora;

import javax.swing.*;
import java.awt.*;

public class MarcoCalculadora extends JFrame {
    MarcoCalculadora(){
        setBounds(450, 200, 300, 400);
        setTitle("Calculadora");
        //Agregamos la primer Lámina
        add(new LaminaResultado(), BorderLayout.NORTH);
        //Agregamos la lámina de loa botones
        add(new LaminaBotones(), BorderLayout.CENTER);
        setVisible(true);

    }
}
