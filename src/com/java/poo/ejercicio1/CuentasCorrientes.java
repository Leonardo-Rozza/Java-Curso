package com.java.poo.ejercicio1;

public class CuentasCorrientes {
    public CuentasCorrientes(String nombreTitular, double saldo){
        this.nombreTitular = nombreTitular;
        this.saldo = saldo;
        numeroCuenta = (int)Math.floor(Math.random()*1000+1);
    }

    public void setIngreso(double ingreso){
        saldo += ingreso;
    }

    public void setEgreso(double egreso){
        if (saldo > egreso){
            saldo -= egreso;
        }
    }

    public String getSaldo(){
        return "El saldo de tu cuenta corriente es de: " + saldo;
    }

    public String getInfoCuenta(){
        return "La cuenta tiene un titular llamado: "+ nombreTitular+ " su saldo actual es de " + saldo + " y el número de la cuenta es: "+ numeroCuenta;
    }

    public String transferencia(CuentasCorrientes cuenta,CuentasCorrientes cuenta2, double transferencia){
        if (cuenta.saldo > transferencia) {
            cuenta2.setIngreso(transferencia);
            cuenta.setEgreso(transferencia);
            return "La transferencia se realizo con éxito!";
        } else {
            return "No dispones de la cantidad suficiente para transferir";
        }
    }

    private double saldo;
    private String nombreTitular;
    private long numeroCuenta;
}
