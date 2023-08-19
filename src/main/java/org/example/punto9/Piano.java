package org.example.punto9;

public class Piano extends InstrumentoMusical {
    public Piano(String nombre) {
        super(nombre);
    }

    public void tocar() {
        System.out.println(nombre + " suena: ¡Ding ding ding!");
    }
}
