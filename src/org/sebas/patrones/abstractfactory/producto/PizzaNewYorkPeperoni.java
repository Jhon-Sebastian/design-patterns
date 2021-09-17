package org.sebas.patrones.abstractfactory.producto;

import org.sebas.patrones.abstractfactory.PizzaProducto;

public class PizzaNewYorkPeperoni extends PizzaProducto {

    public PizzaNewYorkPeperoni() {
        super();
        nombre = "Pizza Peperoni New York";
        masa = "Masa delgada la piedad";
        salsa = "Salsa de Tomate";
        ingredientes.add("Queso mozzarellla");
        ingredientes.add("Extra peperoni");
        ingredientes.add("Aceitunas");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando por 40 min. a 90°C");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en triangulos");
    }
}
