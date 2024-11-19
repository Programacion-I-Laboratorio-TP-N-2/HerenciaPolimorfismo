public class PayPal extends MetodoPago implements Cancelable {
    private String correoElectronico;

    public PayPal(String titular, int numero, String correoElectronico) {
        super(titular, numero);
        this.correoElectronico = correoElectronico;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    @Override
    public void realizarPago() {
        System.out.println("Realizando pago con PayPal...");
        // Simular proceso de pago
    }

    @Override
    public void cancelarPago() {
        System.out.println("Cancelando pago con PayPal...");
        // Simular proceso de cancelación
    }
}
