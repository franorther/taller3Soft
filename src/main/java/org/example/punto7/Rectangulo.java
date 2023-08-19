package org.example.punto7;

import org.example.punto7.interfaces.Forma;

public class Rectangulo implements Forma {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea() {
        return base * altura;
    }

    public void mostrarDetalles() {
        System.out.println("Forma: Rectangulo");
        System.out.println("Base: " + base + ", Altura: " + altura);
    }
}