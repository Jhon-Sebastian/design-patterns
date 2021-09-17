package org.sebas.patrones.observer.ejemplos;

import org.sebas.patrones.observer.UsuarioResositorio;

public class EjemploObserver2 {
    public static void main(String[] args) {

        /*  TODO: Learning

            Se crea al Observable(UsuarioResositorio extends Observable por lo que
                                  trae la funcionalidad del padre)
            el cual la funcion es crear usuarios y hacer algo en la base de datos

            luego...

            Se crea el Observador(Observer) el cual estara pendiende de algun cambio
            todoo esto con el metodo notifyObservers(), el cual esta listo de llamarse
            cuando se cree en usuario en la clase  UsuarioResositorio, con el
            metodo crearUsuario(String usuario)
         */

        UsuarioResositorio repo = new UsuarioResositorio();
        repo.addObserver((o,u) -> System.out.println("Enviando un email al usuario a " + u));
        repo.addObserver((o,u) -> System.out.println("Enviando un email al administrador"));
        repo.addObserver((o,u) -> System.out.println("Guardando info del usuario "+ u +" en en log"));

        repo.crearUsuario("Luis");

    }
}
