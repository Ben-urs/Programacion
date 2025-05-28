package com.example.vetdaw;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


import java.net.URL;
import java.sql.Connection;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ResourceBundle;

public abstract class HelloController implements Initializable {

    @FXML
    private VBox SalirAppButton;

    @FXML
    private VBox iniciosesionPanel;

    @FXML
    private javafx.scene.control.Button flechaRegreso;

    @FXML
    private javafx.scene.control.Button loginButton;

    @FXML
    private Label registrarseField;


    // === LOGIN ===
    @FXML
    private TextField emailUserLogin;
    @FXML
    private Label welcomeText;


    // == REGISTRO ==
    @FXML
    private TextField nombreField;
    @FXML
    private TextField apellidoField;
    @FXML
    private TextField emailField;
    @FXML
    private TextField telefonoField;
    @FXML
    private TextField direccionField;

    @FXML
    private Label welcomeText2;


    // == REGISTRO CONSULTA==
    @FXML
    private DatePicker fechaConsultaField;
    @FXML
    private TextField mascotaField;

    // == REGISTRO MASCOTA==
    @FXML
    private TextField nombreMField;
    @FXML
    private TextField pasaporteField;
    @FXML
    private LocalDateTime fechaNacimientoMField;
    @FXML
    private TextField pesoField;
    @FXML
    private TextField propietarioField;

    @FXML
    protected void onRegistroButton() {
        String nombre = nombreField.getText();
        String apellido = apellidoField.getText();
        String email = emailField.getText();
        String direccion = direccionField.getText();
        String telefono = telefonoField.getText();

        boolean registroExitoso1 = validadorRegistro1(
                nombre,
                apellido,
                email,
                direccion,
                telefono
                );

        if (registroExitoso1) {
            welcomeText2.setText("¡Registro exitoso!");
        } else {
            welcomeText2.setText("¡Error al registrarse!");
        }
    }

    private boolean validadorRegistro1(String nombre, String apellido, String telefono, String direccion, String email ) {
        DataConnect connect = new DataConnect();
        Connection connection = connect.getConnection();
        try {
            String query = "INSERT INTO consulta (nombre, apellido, telefono, direccion, email) VALUES (?, ?, ?, ?, ?)";
            var statement = connection.prepareStatement(query);

            statement.setString(1, nombre);
            statement.setString(2, apellido);
            statement.setString(3, telefono);
            statement.setString(4, direccion);
            statement.setString(5, email);

            int filasAfectadas = statement.executeUpdate();
            return filasAfectadas > 0;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }


    @FXML
    protected void onRegistroMButton() {
        String pasaporte = pasaporteField.getText();
        String nombre = nombreMField.getText();
        String peso = pesoField.getText();
        LocalDateTime fechaNacimiento = fechaNacimientoMField;
        String propietario_dni = propietarioField.getText();

        boolean registroExitoso1 = validadorRegistro1(
                pasaporte,
                nombre,
                peso,
                String.valueOf(fechaNacimiento),
                propietario_dni
        );
        if (registroExitoso1) {
            welcomeText2.setText("¡Registro exitoso!");
        } else {
            welcomeText2.setText("¡Error al registrarse!");
        }
    }


    private boolean validadorRegistro3(String pasaporte, String nombre, String peso, LocalDateTime fechaNacimiento, String propietario_dni) {
        DataConnect connect = new DataConnect();
        Connection connection = connect.getConnection();
        try {
            String query = "INSERT INTO consulta (pasaporte, anombre, peso, fechaNacimiento, propietario_dni) VALUES (?, ?, ?, ?, ?)";
            var statement = connection.prepareStatement(query);

            statement.setString(1, pasaporte);
            statement.setString(2, nombre);
            statement.setString(3, peso);
            statement.setString(4, String.valueOf(fechaNacimiento));

            int filasAfectadas = statement.executeUpdate();
            return filasAfectadas > 0;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }


    @FXML
    protected void onRegistroConButton() {
        LocalDateTime fecha = fechaConsultaField.getValue().atStartOfDay();
        String mascota = mascotaField.getText();
        String duracion = mascotaField.getText();
        String observaciones = mascotaField.getText();

        boolean registroExitoso2 = validadorRegistro2(
                fecha,
                duracion,
                observaciones,
                mascota
        );

        if (registroExitoso2) {
            welcomeText2.setText("¡Registro exitoso!");
        } else {
            welcomeText2.setText("¡Error al registrarse!");
        }
    }

    private boolean validadorRegistro2(LocalDateTime fecha, String duracion, String observaciones, String mascota) {
        DataConnect connect = new DataConnect();
        Connection connection = connect.getConnection();

        try {
            String query = "INSERT INTO consulta (Fecha, Duracion, Observaciones, Mascota_Pasaporte) VALUES (?, ?, ?, ?)";
            var statement = connection.prepareStatement(query);

            statement.setDate(1, java.sql.Date.valueOf(String.valueOf(fecha)));
            statement.setString(2, duracion);
            statement.setString(3, observaciones);
            statement.setString(4, mascota);

            int filasAfectadas = statement.executeUpdate();
            return filasAfectadas > 0;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @FXML
    protected void onRegistrarMacotaButton(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("RegistroMascota.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 640, 480);
            Stage stage = (Stage) onRegistrarMacotaButton.getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @FXML
    protected void onRegistrarConsultaButton(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("RegistroConsulta.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 640, 480);
            Stage stage = (Stage) onRegistrarConButton.getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @FXML
    protected void onExportarDatosButton(ActionEvent actionEvent) {
    }
    @FXML
    protected void onSalirAppButton(ActionEvent actionEvent) {
        Stage stage = (Stage) welcomeText2.getScene().getWindow();
        stage.close();
    }
    @FXML
    protected void onRegistrarPropietarioButton(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Registro.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 640, 480);
            Stage stage = (Stage) onRegistrarButton.getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @FXML
    protected void onBuscarMascotaButton(ActionEvent actionEvent) {
    }
}
