package com.java.poo;

public class UsoVehiculos {
    public static void main(String[] args) {
        Vehiculos miCoche = new Vehiculos(4);
        miCoche.setColor("Violeta");
        System.out.println(miCoche.getColor());

        System.out.println(miCoche.getInfo());

        Vehiculos miMoto = new Vehiculos(2, 2, 1, 200);
        miMoto.setColor("Verde");
        System.out.println(miMoto.getInfo());
    }
}
