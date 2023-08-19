package org.example.punto10;

import org.example.punto10.interfaces.Dibujable;

public abstract class Figura implements Dibujable {
    protected String tipo;

    public Figura(String tipo) {
        this.tipo = tipo;
    }
}