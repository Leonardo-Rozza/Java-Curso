package com.java.poo.ejercicio2;
//
//import javax.swing.plaf.IconUIResource;
//
//public class Sucursal {
//
//    public Sucursal(String ciudad, int numeroSucursal, String direccion){
//        this.ciudad = ciudad;
//        this.numeroSucursal = numeroSucursal;
//        this.direccion = direccion;
//    }
//
//    public String getCiudad (){
//        return "La ciudad de tu sucursal es: " + ciudad;
//    }
//    public String getNumeroSucursal (){
//        return "El número de tu sucursal es: " + numeroSucursal;
//    }
//    public String getDireccion (){
//        return "La direccion de tu sucursal es: " + direccion;
//    }
//
//    public int precioPaquete(Paquete paquete){
//        int precio = switch (paquete.getPrioridad()) {
//            case 0 -> paquete.getPeso();
//            case 1 -> paquete.getPeso() + 10;
//            case 2 -> paquete.getPeso() + 20;
//            default -> 0;
//        };
//        return precio;
//    }
//    private int numeroSucursal;
//    private String ciudad;
//    private String direccion;
//
//}


class Sucursal {
    private int numeroSucursal;
    private String direccion;
    private String ciudad;

    public Sucursal(int numeroSucursal, String direccion, String ciudad) {
        this.numeroSucursal = numeroSucursal;
        this.direccion = direccion;
        this.ciudad = ciudad;
    }

    public int getNumeroSucursal() {
        return numeroSucursal;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void calcularPrecio(Paquete paquete) {
        double precio = paquete.getPeso();

        if (paquete.getPrioridad() == 1) {
            precio += 10;
        } else if (paquete.getPrioridad() == 2) {
            precio += 20;
        }

        paquete.setPrecio(precio);
    }
}
