public class SistemaNotificaciones {
    public static void main(String[] args) {
        Notificaciones notificaciones = new Notificaciones(3);

        notificaciones.agregarCanal(new CorreoElectronico("Juan", "¡Hola!", "juan@ejemplo.com"));
        notificaciones.agregarCanal(new MensajeTexto("Ana", "Mensaje importante", "1234567890"));

        notificaciones.mostrarCanales();

        notificaciones.personalizarMensaje(0, "Nuevo mensaje para Juan");

        notificaciones.enviarNotificaciones();
    }
}