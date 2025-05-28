package com.example.vetdaw;


import java.time.LocalDate;
import java.time.LocalDateTime;

public class Mascota {
    private String pasaporte;
    private String nombre;
    private String peso;
    private LocalDateTime fechaNacimeinto;
    private String propietario_dni;
    private String tipo_idTipo;

    public Mascota(String pasaporte, String nombre, String peso, LocalDateTime fechaNacimeinto, String propietario_dni, String tipo_idTipo) {
        this.pasaporte = pasaporte;
        this.nombre = nombre;
        this.peso = peso;
        this.fechaNacimeinto = fechaNacimeinto;
        this.propietario_dni = propietario_dni;
        this.tipo_idTipo = tipo_idTipo;
    }
    public String getPasaporte() {
        return pasaporte;
    }
    public void setPasaporte(String pasaporte) {
        this.pasaporte = pasaporte;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getPeso() {
        return peso;
    }
    public void setPeso(String peso) {
        this.peso = peso;
    }
    public LocalDateTime getFechaNacimeinto() {
        return fechaNacimeinto;
    }
    public void setFechaNacimeinto(LocalDateTime fechaNacimeinto) {
        this.fechaNacimeinto = fechaNacimeinto;
    }

    public String getPropietario_dni() {
        return propietario_dni;
    }
    public void setPropietario_dni(String propietario_dni) {
        this.propietario_dni = propietario_dni;
    }
    public String getTipo_idTipo() {
        return tipo_idTipo;
    }
    public void setTipo_idTipo(String tipo_idTipo) {
        this.tipo_idTipo = tipo_idTipo;
    }

}
