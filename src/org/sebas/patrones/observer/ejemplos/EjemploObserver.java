package org.sebas.patrones.observer.ejemplos;

import org.sebas.patrones.observer.Corporacion;

public class EjemploObserver {
    public static void main(String[] args) {

        Corporacion google = new Corporacion("Google", 1000);
        google.addObserver( (obs,obj) -> {
            System.out.println("Jhon: " + obs);
        });
        google.addObserver((obs,obj) -> {
            System.out.println("Andres: " + obs);
        });
        google.addObserver((obs,obj) -> {
            System.out.println("Maria: " + obs);
        });

        google.modificarPrecio(2000);

    }
}
