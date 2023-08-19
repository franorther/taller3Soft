package org.example.punto3.interfaces;

public interface CuentaBancaria {
    void depositar(double monto);
    boolean retirar(double monto);
    double getSaldo();
}
