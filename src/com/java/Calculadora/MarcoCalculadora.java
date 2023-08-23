package com.java.Calculadora;

import javax.swing.*;
import java.awt.*;

public class MarcoCalculadora extends JFrame {
    MarcoCalculadora(){
        setBounds(450, 200, 450, 300);
        setTitle("Calculadora");
        //Agregamos la primer Lámina
        add(new LaminaResultado());
        //Agregamos la lámina de loa botones
        setVisible(true);
    }
}
