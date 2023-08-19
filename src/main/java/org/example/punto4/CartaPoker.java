package org.example.punto4;

import org.example.punto4.interfaces.Carta;

public class CartaPoker implements Carta {
    private String palo;
    private String valor;

    public CartaPoker(String palo, String valor) {
        this.palo = palo;
        this.valor = valor;
    }

    public void mostrarCarta() {
        System.out.println(valor + " de " + palo);
    }

    public int valorNumerico() {
        switch (valor) {
            case "As":
                return 11;
            case "Rey":
            case "Reina":
            case "Jota":
                return 10;
            default:
                return Integer.parseInt(valor);
        }
    }
}