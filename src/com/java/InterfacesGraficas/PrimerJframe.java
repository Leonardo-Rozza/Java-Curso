package com.java.InterfacesGraficas;

import javax.swing.*;
import java.awt.*;

public class PrimerJframe {
    public static void main(String[] args) {
//        JFrame miVentana = new JFrame();
//
//        miVentana.setSize(500,200); //Generamos las dimensiones de la ventana
//        miVentana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //Informamos lo que va a realuzar el programa una vez que se cierra.
//        miVentana.setLocation(500,350); //Indicamos en que sector de la pantalla va a aparecer la ventana
//        miVentana.setVisible(true); //La funcion Visible siempre colocarla en último lugar.
        MiFrame miFrame = new MiFrame();
    }
}

class MiFrame extends JFrame{
    MiFrame(){
        setSize(500,200);
       // setLocation(500, 350);
        setLocationRelativeTo(null); //Ubicamos el Jframe en el centro, enviandole NULL como parametro.
        setBounds(500, 350, 400, 400); //Primeros 2 métodos para la ubicacion, los otros 2 para el tamaño de la ventana.
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false); //Impedimos que el usuario pueda redimensionar la ventana.
        setExtendedState(MAXIMIZED_BOTH); //Indica si la ventana va a ocupara la pantalla completa.
        setTitle("Ventana de prueba"); //Establecemos un titulo.

        //Como colocar un icono en la ventana que creamos.
        Toolkit miSistema = Toolkit.getDefaultToolkit(); //Creamos la variable objeto de tipo Toolkit.
        Image miIcono = miSistema.getImage("https://logowik.com/content/uploads/images/606_instagram.jpg"); //Creamos la variable objeto de tipo Image, donde vamos a almacenar la imagen que queremos colocar de Icono.
        setIconImage(miIcono); //Con este método de tipo IFrame colocamos la imagen en nuestra ventana.


        setVisible(true);
    }
}
