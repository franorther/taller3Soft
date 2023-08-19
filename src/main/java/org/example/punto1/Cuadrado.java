package org.example.punto1;

public class Cuadrado extends FormaGeometrica{
    private double side;

    public Cuadrado(String name, double side) {
        super(name);
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }
}
