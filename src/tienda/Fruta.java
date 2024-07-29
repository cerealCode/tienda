package tienda;

class Fruta extends Producto {
    Fruta(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    void mostrarDetalles() {
        System.out.println("Fruta: " + nombre + " Precio: " + precio);
    }
}
