package org.example.punto5;

import org.example.punto5.abstractClasses.Ropa;

public class Camiseta extends Ropa {
    private String talla;

    public Camiseta(String talla, double precio) {
        super("Camiseta", precio);
        this.talla = talla;
    }

    public double calcularPrecio() {
        return precio;
    }

    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Talla: " + talla);
        System.out.println("Precio: $" + precio);
    }
}