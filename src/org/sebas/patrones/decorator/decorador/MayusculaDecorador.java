package org.sebas.patrones.decorator.decorador;

import org.sebas.patrones.decorator.Formateable;

public class MayusculaDecorador extends TextoDecorador {

    public MayusculaDecorador(Formateable texto) {
        super(texto);
    }

    @Override
    public String darFormato() {
        return texto.darFormato().toUpperCase();
    }
}
