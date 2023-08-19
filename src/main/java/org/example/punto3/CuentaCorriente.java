package org.example.punto3;

public class CuentaCorriente extends CuentaAbstracta {
    private double limiteCredito;

    public CuentaCorriente(double saldoInicial, double limiteCredito) {
        super(saldoInicial);
        this.limiteCredito = limiteCredito;
    }

    @Override
    public boolean retirar(double monto) {
        if (monto <= getSaldo() + limiteCredito) {
            return super.retirar(monto);
        }
        return false;
    }
}