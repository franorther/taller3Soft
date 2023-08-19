package org.example.punto2;

import org.example.punto2.interfaces.Notification;

public abstract class NotificationAbstract implements Notification {
    private String mensaje;

    public NotificationAbstract(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }
}
