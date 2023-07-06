package com.java.Calculadora;

import javax.swing.*;
import java.awt.*;

public class LaminaResultado extends JPanel {
    LaminaResultado() {
        //Le decimos que tipo de Layout es.
        setLayout(new BorderLayout());

        //Instanciamos la variable creada, evitamos su edicion, y le decimos donde colocarla.
        display = new JTextField();
        display.setEditable(false);
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setBounds(10, 30, 0, 10);

        //Agregamos el display a la lámina, en el norte, la parte superior.
        add(display, BorderLayout.NORTH);
    }
    JTextField display;
}
