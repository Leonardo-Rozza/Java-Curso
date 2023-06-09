package com.java.poo.ejercicio3;

public class CuentaCorriente {
    public CuentaCorriente(String nombreTitular, double saldo){
        this.nombreTitular = nombreTitular;
        this.saldo = saldo;
        numCuentaCorriente = (int)Math.floor(Math.random()*10000);
    }

    public void cargarSaldo (double saldo){
        this.saldo += saldo;
    }

    public void deducirSaldo(double saldo){
        if (this.saldo >= saldo) this.saldo -= saldo;
    }

    public double getSaldo(){
        return saldo;
    }

    public String getInfoCuenta(){
        return "El titular de la cuenta es: " + nombreTitular +", el numero de cuenta es: " + numCuentaCorriente + " y su saldo es: " +saldo;
    }

    public void transferencia(CuentaCorriente origen, CuentaCorriente destino, double transferencia){
        if (origen.saldo >= transferencia) {
            destino .cargarSaldo(transferencia);
            origen.deducirSaldo(transferencia);
        }
    }
    private String nombreTitular;
    private double saldo;
    private long numCuentaCorriente;
}
