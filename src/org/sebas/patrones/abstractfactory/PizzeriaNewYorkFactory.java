package org.sebas.patrones.abstractfactory;

import org.sebas.patrones.abstractfactory.producto.PizzaNewYorkItaliana;
import org.sebas.patrones.abstractfactory.producto.PizzaNewYorkPeperoni;
import org.sebas.patrones.abstractfactory.producto.PizzaNewYorkVegetariana;

public class PizzeriaNewYorkFactory extends PizzeriaZonaAbstractFactory{

    @Override
    public PizzaProducto crearPizza(String tipo) {
        PizzaProducto pizzaProducto = null;
        switch (tipo){
            case "vegetariana":
                pizzaProducto = new PizzaNewYorkVegetariana();
                break;

            case "peperoni":
                pizzaProducto = new PizzaNewYorkPeperoni();
                break;

            case "italiana":
                pizzaProducto = new PizzaNewYorkItaliana();
                break;

            default: throw new RuntimeException("No se encontro el tipo de pizza...");
        }
        return pizzaProducto;
    }

}
