package org.sebas.patrones.singleton;

public class EjemploSingleton {
    public static void main(String[] args) {

        ConexionBDSingleton con = null;


        for(int i = 0; i < 10; i++){
            con = ConexionBDSingleton.getInstance();
            System.out.println(con);
        }

        ConexionBDSingleton con2 = ConexionBDSingleton.getInstance();
        ConexionBDSingleton con3 = ConexionBDSingleton.getInstance();
        boolean b1 = (con == con2) && (con2 == con3) && (con == con3);


        System.out.println("b1 = " + b1);


    }
}
