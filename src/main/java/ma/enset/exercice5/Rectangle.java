package ma.enset.exercice5;

public class Rectangle extends Figure {
    private double longueur;
    private double largeur;

    public Rectangle(String nom, double longueur, double largeur) {
        super(nom);
        this.longueur = longueur;
        this.largeur = largeur;
    }

    @Override
    public double calculerAire() {
        return longueur * largeur;
    }

    @Override
    public double calculerPerimetre() {
        return 2 * (longueur + largeur);
    }

    public double getLongueur() {
        return longueur;
    }

    public double getLargeur() {
        return largeur;
    }
}
