
package cine;

public class Fila {
    
    /*
    La clase fila hace referencia a las filas que tiene una sala, cada fila a su vez esta compuesta
    por un numero determinado de butacas, para ello, utilizaremos un vector tipo Butaca, cada butaca almacena
    la letra de la fila y el numero q corresponde a la butaca empezando desde 1
    pero dicha butaca estara almacenada en el espacio 0 del vector y asi sucesibamente
    esta clase debera contar con:
    1) atributos:
        a) char fila;
        b) vector tipo butaca a definir tamaño en el constructor
    2) metodos:
        a) metodo contructor
            recibe por parameto 2 valores, uno tipo char, y otro tipo int,
            el valor char corresponde al identificador de fila y el int a la cantidad
            de butacas que tendra la fila,
            ademas desde el metodo contructor debera llamarse a otro metodo llamado
            cargarButacas
        b) metodo cargarButacas()
            este metodo recorre el vector y lo llena con butacas que son creadas dentro del mismo por
            cada butaca creada almacena el valor char de la fila, y el numeroDeButaca, el cual es igual al
            valor i actual del for +1.
        c) metodos set y get
        d) metodo getUnaButaca
            este metodo recibe por parametro dos valores(char fila, int numeroDeButaca)
            recorre el vector y devuelve la butaca que coincide con los dos valores pasados
    */
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    private final char fila; 
   
    private Butaca[] butacas;

    Fila (char fila, int cantButacas) { 
        this.fila = fila;
        butacas = new Butaca[cantButacas];
        cargarButacas();
    }

    public char getFila() { return fila; }
    
    public int getCantFilas(){
        return butacas.length;
    }
    
    public Butaca[] getButacas(){
        return butacas;
    }

    public void cargarButacas(){
        int numeroButaca = 1;
        for (int i = 0; i < butacas.length; i++) {
            Butaca butaca = new Butaca(getFila(),numeroButaca);
            numeroButaca++;
            butacas[i] = butaca;
            
        }
        System.out.println(getFila() + " cargada");
    }
    
    public Butaca getUnButaca(char fila, int numeroButaca){
        Butaca ret = null;
        for (int i = 0; i < butacas.length; i++) {
            if (butacas[i].getFila()==fila && butacas[i].getNumeroButaca()==numeroButaca){
                ret = butacas[i];
                break;
            }
        }
        return ret;
    }
}
