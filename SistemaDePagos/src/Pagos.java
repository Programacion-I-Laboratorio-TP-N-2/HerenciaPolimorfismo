import java.util.ArrayList;
import java.util.List;

public class Pagos {
    private List<MetodoPago> metodosPago = new ArrayList<>();

    public void agregarMetodoPago(MetodoPago metodoPago) {
        metodosPago.add(metodoPago);
    }

    public void realizarPago(int indiceMetodoPago) {
        if (indiceMetodoPago >= 0 && indiceMetodoPago < metodosPago.size()) {
            metodosPago.get(indiceMetodoPago).realizarPago();
        } else {
            System.out.println("Índice de método de pago inválido.");
        }
    }

    public void cancelarPago(int indiceMetodoPago) {
        if (indiceMetodoPago >= 0 && indiceMetodoPago < metodosPago.size()) {
            MetodoPago metodoPago = metodosPago.get(indiceMetodoPago);
            if (metodoPago instanceof Cancelable) {
                ((Cancelable) metodoPago).cancelarPago();
            } else {
                System.out.println("El método de pago no se puede cancelar.");
            }
        } else {
            System.out.println("Índice de método de pago inválido.");
        }
    }

    public void mostrarMetodosPago() {
        for (int i = 0; i < metodosPago.size(); i++) {
            System.out.println(i + ". " + metodosPago.get(i));
        }
    }
}


