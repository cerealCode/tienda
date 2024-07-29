package tienda;

class PagoTarjeta extends PagoTemplate {
    @Override
    protected double calcularImporte(double cantidad) {
        return cantidad;
    }

    @Override
    protected void realizarPago(double cantidad) {
        System.out.println("Pagando " + cantidad + " con tarjeta.");
    }

    @Override
    protected boolean requiereCambio() {
        return false;
    }

    @Override
    protected void calcularCambio(double cantidad) {
    }

    @Override
    protected void imprimirRecibo(double cantidad) {
        System.out.println("Recibo: Pago con tarjeta de " + cantidad);
    }
}
