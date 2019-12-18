
package sistemaventacobro;

import java.util.ArrayList;
import java.sql.Date;

public class Recibo {
    private ArrayList<DetalleRecibo> listaDetalle;
    private int numeroRecibo, idCajero;
    private double precioTotal;
    private Date fechaRecibo;

    public Recibo() {
    }

    public Recibo(int numeroRecibo, int idCajero, double precioTotal, Date fechaRecibo) {
        this.numeroRecibo = numeroRecibo;
        this.idCajero = idCajero;
        this.precioTotal = precioTotal;
        this.fechaRecibo = fechaRecibo;
    }

    public int getIdCajero() {
        return idCajero;
    }

    public int getNumeroRecibo(){
        return numeroRecibo;
    }
    
    public double getPrecioTotal() {
        return precioTotal;
    }

    public Date getFechaRecibo() {
        return fechaRecibo;
    }

    private void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }
    
    public void addDetalleRecibo(DetalleRecibo dR){
        listaDetalle.add(dR);
    }
    
    public void calcularPrecioTotal(){
        double sub=0.0;
        for (int i = 0; i < listaDetalle.size(); i++) {
            sub+=(double)(listaDetalle.get(i).getF().getPrecioTotal()); 
        }
        setPrecioTotal(sub);
    }
}
