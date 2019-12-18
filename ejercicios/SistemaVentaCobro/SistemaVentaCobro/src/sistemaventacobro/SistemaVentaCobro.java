package sistemaventacobro;

import java.util.ArrayList;
import java.sql.Date;
import javax.swing.JOptionPane;

public class SistemaVentaCobro {
    private ArrayList<Producto> listaProductos = new ArrayList<>();
    private ArrayList<Factura> listaVentas = new ArrayList<>();
    private ArrayList<Recibo> listaCobros = new ArrayList<>();
    private ArrayList<Cajero> listaCajeros = new ArrayList<>();
    private ArrayList<Vendedor> listaVendedores = new ArrayList<>();
    private Administrador admin = new Administrador();
    
    public static SistemaVentaCobro sis;
    
    public static synchronized SistemaVentaCobro getInstance(){
        if(sis==null){
            sis = new SistemaVentaCobro();
            sis.chargeData();
        }
        return sis;
    }
    
    public void addProducto(Producto p){
        listaProductos.add(p);
    }
    
    public void addCajero(Cajero c){
        listaCajeros.add(c);
    }
    
    public void addVendedor(Vendedor v){
        listaVendedores.add(v);
    }
    
    public void registrarVenta(Factura f){
        listaVentas.add(f);
    }
    
    public void registrarCobro(Recibo r){
        listaCobros.add(r);
    }
    
    public Cajero getUnCajero(int idCajero){
        Cajero ret = null;
        for (int i = 0; i < listaCajeros.size(); i++) {
            if(listaCajeros.get(i).getIdCajero()==idCajero){
                ret = listaCajeros.get(i);
                break;
            }
        }
        return ret;
    }
    
    public boolean loginCajero(int idCajero){
        boolean ret = false;
        for (int i = 0; i < listaCajeros.size(); i++) {
            if(listaCajeros.get(i).login(idCajero)){
                ret = true;            
                break;
            }
        }
        return ret;
    }
    
    public Vendedor getUnVendedor(int idVendedor){
        Vendedor ret = null;
        for (int i = 0; i < listaVendedores.size(); i++) {
            if(listaVendedores.get(i).getIdVendedor()==idVendedor){
                ret = listaVendedores.get(i);
                break;
            }
        }
        return ret;
    }
    
    public boolean loginVendedor(int idVendedor){
        boolean ret = false;
        for (int i = 0; i < listaVendedores.size(); i++) {
            if(listaVendedores.get(i).login(idVendedor)){
                ret = true;            
                break;
            }
        }
        return ret;
    }
    
    public Factura getUnaFactura(int numeroFactura){
        Factura ret = null;
        for (int i = 0; i < listaVentas.size(); i++) {
            if(listaVentas.get(i).getNumeroFactura()==numeroFactura){
                ret = listaVentas.get(i);
                break;
            }
        }
        return ret;
    }
    
    public Recibo getUnRecibo(int numeroRecibo){
        Recibo ret = null;
        for (int i = 0; i < listaCobros.size(); i++) {
            if(listaCobros.get(i).getNumeroRecibo()==numeroRecibo){
                ret = listaCobros.get(i);
                break;
            }
        }
        return ret;
    }
    
    public int generarNumeroFactura(){
        int numero;
        if(listaVentas.size() > 0){
            numero = listaVentas.get(listaVentas.size()-1).getNumeroFactura()+1;
        }else{
            numero = 2018000000;
        }
        return numero;
    }
    
    public int generarNumeroRecibo(){
        int numero;
        if(listaCobros.size() > 0){
            numero = listaCobros.get(listaCobros.size()-1).getNumeroRecibo()+1;
        }else{
            numero = 2018000000;
        }
        return numero;
    }
    
    public Date getFechaActual(){
        java.util.Date utilDate = new java.util.Date(); //fecha actual
        long lnMilisegundos = utilDate.getTime();
        java.sql.Date sqlDate = new java.sql.Date(lnMilisegundos);
        return sqlDate;
    }
    
    public ArrayList<Producto> getListaProductos(){
        return listaProductos;
    }
    
    private void chargeData(){
        //public Producto(int idProducto, int stock, String nombre, String detalle, double precioUnitario)
      
        Producto p1 = new Producto(1001,10,"Criollos","K",25.00);
        Producto p2 = new Producto(1002,30,"Factura","U",8.00);
        Producto p3 = new Producto(1003,30,"Pan Frances","K",20.00);
        Producto p4 = new Producto(1004,10,"Bollo Negro","K",25.00);
        Producto p5 = new Producto(1005,5,"Alfajor Maizena","K",40.00);
       
        sis.addProducto(p1);
        sis.addProducto(p2);
        sis.addProducto(p3);
        sis.addProducto(p4);
        sis.addProducto(p5);
       
        //public Cajero(String nombre, String apellido, String domicilio, int idCajero)
        Cajero c1 = new Cajero("Juan","Castro","Pedrito Pistolero 336", 9001);
        Cajero c2 = new Cajero("Maria","Castral","Pedrito Pistolero 337", 9002);
     
        sis.addCajero(c1);
        sis.addCajero(c2);
        
        //public Vendedor(String nombre, String apellido, String domicilio, int idVendedor)
        Vendedor v1 = new Vendedor("Victoria","Castro","Pedrito Pistolero 336", 8001);
        Vendedor v2 = new Vendedor("Marcos","Castro","Pedrito Pistolero 337", 8002);
        
        sis.addVendedor(v1);
        sis.addVendedor(v2);
        
        //public Recibo(int numeroRecibo, int idCajero, double precioTotal, String fechaRecibo)
      
        //public Factura(int numeroFactura, int idVendedor, double precioTotal, String fechaVta)
    }
    
}
