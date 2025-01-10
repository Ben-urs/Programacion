class Satelite extends Astros {
    private double distanciaAlPlaneta;
    private double orbitaPlaneta;
    private String planetaOrbita;

    public Satelite(String nombre, double masa, double diametro, double periodoRotacion, double periodoTraslacion, double distanciaMedia, double distanciaAlPlaneta, double orbitaPlaneta, String planetaOrbita) {
        super(nombre, masa, diametro, periodoRotacion, periodoTraslacion, distanciaMedia);
        this.distanciaAlPlaneta = distanciaAlPlaneta;
        this.orbitaPlaneta = orbitaPlaneta;
        this.planetaOrbita = planetaOrbita;
    }

    public double getDistanciaAlPlaneta() {
        return distanciaAlPlaneta;
    }

    public double getOrbitaPlaneta() {
        return orbitaPlaneta;
    }

    public String getPlanetaOrbita() {
        return planetaOrbita;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(
            ", Distancia al Planeta=%.2f, Orbita al Planeta=%.2f, Planeta al que Orbita=%s",
            distanciaAlPlaneta, orbitaPlaneta, planetaOrbita
        );
    }
}