package org.example.punto5.abstractClasses;

import org.example.punto5.interfaces.Producto;

public abstract class Ropa implements Producto {
    protected String nombre;
    protected double precio;

    public Ropa(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public void mostrarDetalles() {
        System.out.println("Ropa: " + nombre);
    }
}