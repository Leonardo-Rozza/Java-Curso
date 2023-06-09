package com.java.poo.abstractas;

import java.util.Date;

public abstract class Personas {

    public Personas(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    public abstract String getDescripcion();
    private String nombre;
}

class Empleados extends Personas{
    public Empleados (String nombre, Date fechaAlta, double sueldo){
        super(nombre);
        this.fechaAlta = fechaAlta;
        this.sueldo = sueldo;
    }

    @Override
    public String getDescripcion() {
        return "El empleado " + this.getNombre() + " tiene un sueldo de: " + sueldo + " y su fecha de ingreso es: " + fechaAlta;
    }

    private double sueldo;
    private Date fechaAlta;
}

class Jefes extends Empleados{

    public Jefes(String nombre, Date fechaAlta, double sueldo) {
        super(nombre, fechaAlta, sueldo);
    }

    public  void  setIncentivo(double incentivo){
        this.incentivo = incentivo;
    }

    private double incentivo;
}

class Alumnos extends Personas{
    public Alumnos(String nombre, String asignatura, String aula){
        super(nombre);
        this.asignatura = asignatura;
        this.aula = aula;
    }
    public String getDescripcion(){
        return "El alumno " + this.getNombre() + " se encuentra cusando la asignatura de " + asignatura + " en el aula " + aula;
    }

    private String asignatura;
    private String aula;
}