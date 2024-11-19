class Notificaciones {
    private CanalNotificacion[] canales;
    private int indice = 0;

    public Notificaciones(int capacidad) {
        canales = new CanalNotificacion[capacidad];
    }

    public void agregarCanal(CanalNotificacion canal) {
        if (indice < canales.length) {
            canales[indice++] = canal;
        } else {
            System.out.println("Capacidad de canales excedida");
        }
    }

    public void enviarNotificaciones() {
        for (CanalNotificacion canal : canales) {
            if (canal != null) {
                canal.enviarNotificacion();
            }
        }
    }

    public void personalizarMensaje(int indice, String nuevoMensaje) {
        if (indice >= 0 && indice < canales.length && canales[indice] instanceof Personalizable) {
            ((Personalizable) canales[indice]).personalizarMensaje(nuevoMensaje);
        } else {
            System.out.println("Canal no encontrado o no personalizable");
        }
    }

    public void mostrarCanales() {
        for (CanalNotificacion canal : canales) {
            if (canal != null) {
                System.out.println(canal.getClass().getSimpleName() + ": " + canal.usuario + ", " + canal.mensaje);
            }
        }
    }
}