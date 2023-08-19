package org.example.punto7;

import org.example.punto7.interfaces.Forma;

public abstract class FormaGeometrica implements Forma {
    protected String nombre;

    public FormaGeometrica(String nombre) {
        this.nombre = nombre;
    }

    public void mostrarDetalles() {
        System.out.println("Forma: " + nombre);
    }
}