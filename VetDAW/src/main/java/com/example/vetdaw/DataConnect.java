package com.example.vetdaw;

import java.sql.Connection;
import java.sql.DriverManager;

public class DataConnect {
    public Connection databaseLink;

    public Connection getConnection(){
        String dataBaseName = "VetDaw";
        String dataBaseUser = "developer";
        String dataBasePassword = "developer";
        String url = "jdbc:mysql://localhost:3306/";
        String driver = "com.mysql.cj.jdbc.Driver";

        try {
            Class.forName(driver);
            databaseLink = DriverManager.getConnection(url+dataBaseName, dataBaseUser, dataBasePassword);
        } catch (ClassNotFoundException e) {
            System.out.println("Error al cargar el driver" + e.getMessage());
        }catch (Exception e) {
            System.out.println("Error al conectar a la base de datos" + e.getMessage());
        }
        return databaseLink;
    }
}
