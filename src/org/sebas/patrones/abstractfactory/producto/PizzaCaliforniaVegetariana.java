package org.sebas.patrones.abstractfactory.producto;

import org.sebas.patrones.abstractfactory.PizzaProducto;

public class PizzaCaliforniaVegetariana extends PizzaProducto {

    public PizzaCaliforniaVegetariana() {
        super();
        nombre = "Pizza california vegetariana";
        masa = "Masa delgada light";
        salsa = "Salsa BBQ light";
        ingredientes.add("Queso mozzarellla");
        ingredientes.add("Aceitunas");
        ingredientes.add("Espinacas");
        ingredientes.add("Ceboola");
        ingredientes.add("Berenjena");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando por 20 min. a 180°C");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en rebanas rectangular");
    }
}
