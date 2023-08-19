package org.example.punto1;

import org.example.punto1.interfaces.PoligonoGeneral;

public abstract class FormaGeometrica implements PoligonoGeneral {
    protected String name; // Shared attribute

    public FormaGeometrica(String name) {
        this.name = name;
    }
}
