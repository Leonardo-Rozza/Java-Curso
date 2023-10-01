package com.java.Swing;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

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

        String meses[] = {"Enero", "Febrero", "Marzo", "Abril"};
        //JSpinner control = new JSpinner(new SpinnerListModel(meses));
        JSpinner control = new JSpinner(new SpinnerNumberModel(5, 0, 20, 1));
        control.setPreferredSize(new Dimension(120,30));
        control.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                System.out.print(control.getValue());
            }
        });
        add(control);
    }
}