
package cine;

public class Sala {
    
    Fila sa[]=new Fila [9];
    Butaca sa1[]=new Butaca [10];
    
    /*
    Esta clase contiene un vector de filas, cada fila contiene un vector de butacas,
    esta clase representa la sala donde se proyectan las peliculas.
    cada sala cuenta con 6 filas de butacas
    en sus primeras 4 filas desde el frente hacia atras, tiene 4 butacas en cada una
    y en sus ultima 2 filas 6 butacas.
    ademas las filas tiene una letra para su identificacion y comienzan desde la A fila en frente
    hasta la F ultima fila
    debera contar con:
    1)atributo:
        a) numeroSala tipo int
        b) vector de filas
    2)metodos:
        a) metodo cargarFilas 
            este metodo debera crear las filas correspondientes anunciadas antes y guardar dentro del vector
            en forma ordenada.
        b) metodos set y get
        c) metodo getUnaFila
            este metodo recibe por parametro la letra que identifica una fila
            y debera devolver la fila q corresponde con tal letra.
        d)constructor 
            este metodo llama a cargar fila
    */
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    int numeroSala;
    private Fila[] filas = new Fila[6];
    
    public Sala(){
        cargaDeFilas();
    }
    
    private void cargaDeFilas(){
        filas[0]=new Fila('A', 4);
        filas[1]=new Fila('B', 4);
        filas[2]=new Fila('C', 4);
        filas[3]=new Fila('D', 4);
        filas[4]=new Fila('E', 6);
        filas[5]=new Fila('F', 6);
    }
    
    public Fila[] getFilas(){
        return filas;
    }

}
