package tienda;

class ProductoIndividual implements ComponenteCarrito {
    String nombre;
    double precio;

    ProductoIndividual(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Producto: " + nombre + " Precio: " + precio);
    }

    @Override
    public double calcularPrecio() {
        return precio;
    }
}
