package com.java.poo.ejercicio2;
//
//public class Paquete {
//    Paquete(int referenciaEnvio, int peso, int dni, int prioridad){
//        this.referenciaEnvio = referenciaEnvio;
//        this.peso = peso;
//        this.dni = dni;
//        this.prioridad = prioridad;
//
//    }
//
//    public void setPeso (int peso){
//        this.peso = peso;
//    }
//
//    public void setPrioridad(int prioridad){
//        this.prioridad = prioridad;
//    }
//
//    public int getPeso(){
//        return peso;
//    }
//
//    public int getPrioridad(){
//        return prioridad;
//    }
//
//    public int getReferenciaEnvio() {
//        return referenciaEnvio;
//    }
//
//    private int referenciaEnvio;
//    private int peso;
//    private int dni;
//    private int prioridad;
//
//}

class Paquete {
    private String referenciaEnvio;
    private double peso;
    private String dniRemitente;
    private int prioridad;
    private double precio;

    public Paquete(String referenciaEnvio, double peso, String dniRemitente, int prioridad) {
        this.referenciaEnvio = referenciaEnvio;
        this.peso = peso;
        this.dniRemitente = dniRemitente;
        this.prioridad = prioridad;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public double getPeso() {
        return peso;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public String getReferenciaEnvio() {
        return referenciaEnvio;
    }
}

