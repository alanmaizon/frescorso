
package cine;

public enum Clasificacion {
    
    ATP("ATP"),
    MAS13("+13"),
    MAS16("+16"),
    MAS18("+18");
    
    String tipo;
    
    Clasificacion(String tipo){
        this.tipo = tipo;
    }
}
