package org.sebas.patrones.composite.ejemplo;

import org.sebas.patrones.composite.Archivo;
import org.sebas.patrones.composite.Directorio;

public class EjemploComposite {
    public static void main(String[] args) {

        /*
            TODO: PATRON DE DISENIO COMPOSITE

            * Categoria = Estructural
            Permite construir objetos complejos a partir de otros objetos mas simples,
            que tenga en comun una clase abstracta o interfaz, por lo tanto deben ser similares
            o del mismo tipo.

            Intenta solucionar la recursividad la cual es una estructura
            en forma de arbol
         */

        //Directorio Raiz
        Directorio doc = new Directorio("DOCUMENTOS");
        Directorio java = new Directorio("JAVA");

        doc.addComponente(java);

        java.addComponente(new Archivo("patron-composite.docx"));

        Directorio stream = new Directorio("API STREAM");
        stream.addComponente(new Archivo("stream-map.docx"));

        java.addComponente(stream);

        doc.addComponente(new Archivo("cv.docx"))
                .addComponente(new Archivo("logo.jpg"));

        System.out.println(doc.mostrar(0));

    }
}
