package org.example.punto7;

import org.example.punto7.interfaces.Forma;

public class Circuloi implements Forma {
    private double radio;

    public Circuloi(double radio) {
        this.radio = radio;
    }

    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    public void mostrarDetalles() {
        System.out.println("Forma: Círculo");
        System.out.println("Radio: " + radio);
    }
}