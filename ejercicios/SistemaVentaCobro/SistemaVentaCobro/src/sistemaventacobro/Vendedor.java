package sistemaventacobro;

public class Vendedor {
    private String nombre, apellido, domicilio;
    private int idVendedor;

    public Vendedor(String nombre, String apellido, String domicilio, int idVendedor) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
        this.idVendedor = idVendedor;
    }

    public Vendedor() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getIdVendedor() {
        return idVendedor;
    }

    public void setIdVendedor(int idVendedor) {
        this.idVendedor = idVendedor;
    }
    
    public boolean login(int idVendedor) {
        if(this.idVendedor == idVendedor)
            return true;
        else
            return false;
    }
}
