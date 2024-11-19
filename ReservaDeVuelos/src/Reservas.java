import java.util.ArrayList;
import java.util.List;

public class Reservas {

    private List<Vuelo> vuelos = new ArrayList<>();

    public void agregarVuelo(Vuelo vuelo) {
        vuelos.add(vuelo);
    }

    public double calcularPrecioTotal() {
        double precioTotal = 0;
        for (Vuelo vuelo : vuelos) {
            precioTotal += vuelo.calcularPrecio();
        }
        return precioTotal;
    }

    public void aplicarPromociones(double porcentajeDescuento) {
        for (Vuelo vuelo : vuelos) {
            if (vuelo instanceof Promocionable) {
                ((Promocionable) vuelo).aplicarPromocion(porcentajeDescuento);
            }
        }
    }

    public void mostrarInformacionVuelos() {
        for (Vuelo vuelo : vuelos) {
            System.out.println(vuelo);
        }
    }
}

