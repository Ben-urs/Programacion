class Planeta extends Astros {
    private double distanciaAlSol;
    private double orbita;
    private boolean tieneSatelites;

    public Planeta(String nombre, double masa, double diametro, double periodoRotacion, double periodoTraslacion, double distanciaMedia, double distanciaAlSol, double orbita, boolean tieneSatelites) {
        super(nombre, masa, diametro, periodoRotacion, periodoTraslacion, distanciaMedia);
        this.distanciaAlSol = distanciaAlSol;
        this.orbita = orbita;
        this.tieneSatelites = tieneSatelites;
    }

    public double getDistanciaAlSol() {
        return distanciaAlSol;
    }

    public double getOrbita() {
        return orbita;
    }

    public boolean tieneSatelites() {
        return tieneSatelites;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(
            ", Distancia al Sol=%.2f, Orbita=%.2f, Tiene Satelites=%s",
            distanciaAlSol, orbita, tieneSatelites ? "Si" : "No"
        );
    }
}