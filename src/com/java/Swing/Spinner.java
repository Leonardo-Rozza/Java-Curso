package com.java.Swing;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Spinner {
    public static void main(String[] args) {
        marcoJSpinner marcoJSpinner = new marcoJSpinner();
        marcoJSpinner.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}


class marcoJSpinner extends JFrame{
    marcoJSpinner(){
        setBounds(600,300,600,350);
        add(new laminaJSpinner());
        setVisible(true);
    }
}

class laminaJSpinner extends JPanel{
    laminaJSpinner(){
        JSpinner control = new JSpinner();
        control.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                System.out.print(control.getValue());
            }
        });
        add(control);
    }
}