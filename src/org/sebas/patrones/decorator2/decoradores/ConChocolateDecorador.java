package org.sebas.patrones.decorator2.decoradores;

import org.sebas.patrones.decorator2.Configurable;

public class ConChocolateDecorador extends CafeDecorador{

    public ConChocolateDecorador(Configurable cafe) {
        super(cafe);
    }

    @Override
    public float getPrecioBase() {
        return cafe.getPrecioBase() + 5f;
    }

    @Override
    public String getIngredienetes() {
        return cafe.getIngredienetes() + ", Chocolate";
    }
}
