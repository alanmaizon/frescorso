
package cine;

public class Principal {

    public static void main(String[] args) {
        Sala s = new Sala();
        Fila[] filas = s.getFilas();
        Butaca b = null;
        for (Fila f : filas) {
            b = f.getUnButaca('D', 4);            
            if(b != null){
                break;
            }
        }
        
        System.out.println(b.toString());
    }
    
}
