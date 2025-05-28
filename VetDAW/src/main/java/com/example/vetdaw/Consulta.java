package com.example.vetdaw;


import java.time.LocalDateTime;

public class Consulta {
    private LocalDateTime fecha;
    private String duracion;
    private String observaciones;
    private String mascota;


    public Consulta(LocalDateTime fecha, String duracion, String observaciones, String mascota) {
        this.fecha = fecha;
        this.duracion = duracion;
        this.observaciones = observaciones;
        this.mascota = mascota;
    }



}
