package tienda;

abstract class PagoTemplate {
    public final void procesarPago(double cantidad) {
        double importe = calcularImporte(cantidad);
        realizarPago(importe);
        if (requiereCambio()) {
            calcularCambio(importe);
        }
        imprimirRecibo(importe);
    }

    protected abstract double calcularImporte(double cantidad);
    protected abstract void realizarPago(double cantidad);
    protected abstract boolean requiereCambio();
    protected abstract void calcularCambio(double cantidad);
    protected abstract void imprimirRecibo(double cantidad);
}
