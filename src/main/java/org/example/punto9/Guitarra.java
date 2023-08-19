package org.example.punto9;

public class Guitarra extends InstrumentoMusical {
    public Guitarra(String nombre) {
        super(nombre);
    }

    public void tocar() {
        System.out.println(nombre + " suena: ¡Trrriiiing!");
    }
}
