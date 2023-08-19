package org.example.punto10;

import org.example.punto10.interfaces.Dibujable;

public class Lienzo {
    public static void dibujarEnLienzo(Dibujable[] objetos) {
        for (Dibujable objeto : objetos) {
            objeto.dibujar();
        }
    }
}
