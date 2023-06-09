package com.java.poo;

import java.util.GregorianCalendar;

public class  UsoEmpleados {

    public static void main(String[] args) {
//        Empleados Antonio = new Empleados("Antonio", 200, 2014, 10, 8);
        Jefes Ana = new Jefes("Ana", 500, 2014, 9, 8);
        Ana.setIncentivo(200);
//        System.out.println(Ana.getDatosEmpleado());
//        System.out.println(Antonio.getDatosEmpleado());
//        Ana.setIncentivo(200);
//        System.out.println(Ana.getSueldo());

        Empleados[] losEmpleados = new Empleados[6];
        losEmpleados[0] = new Empleados("Antonio", 200, 2014, 10, 12);
        losEmpleados[1] = new Empleados("Marcos", 2000, 2014, 8, 23);
        losEmpleados[2] = new Empleados("Lucy", 3050, 2014, 3, 8);
           losEmpleados[3] = new Empleados("Mimi", 7560, 2014, 11, 16);
        losEmpleados[4] = Ana; //Se puede realizar esta insercion gracias al Principio de Sustitucion, un jefe ES UN empleado.

        losEmpleados[5] = new Jefes("Isabel", 5000, 2019, 2, 10);
        //Para usar los métodos exclusivos de tipo Jefe en isabel que se encuentra en el array, hay que realizar un casting EXPLICITO.
        Jefes Isabel = (Jefes) losEmpleados[5];
        //Ahora si se pueden acceder a los métodos del mismo.
        Isabel.setIncentivo(2000);

        for (Empleados obj: losEmpleados) {
            System.out.println(obj.getDatosEmpleado() +" y tiene un salario de: € " + obj.getSueldo());
        }

        //Casting de objetos
        //Casting EXPLICITO.
        Empleados Patricia = new Jefes("Patricia", 2000, 2023, 6, 4);
        Jefes Patri = (Jefes) Patricia;
    }
}

class Empleados{
    public Empleados(String nombre, double sueldo, int agno, int mes, int dia){
        this.nombre = nombre;
        this.sueldo = sueldo;
        calendario = new GregorianCalendar(agno, mes, dia);
        id = siguienteId;
        siguienteId ++;
    }
    public String getDatosEmpleado() {
        return "El empleado " + nombre + ", tiene el ID de " + id;
    }

    public double getSueldo() {
        return sueldo;
    }

    public GregorianCalendar getFechaAlta() {
        return calendario;
    }

    public void setSubeSueldo(double porcentaje){
        double aumento = (sueldo * porcentaje) / 100 + sueldo;
    }

    public static String getIdSiguiente(){
        return "El id siguiente es: " + siguienteId;
    }

    private final String nombre;
    private double sueldo;

    GregorianCalendar calendario;
    private int id;
    private static int siguienteId = 1;
}

class Jefes extends Empleados{
    public Jefes(String nombre, double sueldo, int agno, int mes, int dia) {
        super(nombre, sueldo, agno, mes, dia);
    }
    public void setIncentivo(double incentivo){
        this.incentivo = incentivo;
    }

    public double getSueldo(){
        return super.getSueldo() + incentivo;
    }

    private double incentivo;
}