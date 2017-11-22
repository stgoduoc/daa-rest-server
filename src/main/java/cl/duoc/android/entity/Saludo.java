package cl.duoc.android.entity;

import java.io.Serializable;


public class Saludo implements Serializable {
    
    private String saludo;
    private String lenguaje;

    public Saludo() {
    }

    public Saludo(String saludo, String lenguaje) {
        this.saludo = saludo;
        this.lenguaje = lenguaje;
    }

    
    
    public String getSaludo() {
        return saludo;
    }

    public void setSaludo(String saludo) {
        this.saludo = saludo;
    }

    public String getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }
    
}
