
package sistemaventacobro;

public class Producto {
    private int idProducto;
    private String nombre, detalle;
    private double stock, precioUnitario;

    public Producto() {
    }

    public Producto(int idProducto, double stock, String nombre, String detalle, double precioUnitario) {
        this.idProducto = idProducto;
        this.stock = stock;
        this.nombre = nombre;
        this.detalle = detalle;
        this.precioUnitario = precioUnitario;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public double getStock() {
        return stock;
    }

    public void setStock(double stock) {
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }
    
    
}
