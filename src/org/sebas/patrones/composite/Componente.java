package org.sebas.patrones.composite;

import java.util.Objects;

abstract public class Componente {

    //atributo
    protected String nombre;

    //mostrar
    abstract public String mostrar(int nivel);

    abstract public boolean buscar(String nombre);

    //constructor
    public Componente(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Componente that = (Componente) o;
        return Objects.equals(nombre, that.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }
}
