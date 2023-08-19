package org.example.punto10;

public class Rectanguloe extends Figura {
    private double base;
    private double altura;

    public Rectanguloe(double base, double altura) {
        super("Rectángulo");
        this.base = base;
        this.altura = altura;
    }

    public void dibujar() {
        System.out.println("Dibujando un rectángulo con base " + base + " y altura " + altura);
    }
}