package com.decroly;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLDataBaseManager {

    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/";
    private static final String SCHEMA = "bbdd_prog";
    private static final String USUARIO = "developer";
    private static final String CLAVE = "developer";

    public static Connection getConnection() {
        Connection connection = null;

            try {
                Class.forName(DRIVER);
                connection = DriverManager.getConnection(URL+SCHEMA, USUARIO, CLAVE);

                System.out.println("\nConexion exitosa");
                } 
                catch (ClassNotFoundException e) {
                    System.out.println("\nError al cargar el Driver: " + e.getMessage());
                    } 
                    catch (SQLException e) {
                        System.out.println("Error al cargar la base de datos SQL: " + e.getMessage());
                        }

        return connection;
        }
    }

    


