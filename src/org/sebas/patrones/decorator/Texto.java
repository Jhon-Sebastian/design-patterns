package org.sebas.patrones.decorator;

public class Texto implements Formateable{

    private String frase;

    public Texto(String frase) {
        this.frase = frase;
    }

    public String getFrase() {
        return frase;
    }

    @Override
    public String darFormato() {
        return getFrase();
    }

}
