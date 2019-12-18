
package sistemaventacobro;

import java.util.ArrayList;
import java.sql.Date;

public class Factura {
    private ArrayList<DetalleFactura> listaDetalle;
    private int numeroFactura, idVendedor;
    private double precioTotal;
    private Date fechaVta;

    public Factura() {
    }

    public Factura(int numeroFactura, int idVendedor, double precioTotal, Date fechaVta) {
        this.numeroFactura = numeroFactura;
        this.idVendedor = idVendedor;
        this.precioTotal = precioTotal;
        this.fechaVta = fechaVta;
    }

    public int getNumeroFactura() {
        return numeroFactura;
    }

    public int getIdVendedor() {
        return idVendedor;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    private void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public Date getFechaVta() {
        return fechaVta;
    }
    
    public void addDetalleFactura(DetalleFactura dF){
        listaDetalle.add(dF);
    }
    
    public void calcularPrecioTotal(){
        double sub=0.0;
        for (int i = 0; i < listaDetalle.size(); i++) {
            sub+=(double)(listaDetalle.get(i).getPrecio()*listaDetalle.get(i).getCantidad());   
        }
        setPrecioTotal(sub);
    }
}
