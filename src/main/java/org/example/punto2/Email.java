package org.example.punto2;

public class Email extends NotificationAbstract {
    public Email(String mensaje) {
        super(mensaje);
    }

    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando correo electrónico: " + getMensaje());
    }
}

