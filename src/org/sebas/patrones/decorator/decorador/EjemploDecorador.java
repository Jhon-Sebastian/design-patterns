package org.sebas.patrones.decorator.decorador;

import org.sebas.patrones.decorator.Formateable;
import org.sebas.patrones.decorator.Texto;

public class EjemploDecorador {
    public static void main(String[] args) {

        Formateable texto = new Texto("Hola que tal Sebastián");

        MayusculaDecorador mayuscula = new MayusculaDecorador(texto);
        ReversaDecorador reversa = new ReversaDecorador(mayuscula);
        SubrayadoDecorador subrayado = new SubrayadoDecorador(reversa);
        ReemplazarEspacioDecorador reemplazar = new ReemplazarEspacioDecorador(subrayado);

        System.out.println(reemplazar.darFormato());
    }
}
