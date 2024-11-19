public class SistemaDeReservas {
    public static void main(String[] args) {

        VueloRegular vuelo1 = new VueloRegular(101, "Buenos Aires", "Madrid", "2024-11-20", 200, 150);
        VueloCharter vuelo2 = new VueloCharter(102, "Miami", "Cancún", "2024-12-25", 5000);

        Reservas reservas = new Reservas();
        reservas.agregarVuelo(vuelo1);
        reservas.agregarVuelo(vuelo2);


        vuelo1.aplicarPromocion(0.1);

        double precioTotal = reservas.calcularPrecioTotal();
        System.out.println("Precio total de las reservas: " + precioTotal);
    }
}