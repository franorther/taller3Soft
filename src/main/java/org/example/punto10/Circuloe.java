package org.example.punto10;

public class Circuloe extends Figura {
    private double radio;

    public Circuloe(double radio) {
        super("Círculo");
        this.radio = radio;
    }

    public void dibujar() {
        System.out.println("Dibujando un círculo con radio " + radio);
    }
}
