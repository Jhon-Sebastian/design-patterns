package org.sebas.patrones.abstractfactory.producto;

import org.sebas.patrones.abstractfactory.PizzaProducto;

public class PizzaCaliforniaPeperoni extends PizzaProducto {

    public PizzaCaliforniaPeperoni() {
        super();
        nombre = "Pizza california peperoni";
        masa = "Masa la piedra gruesa";
        salsa = "Salsa de tomate de la pieda gruesa";
        ingredientes.add("Peperoni");
        ingredientes.add("Extra quedo mozzarela");
        ingredientes.add("Aceitunas");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando a 50 min. a 55°C");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en pequeños rectangulos");
    }
}
