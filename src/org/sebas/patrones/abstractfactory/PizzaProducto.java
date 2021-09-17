package org.sebas.patrones.abstractfactory;

import java.util.ArrayList;
import java.util.List;

public abstract class PizzaProducto {

    protected String nombre;
    protected String masa;
    protected String salsa;
    protected List<String> ingredientes;


    public PizzaProducto() {
        ingredientes = new ArrayList<>();
    }

    public void preparar(){
        StringBuilder sb = new StringBuilder();
        sb.append("Preparando ").append(this.nombre).append("\n")
                .append("Seleccionando la masa ").append(this.masa).append("\n")
                .append("Agregando salsa ").append(this.masa).append("\n")
                .append("Agregando ingredientes \n\t{").append("\n");
        for(String i: ingredientes){
            sb.append("\t\t").append(i).append("\n");
        }
                sb.append("\t}");
        System.out.println(sb.toString());
    }

    public abstract void cocinar();

    public abstract void cortar();

    public void empaquetar(){
        System.out.println("Poniendo la piza en una caja de empaque...");
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "PizzaProducto{" +
                "nombre='" + nombre + '\'' +
                ", masa='" + masa + '\'' +
                ", salsa='" + salsa + '\'' +
                ", ingredientes=" + ingredientes +
                '}';
    }
}
