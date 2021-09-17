package org.sebas.patrones.observer;

import java.util.ArrayList;
import java.util.List;

public class UsuarioResositorio extends Observable{

    private List<String> usuarioRepositorio = new ArrayList<>();

    public void crearUsuario(String usuario){
        usuarioRepositorio.add(usuario);
        notifyObservers(usuario);
    }

}
