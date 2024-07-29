package tienda;

abstract class FabricaProducto {
    abstract Producto crearProducto(String tipo, String nombre, double precio);
}
