package org.sebas.patrones.decorator2;

import org.sebas.patrones.decorator2.decoradores.ConChocolateDecorador;
import org.sebas.patrones.decorator2.decoradores.ConCremaDecorador;
import org.sebas.patrones.decorator2.decoradores.ConLecheDecorador;

public class EjemploDecoradorCafe {
    public static void main(String[] args) {

        Configurable cafe = new Cafe(7,"Cafe Mocha");
        ConCremaDecorador conCrema = new ConCremaDecorador(cafe);
        ConLecheDecorador conLeche = new ConLecheDecorador(conCrema);
        ConChocolateDecorador conChocolate = new ConChocolateDecorador(conLeche);

        System.out.println("El precio del cafe mocha con chocolate es: " + conChocolate.getPrecioBase());
        System.out.println("Ingredientes: " + conChocolate.getIngredienetes());

        System.out.println("\n");
        Configurable capuchino = new Cafe(4,"Cafe Capuchino");
        conCrema = new ConCremaDecorador(capuchino);
        conLeche = new ConLecheDecorador(conCrema);
        System.out.println("El precio del capuchino es: " + conLeche.getPrecioBase());
        System.out.println("Ingredientes: " + conLeche.getIngredienetes());

    }
}
