public class VueloRegular extends Vuelo implements Promocionable {
    private int numeroAsientos;
    private double precioPorAsiento;

    public VueloRegular(int numeroVuelo, String origen, String destino, String fecha, int numeroAsientos, double precioPorAsiento) {
        super(numeroVuelo, origen, destino, fecha);
        this.numeroAsientos = numeroAsientos;
        this.precioPorAsiento = precioPorAsiento;
    }

    public int getNumeroAsientos() {
        return numeroAsientos;
    }

    public void setNumeroAsientos(int numeroAsientos) {
        this.numeroAsientos = numeroAsientos;
    }

    public double getPrecioPorAsiento() {
        return precioPorAsiento;
    }

    public void setPrecioPorAsiento(double precioPorAsiento) {
        this.precioPorAsiento = precioPorAsiento;
    }

    @Override
    public double calcularPrecio() {
        return numeroAsientos * precioPorAsiento;
    }

    @Override
    public void aplicarPromocion(double porcentajeDescuento) {
        precioPorAsiento *= (1 - porcentajeDescuento / 100);
    }
}

