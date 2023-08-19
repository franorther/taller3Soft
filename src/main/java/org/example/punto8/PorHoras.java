package org.example.punto8;

public class PorHoras extends Empleado {
    private double horasTrabajadas;
    private double tarifaPorHora;

    public PorHoras(String nombre, double horasTrabajadas, double tarifaPorHora) {
        super(nombre);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }

    public double calcularSalario() {
        return horasTrabajadas * tarifaPorHora;
    }
}
