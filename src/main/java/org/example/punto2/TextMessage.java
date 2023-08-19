package org.example.punto2;

public class TextMessage extends NotificationAbstract{
    public TextMessage(String mensaje) {
        super(mensaje);
    }

    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando mensaje de texto: " + getMensaje());
    }
}
