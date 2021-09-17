package org.sebas.patrones.observer;

public class Corporacion extends Observable{

    private String nombre;
    private double precio;

    /*
        Ejemplo de la bolsa de valores
        Si cambio el precio de la comporacion notifica
        a todos los socios
     */

    public Corporacion(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void modificarPrecio(double precio){
        this.precio = precio;
        notifyObservers();
    }

    @Override
    public String toString() {
        return  getNombre() + " nuevo precio $"+ getPrecio();
    }
}
