package org.example.punto9;

public class Violin extends InstrumentoMusical {
    public Violin(String nombre) {
        super(nombre);
    }

    public void tocar() {
        System.out.println(nombre + " suena: ¡Screeeech!\n");
    }
}