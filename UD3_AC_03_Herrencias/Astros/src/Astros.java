import java.util.Scanner;

class Astros {
    private String nombre;
    private double masa;
    private double diametro;
    private double periodoRotacion;
    private double periodoTraslacion;
    private double distanciaMedia;

    public Astros(String nombre, double masa, double diametro, double periodoRotacion, double periodoTraslacion, double distanciaMedia) {
        this.nombre = nombre;
        this.masa = masa;
        this.diametro = diametro;
        this.periodoRotacion = periodoRotacion;
        this.periodoTraslacion = periodoTraslacion;
        this.distanciaMedia = distanciaMedia;
    }

    public String getNombre() {
        return nombre;
    }

    public double getMasa() {
        return masa;
    }

    public double getDiametro() {
        return diametro;
    }

    public double getPeriodoRotacion() {
        return periodoRotacion;
    }

    public double getPeriodoTraslacion() {
        return periodoTraslacion;
    }

    public double getDistanciaMedia() {
        return distanciaMedia;
    }

    @Override
    public String toString() {
        return String.format(
            "Astros: Nombre=%s, Masa=%.2f, Diametro=%.2f, Periodo de Rotacion=%.2f, Periodo de Traslacion=%.2f, Distancia Media=%.2f",
            nombre, masa, diametro, periodoRotacion, periodoTraslacion, distanciaMedia
        );
    }
}