
package sistemaventacobro;

public class Cajero {
    private String nombre, apellido, domicilio;
    private int idCajero;

    public Cajero(String nombre, String apellido, String domicilio, int idCajero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.domicilio = domicilio;
        this.idCajero = idCajero;
    }

    public Cajero() {
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

    public int getIdCajero() {
        return idCajero;
    }

    public void setIdCajero(int idCajero) {
        this.idCajero = idCajero;
    }
    
    public boolean login(int idCajero) {
        if(this.idCajero == idCajero)
            return true;
        else
            return false;
    }
}
