package org.example.punto5;

import org.example.punto5.abstractClasses.ProductoElectronico;

public class Smartphone extends ProductoElectronico {
    private String modelo;

    public Smartphone(String modelo, double precio) {
        super("Smartphone " + modelo, precio);
        this.modelo = modelo;
    }

    public double calcularPrecio() {
        return precio;
    }

    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Modelo: " + modelo);
        System.out.println("Precio: $" + precio);
    }
}