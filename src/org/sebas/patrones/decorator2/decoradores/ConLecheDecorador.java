package org.sebas.patrones.decorator2.decoradores;

import org.sebas.patrones.decorator2.Configurable;

public class ConLecheDecorador extends CafeDecorador{

    public ConLecheDecorador(Configurable cafe) {
        super(cafe);
    }

    @Override
    public float getPrecioBase() {
        return cafe.getPrecioBase() + 3.7f;
    }

    @Override
    public String getIngredienetes() {
        return cafe.getIngredienetes() + ", Leche";
    }
}
