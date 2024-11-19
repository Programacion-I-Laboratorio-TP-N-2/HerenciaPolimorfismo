public class SistemaDePagos {
    public static void main(String[] args) {
        Pagos pagos = new Pagos();

        TarjetaCredito tarjeta = new TarjetaCredito("Juan Perez", 1234567890, "12/25", 123);
        PayPal paypal = new PayPal("Juana Lopez", 12348584, "juana.lopez@example.com");

        pagos.agregarMetodoPago(tarjeta);

        pagos.agregarMetodoPago(paypal);

        pagos.mostrarMetodosPago();

        System.out.println("\nRealizando pago con tarjeta de crédito (índice 0):");
        pagos.realizarPago(0);

        System.out.println("\nCancelando pago con PayPal (índice 1):");
        pagos.cancelarPago(1);
    }
}