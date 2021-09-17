package org.sebas.patrones.abstractfactory.ejemplo;

import org.sebas.patrones.abstractfactory.PizzaProducto;
import org.sebas.patrones.abstractfactory.PizzeriaCaliforniaFactory;
import org.sebas.patrones.abstractfactory.PizzeriaNewYorkFactory;
import org.sebas.patrones.abstractfactory.PizzeriaZonaAbstractFactory;

public class EjemploFactory {
    public static void main(String[] args) {

        /*
            TODO: PATRON CREACIONAL
            Objetivo es crear familias de objetos con clases abstractas o interfaces.

            * Nos permite crear diferentes objetos que estan relacionados, familias de objetos
            ya se mediante la herencia o mediante la implementacion

            * Un objeto de este patron es que sea escalable que permite crear una nueva familia
            con una factory concetra, pero no modidicar factory ya existentes porque podria
            romper el sistema
         */


        PizzeriaZonaAbstractFactory ny = new PizzeriaNewYorkFactory();
        //vegetariana, peperoni, italiana
        PizzaProducto pizzaNy = ny.ordenarPizza("vegetariana");
        System.out.println("\n\n");
        System.out.println("Bruce ordena la pizza: " + pizzaNy.getNombre());
        pizzaNy = ny.ordenarPizza("peperoni");

        System.out.println("");
        PizzeriaZonaAbstractFactory california = new PizzeriaCaliforniaFactory();
        //peperoni, vegetariana, queso
        PizzaProducto pizzaCalifornia = california.ordenarPizza("queso");
        System.out.println(pizzaCalifornia);



    }
}
