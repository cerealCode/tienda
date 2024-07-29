package tienda;

class Lacteo extends Producto {
    Lacteo(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    void mostrarDetalles() {
        System.out.println("Lácteo: " + nombre + " Precio: " + precio);
    }
}
