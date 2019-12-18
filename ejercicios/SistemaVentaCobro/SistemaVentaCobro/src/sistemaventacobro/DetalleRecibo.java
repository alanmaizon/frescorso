package sistemaventacobro;

public class DetalleRecibo {
    private Factura f;

    public DetalleRecibo() {
    }

    public DetalleRecibo(Factura f) {
        this.f = f;
    }

    public Factura getF() {
        return f;
    }

    public void setF(Factura f) {
        this.f = f;
    }
    
}
