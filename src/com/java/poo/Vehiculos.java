package com.java.poo;

public class Vehiculos {
    public Vehiculos(int ruedas){ //Constructor de la clase
        this.ruedas = ruedas;
        largo = 2;
        ancho = 1;
        peso = 2;
        color = "Sin color";
    }

    public Vehiculos(int ruedas,  int largo, int ancho, int peso){ //Constructor de la clase
        this.ruedas = ruedas;
        this.ancho = ancho;
        this.largo = largo;
        this.peso = peso;
        color = "Sin color";
    }
    public void setExtra(boolean climatizador){
        this.climatizador = climatizador;
    }

    public void setExtra(boolean climatizador, boolean gps, boolean tapiceria_cuero){
        this.climatizador = climatizador;
        this.gps = gps;
        this.tapiceria_cuero = tapiceria_cuero;
    }

    public String getExtra (){
        if (climatizador && !gps && !tapiceria_cuero) return "Tu coche lleva el pack 1, tiene climatizador";
        else if (climatizador && gps && tapiceria_cuero) return "Tu coche lleva el pack 2, tiene climatizador, gps y tapiceria de cuero";
        else return "La combinación escogida de extras no se admite!";
    }
    public void setColor(String color){  //Establece valor de propiedad.
        this.color = color;
    }

    public String getColor(){  // Devuelve el valor de la propiedad.
        return "El color de tu auto es: " + color;
    }

    public String getInfo(){
        return "Tu vehiculo tiene " + ruedas + " ruedas tambien tiene un largo de " +
                + largo + " metros, un ancho de " + ancho +" metros, su peso es de " + peso
                + " kg. Su color es " + this.color;
    }

    private int ruedas;
    private String color;
    private int largo;
    private int ancho;
    private int peso;
    private boolean tapiceria_cuero;
    private boolean climatizador;
    private boolean gps;
}
