package com.example.vetdaw;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import java.sql.Connection;

public class HelloApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 640 , 480);
        stage.setTitle("VetDaw");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }


    public static void main(String[] args) {
        DataConnect dataConnect = new DataConnect();
        Connection conn = dataConnect.getConnection();

        if (conn != null) {
            System.out.println("Conexión exitosa.");
            launch(args);
        } else {
            System.out.println("Error al conectar con la base de datos. Cerrando aplicación...");
        }
    }
}

