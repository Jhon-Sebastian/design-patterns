package org.sebas.patrones.decorator2.decoradores;

import org.sebas.patrones.decorator2.Configurable;

abstract public class CafeDecorador implements Configurable {

    /*
        Todoo decorador asbtracto debe tener un atributo en comun
        del tipo de a interfaz con el Cafe
     */

    protected Configurable cafe;

    public CafeDecorador(Configurable cafe) {
        this.cafe = cafe;
    }
}
