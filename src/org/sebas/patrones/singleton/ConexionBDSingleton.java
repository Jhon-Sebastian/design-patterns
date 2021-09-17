package org.sebas.patrones.singleton;

public class ConexionBDSingleton {

    /*
        TODO -> PATRON SINGLETON

        - Es un patron CREACIONAL porque crea un objeto

        - Indica que solo con una instancia de
        una clase es necesario, varias instancias no se permite
        y para crear la instancia se necesita crear un metodo publico y estatico
        para crear la unica instania y guardamos eso en un atributo
        estatico, ademas de validar para que no se cree una nueva instancia
     */

    private static ConexionBDSingleton instancia;

    private ConexionBDSingleton(){
        System.out.println("Conectandose algun motor de base de datos");
    }

    public static ConexionBDSingleton getInstance(){
        if(instancia == null){
            instancia = new ConexionBDSingleton();
        }
        return instancia;
    }

}
