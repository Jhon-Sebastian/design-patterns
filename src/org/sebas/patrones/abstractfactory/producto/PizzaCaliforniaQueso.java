package org.sebas.patrones.abstractfactory.producto;

import org.sebas.patrones.abstractfactory.PizzaProducto;

public class PizzaCaliforniaQueso extends PizzaProducto {

    public PizzaCaliforniaQueso() {
        super();
        nombre = "Pizza california queso";
        masa = "Masa la piedra delgada";
        salsa = "Salsa de tomate recula";
        ingredientes.add("Extra queso mozzarellla");
        ingredientes.add("Cebolla");
        ingredientes.add("Quedo azul");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando a 15 min. a 130°C");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en pequeños triangulos");
    }
}
