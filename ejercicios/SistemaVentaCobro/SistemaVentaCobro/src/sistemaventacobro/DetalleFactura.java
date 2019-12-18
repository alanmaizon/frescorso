package sistemaventacobro;

public class DetalleFactura {
    private Producto p;
    private int cantidad;
    private double precio;

    public DetalleFactura() {
    }

    public DetalleFactura(Producto p, int cantidad, double precio) {
        this.p = p;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public Producto getP() {
        return p;
    }

    public void setP(Producto p) {
        this.p = p;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
}
