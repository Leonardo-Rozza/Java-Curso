package com.java.Calculadora;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LaminaResultado extends JPanel {
    LaminaResultado() {
        comienzo = true;
        //Le decimos que tipo de Layout es.
        setLayout(new BorderLayout());
        pantalla = new JButton("0");
        pantalla.setEnabled(false);
        add(pantalla, BorderLayout.NORTH);

        laminaBotones = new JPanel();
        laminaBotones.setLayout(new GridLayout(4, 4));

        InsertarNumero oyente = new InsertarNumero();
        Operacion operacion = new Operacion();
        CalcularResultado calcularResultado = new CalcularResultado();

        ponerBoton("7", oyente);
        ponerBoton("8", oyente);
        ponerBoton("9", oyente);
        ponerBoton("*", operacion);
        ponerBoton("4", oyente);
        ponerBoton("5", oyente);
        ponerBoton("6", oyente);
        ponerBoton("-", operacion);
        ponerBoton("1", oyente);
        ponerBoton("2", oyente);
        ponerBoton("3", oyente);
        ponerBoton("+", operacion);
        ponerBoton("0", oyente);
        ponerBoton(",", oyente);
        ponerBoton("=", calcularResultado);
        ponerBoton("/", operacion);

        add(laminaBotones, BorderLayout.CENTER);
        }

        private void ponerBoton(String textoBoton, ActionListener oyente){
        JButton boton = new JButton(textoBoton);
        boton.addActionListener(oyente);
        laminaBotones.add(boton);
    }
    private class InsertarNumero implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String entrada = e.getActionCommand();
            if (comienzo){
                pantalla.setText(entrada);
                comienzo = false;
            } else{
                pantalla.setText(pantalla.getText() + entrada);
            }
        }
    }

    private class Operacion implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            n1 = Double.parseDouble(pantalla.getText()); //Obetenemos el 1er valor que el usuario ingreso.
            operacionPendiente = e.getActionCommand(); //Obtenemos el valor de la operacion, si es (+,-,*,/)
            comienzo = true; //Reiniciamos la pantalla, para que no se siga sobreescribiendo
        }
    }

    //Esta clase se va a implementar cuando el usuario le de al boton de "=";
    private class CalcularResultado implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (operacionPendiente != null) {   //Comporbamos que anteriormente haya seleccionado una operacion
                n2 = Double.parseDouble(pantalla.getText());  //Al numero siguiente que seleccione lo pasamos a double, y lo almacenamos en la variable n2.
                switch (operacionPendiente) {  //Hacemos las comprobaciones de lo que haya seleccionado y realizamos las operaciones.
                    case "+" -> resultado = n1 + n2;
                    case "-" -> resultado = n1 - n2;
                    case "*" -> resultado = n1 * n2;
                    case "/" -> {
                        if (n2 != 0) {
                            resultado = n1 / n2;
                        } else {
                            pantalla.setText("Error: División por cero");
                            return; // Salir del método si hay un error
                        }
                    }
                }

                pantalla.setText(Double.toString(resultado));  //Colocamos en la pantalla el resultado, pasandolo a String.
                comienzo = true;  //Limpiamos la pantalla.
                operacionPendiente = null; // Limpiar la operación pendiente
            }
        }
    }



    private JButton pantalla;
    private JPanel laminaBotones;

    private boolean comienzo;
    private double n1;
    private double n2;
    private double resultado;

    private String operacionPendiente;


}


