package com.java.poo.ejercicio1;

import com.java.poo.ejercicio1.CuentasCorrientes;

public class UsoCuentasCorrientes {
    public static void main(String[] args) {
        CuentasCorrientes cuenta1 = new CuentasCorrientes("Leonardo", 612);
        CuentasCorrientes cuenta2 = new CuentasCorrientes("Marisol", 600);

        cuenta1.transferencia(cuenta1, cuenta2, 200);

        System.out.println(cuenta1.getInfoCuenta());
        System.out.println(cuenta2.getInfoCuenta());

    }
}
