package org.sebas.patrones.decorator.decorador;

import org.sebas.patrones.decorator.Formateable;

abstract public class TextoDecorador implements Formateable {

    /*
        Como es una clase abstracta no esta obligado a implementar
        el metodo, pero si sus hijos
     */

    protected Formateable texto;

    public TextoDecorador(Formateable texto) {
        this.texto = texto;
    }
}
