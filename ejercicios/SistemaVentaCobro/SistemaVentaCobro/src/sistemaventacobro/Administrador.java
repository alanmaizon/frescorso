package sistemaventacobro;

public class Administrador {
    private String nombre;
    private int idAdmin;

    public Administrador() {
        nombre = "Levi";
        idAdmin = 000;
    }

    public int getIdAdmin() {
        return idAdmin;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean login(int idAdmin) {
        if(this.idAdmin == idAdmin)
            return true;
        else
            return false;
    }
    
    
}
