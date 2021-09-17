package org.sebas.patrones.abstractfactory;

import org.sebas.patrones.abstractfactory.producto.PizzaCaliforniaPeperoni;
import org.sebas.patrones.abstractfactory.producto.PizzaCaliforniaQueso;
import org.sebas.patrones.abstractfactory.producto.PizzaCaliforniaVegetariana;


public class PizzeriaCaliforniaFactory extends PizzeriaZonaAbstractFactory{
    @Override
    public PizzaProducto crearPizza(String tipo) {
        PizzaProducto pizzaProducto = null;
        switch (tipo){
            case "peperoni":
                pizzaProducto = new PizzaCaliforniaPeperoni();
                break;

            case "vegetariana":
                pizzaProducto = new PizzaCaliforniaVegetariana();
                break;

            case "queso":
                pizzaProducto = new PizzaCaliforniaQueso();
                break;

            default: throw new RuntimeException("No se encontro el tipo de pizza");
        }
        return pizzaProducto;
    }
}
