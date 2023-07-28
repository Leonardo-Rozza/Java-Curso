package com.java.Calculadora;
import javax.swing.*;
import java.awt.*;

public class LaminaBotones extends JPanel {
    LaminaBotones() {
        setLayout(new GridLayout(4, 4));
        String[] botones = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+"
        };
        for (String button: botones) {
            JButton btn = new JButton(button);
            add(btn);
        }
    }
}
