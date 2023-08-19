package org.example.punto3;

import org.example.punto3.interfaces.CuentaBancaria;

public abstract class CuentaAbstracta implements CuentaBancaria {
    private double saldo;

    public CuentaAbstracta(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double monto) {
        saldo += monto;
    }

    public boolean retirar(double monto) {
        if (monto <= saldo) {
            saldo -= monto;
            return true;
        }
        return false;
    }

    public double getSaldo() {
        return saldo;
    }
}
