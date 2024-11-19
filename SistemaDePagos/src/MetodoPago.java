public abstract class MetodoPago {
        protected String titular;
        protected int numero;

    public MetodoPago(String titular, int numero) {
        this.titular = titular;
        this.numero = numero;
    }


    public abstract void realizarPago();
}
