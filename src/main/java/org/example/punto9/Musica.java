package org.example.punto9;

public class Musica {
    public static void hacerTocarInstrumentos(InstrumentoMusical[] instrumentos) {
        for (InstrumentoMusical instrumento : instrumentos) {
            instrumento.tocar();
        }
    }
}
