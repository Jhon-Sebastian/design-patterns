package org.sebas.patrones.observer;

public interface Observer {

    //Recibe una instancia del objeto que cambio su estado
    void update(Observable obs, Object obj);

}
