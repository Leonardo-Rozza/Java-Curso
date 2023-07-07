package com.java.poo.abstractas;

import java.util.Arrays;
import java.util.Date;

public class UsoPersonas {
    public static void main(String[] args) {
//
//        Empleados Leo = new Empleados("Juan", new Date(55005545), 25500);
//        System.out.println(Leo.getNombre());
//        System.out.println(Leo.getDescripcion());
//
//        Empleados Ana = new Empleados("Perez", new Date(68260041), 1000000);
//        System.out.println(Ana.getNombre());
//        System.out.println(Ana.getDescripcion());
//
//        Alumnos Leonardo = new Alumnos("Leonardo", "Programacion Web", "A720");
//        System.out.println(Leonardo.getNombre());
//        System.out.println(Leonardo.getDescripcion());
//
//        Jefes Pepe = new Jefes("Pepe" , new Date(32432432), 2444);
//        Pepe.setCargo("Supervisor");
//
//        System.out.println(Pepe.getDescripcion());
//        System.out.println(Pepe.getCargo());

          Empleados losEmpleados[] = new Empleados[5];

          losEmpleados[0] = new Empleados("Perez", new Date(68260041), 2500);
          losEmpleados[1] = new Empleados("Marcelo", new Date(68260041), 2000);
          losEmpleados[2] = new Empleados("Park", new Date(68260041), 3500);
          losEmpleados[3] = new Empleados("Leo", new Date(68260041), 5000);
          losEmpleados[4] = new Empleados("Lucas", new Date(68260041), 8500);

          Arrays.sort(losEmpleados);

          for (Empleados e :losEmpleados) {
            System.out.println(e.getDescripcion());
          }
    }
}
