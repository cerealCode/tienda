package tienda;

class FabricaConcretaProducto extends FabricaProducto {
    @Override
    Producto crearProducto(String tipo, String nombre, double precio) {
        switch (tipo) {
            case "Fruta":
                return new Fruta(nombre, precio);
            case "Lacteo":
                return new Lacteo(nombre, precio);
            default:
                return null;
        }
    }
}
