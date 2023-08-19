package org.example.punto5.abstractClasses;

import org.example.punto5.interfaces.Producto;

public abstract class ProductoElectronico implements Producto {
    protected String nombre;
    protected double precio;

    public ProductoElectronico(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public void mostrarDetalles() {
        System.out.println("Producto electrónico: " + nombre);
    }
}
