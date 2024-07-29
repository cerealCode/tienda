package tienda;

import java.util.ArrayList;
import java.util.List;

class CarritoCompras {
    private List<ComponenteCarrito> productos = new ArrayList<>();

    void añadirProducto(ComponenteCarrito producto) {
        productos.add(producto);
    }

    void mostrarDetalles() {
        for (ComponenteCarrito producto : productos) {
            producto.mostrarDetalles();
        }
    }

    double calcularTotal() {
        double total = 0;
        for (ComponenteCarrito producto : productos) {
            total += producto.calcularPrecio();
        }
        return total;
    }

    void procesarPago(PagoTemplate metodoPago) {
        double total = calcularTotal();
        metodoPago.procesarPago(total);
    }
}
