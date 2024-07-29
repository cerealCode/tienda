package tienda;

public class TiendaComestibles {
    public static void main(String[] args) {
        CarritoCompras carrito = new CarritoCompras();

        // Crear productos usando Factory Method
        FabricaProducto fabrica = new FabricaConcretaProducto();
        Producto manzana = fabrica.crearProducto("Fruta", "Manzana", 0.5);
        Producto leche = fabrica.crearProducto("Lacteo", "Leche", 1.5);

        // Añadir productos al carrito
        carrito.añadirProducto(new ProductoIndividual(manzana.nombre, manzana.precio));
        carrito.añadirProducto(new ProductoIndividual(leche.nombre, leche.precio));

        // Mostrar detalles del carrito
        carrito.mostrarDetalles();

        // Procesar el pago en efectivo
        PagoTemplate pagoEfectivo = new PagoEfectivo();
        carrito.procesarPago(pagoEfectivo);

        // Procesar el pago con tarjeta
        PagoTemplate pagoTarjeta = new PagoTarjeta();
        carrito.procesarPago(pagoTarjeta);
    }
}
