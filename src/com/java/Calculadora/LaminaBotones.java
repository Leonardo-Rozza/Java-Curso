package com.java.Calculadora;

import javax.swing.*;
import java.awt.*;

public class LaminaBotones extends JFrame {
    LaminaBotones() {
        setLayout(new GridLayout(4, 4));

        JButton[] buttons = new JButton[16];
        buttons[0] = new JButton("7");
        buttons[1] = new JButton("8");
        buttons[2] = new JButton("9");
        buttons[3] = new JButton("/");
        buttons[4] = new JButton("4");
        buttons[5] = new JButton("5");
        buttons[6] = new JButton("6");
        buttons[7] = new JButton("*");
        buttons[8] = new JButton("1");
        buttons[9] = new JButton("2");
        buttons[10] = new JButton("3");
        buttons[11] = new JButton("-");
        buttons[12] = new JButton("0");
        buttons[13] = new JButton(".");
        buttons[14] = new JButton("=");
        buttons[15] = new JButton("+");

        for (JButton button : buttons) {
            add(button);
        }
    }
}
