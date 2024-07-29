package tienda;

class PagoEfectivo extends PagoTemplate {
    private double cambio;

    @Override
    protected double calcularImporte(double cantidad) {
        return cantidad;
    }

    @Override
    protected void realizarPago(double cantidad) {
        System.out.println("Pagando " + cantidad + " en efectivo.");
    }

    @Override
    protected boolean requiereCambio() {
        return true;
    }

    @Override
    protected void calcularCambio(double cantidad) {
        double pagoCliente = cantidad + 10; // Ejemplo
        cambio = pagoCliente - cantidad;
        System.out.println("Cambio a devolver: " + cambio);
    }

    @Override
    protected void imprimirRecibo(double cantidad) {
        System.out.println("Recibo: Pago en efectivo de " + cantidad + " cambio: " + cambio);
    }
}
