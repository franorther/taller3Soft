package org.example.punto2;

public class NotificacionPush extends NotificationAbstract {
    public NotificacionPush(String mensaje) {
        super(mensaje);
    }

    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando notificación push: " + getMensaje());
    }
}
