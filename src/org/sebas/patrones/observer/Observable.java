package org.sebas.patrones.observer;

import java.util.ArrayList;
import java.util.List;

public class Observable {

    /*
        La relacion es [1 observador - M Observables]

        Observable (1 - N) Observer
     */
    protected List<Observer> observers = new ArrayList<>();


    public void addObserver(Observer o){
        this.observers.add(o);
    }

    public void removeObserver(Observer o){
        this.observers.remove(o);
    }

    //Notificar a todos los observadores
    public void notifyObservers(){
        notifyObservers(null);
    }

    public void notifyObservers(Object obj){
        this.observers.forEach(o -> o.update(this, obj));
    }

}
