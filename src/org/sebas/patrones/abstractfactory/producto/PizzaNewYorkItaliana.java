package org.sebas.patrones.abstractfactory.producto;

import org.sebas.patrones.abstractfactory.PizzaProducto;

public class PizzaNewYorkItaliana extends PizzaProducto {

    public PizzaNewYorkItaliana() {
        super();
        nombre = "Pizza Italiana New York";
        masa = "Masa gruesa";
        salsa = "Salsa de Tomate italiana carne";
        ingredientes.add("Queso mozzarellla");
        ingredientes.add("Aceitunas");
        ingredientes.add("Jamón");
        ingredientes.add("Choricillo");
        ingredientes.add("Champiñones");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando por 30 min. a 120°C");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en triangulos grandes");
    }
}
