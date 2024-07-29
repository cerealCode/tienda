package tienda;

import java.util.ArrayList;
import java.util.List;

class PaqueteProductos implements ComponenteCarrito {
    List<ComponenteCarrito> productos = new ArrayList<>();

    void añadirProducto(ComponenteCarrito producto) {
        productos.add(producto);
    }

    @Override
    public void mostrarDetalles() {
        for (ComponenteCarrito producto : productos) {
            producto.mostrarDetalles();
        }
    }

    @Override
    public double calcularPrecio() {
        double total = 0;
        for (ComponenteCarrito producto : productos) {
            total += producto.calcularPrecio();
        }
        return total;
    }
}
