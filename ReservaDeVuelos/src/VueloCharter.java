public class VueloCharter extends Vuelo implements Promocionable {
    private double precioTotal;

    public VueloCharter(int numeroVuelo, String origen, String destino, String fecha, double precioTotal) {
        super(numeroVuelo, origen, destino, fecha);
        this.precioTotal = precioTotal;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    @Override
    public double calcularPrecio() {
        return precioTotal;
    }

    @Override
    public void aplicarPromocion(double porcentajeDescuento) {
        precioTotal *= (1 - porcentajeDescuento / 100);
    }
}