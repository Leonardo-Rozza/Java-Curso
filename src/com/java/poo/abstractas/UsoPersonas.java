package com.java.poo.abstractas;

import java.util.Date;

public class UsoPersonas {
    public static void main(String[] args) {

        Empleados Leo = new Empleados("Juan", new Date(55005545), 25500);
        System.out.println(Leo.getNombre());
        System.out.println(Leo.getDescripcion());

        Empleados Ana = new Empleados("Perez", new Date(68260041), 1000000);
        System.out.println(Ana.getNombre());
        System.out.println(Ana.getDescripcion());

        Alumnos Leonardo = new Alumnos("Leonardo", "Programacion Web", "A720");
        System.out.println(Leonardo.getNombre());
        System.out.println(Leonardo.getDescripcion());
    }
}
