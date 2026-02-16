package ma.enset.exercice5;

public class Triangle extends Figure {
    private double cote1;
    private double cote2;
    private double cote3;

    public Triangle(String nom, double cote1, double cote2, double cote3) {
        super(nom);
        this.cote1 = cote1;
        this.cote2 = cote2;
        this.cote3 = cote3;
    }

    @Override
    public double calculerAire() {
        // Utiliser la formule de Héron
        double s = calculerPerimetre() / 2;
        return Math.sqrt(s * (s - cote1) * (s - cote2) * (s - cote3));
    }

    @Override
    public double calculerPerimetre() {
        return cote1 + cote2 + cote3;
    }

    public double getCote1() {
        return cote1;
    }

    public double getCote2() {
        return cote2;
    }

    public double getCote3() {
        return cote3;
    }
}
