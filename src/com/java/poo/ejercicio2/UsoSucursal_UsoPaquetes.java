package com.java.poo.ejercicio2;
//
//import javax.swing.*;
//
//public class UsoSucursal_UsoPaquetes {
//    public static void main(String[] args) {
//        String ciudad = JOptionPane.showInputDialog("Ingrese la cuidad de su sucursal");
//        int numeroSucursal = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de su sucursal"));
//        String direccion = JOptionPane.showInputDialog("Ingrese la direccion de su sucursal");
//        int numeroPaquetes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de paquetes a enviar"));
//
//        Sucursal sucursal1 = new Sucursal(ciudad, numeroSucursal, direccion);
//        Paquete paquete1 = null;
//
//        for (int i = 0; i <= numeroPaquetes; i++) {
//            int referenciaEnvio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de la referencia de envio"));
//            int dni = Integer.parseInt(JOptionPane.showInputDialog("Ingrese  su dni"));
//            int peso = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el peso del paquete"));
//            int prioridad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la prioridad del envio: (0, 1 o 2 siendo estos 0=normal, 1=Alta y 2=Urgente)"));
//
//            paquete1 = new Paquete(referenciaEnvio, peso, dni, prioridad);
//
//        }
//
//        assert paquete1 != null;
//
//
//        System.out.println(sucursal1.getDireccion());
//        System.out.println(sucursal1.getNumeroSucursal());
//        System.out.println(sucursal1.getCiudad());
//
//
//        System.out.println(paquete1.getPeso());
//        System.out.println(paquete1.getPrioridad());
//        System.out.println(paquete1.getReferenciaEnvio());
//        System.out.println("El precio de tu paquete es: " + sucursal1.precioPaquete(paquete1));
//    }
//}


import java.util.Scanner;

public class UsoSucursal_UsoPaquetes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Número de sucursal: ");
        int numeroSucursal = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        System.out.print("Dirección: ");
        String direccion = scanner.nextLine();

        System.out.print("Ciudad: ");
        String ciudad = scanner.nextLine();

        System.out.print("Número de paquetes a enviar: ");
        int numPaquetes = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        Sucursal sucursal = new Sucursal(numeroSucursal, direccion, ciudad);

        for (int i = 0; i < numPaquetes; i++) {
            System.out.println("\nDatos del paquete " + (i + 1) + ":");

            System.out.print("Referencia del envío: ");
            String referenciaEnvio = scanner.nextLine();

            System.out.print("DNI del remitente: ");
            String dniRemitente = scanner.nextLine();

            System.out.print("Peso del paquete: ");
            double peso = scanner.nextDouble();
            scanner.nextLine(); // Consumir el salto de línea

            System.out.print("Prioridad del envío (0=Normal, 1=Alta, 2=Urgente): ");
            int prioridad = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            Paquete paquete = new Paquete(referenciaEnvio, peso, dniRemitente, prioridad);
            sucursal.calcularPrecio(paquete);

            System.out.println("\nDatos del paquete " + (i + 1) + ":");
            System.out.println("Referencia del envío: " + paquete.getReferenciaEnvio());
            System.out.println("Peso del paquete: " + paquete.getPeso());
            System.out.println("Prioridad del envío: " + paquete.getPrioridad());
            System.out.println("Precio: " + paquete.getPrecio());
        }

        System.out.println("\nDatos de la sucursal:");
        System.out.println("Número de sucursal: " + sucursal.getNumeroSucursal());
        System.out.println("Dirección: " + sucursal.getDireccion());
        System.out.println("Ciudad: " + sucursal.getCiudad());
    }
}

