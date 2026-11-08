
package com.ecoruta.ecoruta.conexion;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;

public class CrearTablas {

    public static void crear() {

        String puntos = """
            CREATE TABLE IF NOT EXISTS puntos_reciclaje (
                id INTEGER PRIMARY KEY AUTOINCREMENT,
                nombre TEXT NOT NULL,
                direccion TEXT NOT NULL,
                materiales TEXT NOT NULL
            )
            """;

        String registros = """
            CREATE TABLE IF NOT EXISTS registros (
                id INTEGER PRIMARY KEY AUTOINCREMENT,
                material TEXT NOT NULL,
                cantidad REAL NOT NULL,
                fecha TEXT NOT NULL
            )
            """;
        String rutas = """
            CREATE TABLE IF NOT EXISTS rutas (
                id INTEGER PRIMARY KEY AUTOINCREMENT,
                origen TEXT NOT NULL,
                destino TEXT NOT NULL,
                distancia REAL NOT NULL,
                transporte TEXT NOT NULL,
                emisiones REAL NOT NULL,
                fecha TEXT NOT NULL
    )
    """;

        try (Connection conexion = ConexionBD.conectar();
             Statement stmt = conexion.createStatement()) {

            stmt.execute(puntos);
            stmt.execute(registros);
            stmt.execute(rutas);

            System.out.println("Base de datos preparada correctamente.");

        } catch (SQLException e) {
            System.out.println("Error al crear las tablas: " + e.getMessage());
        }
    }
}
