
package com.ecoruta.ecoruta;

import com.ecoruta.ecoruta.conexion.CrearTablas;

public class EcoRuta {

    public static void main(String[] args) {

        System.out.println("================================");
        System.out.println("       BIENVENIDO A ECORUTA");
        System.out.println("================================");

        CrearTablas.crear();

    }
}
