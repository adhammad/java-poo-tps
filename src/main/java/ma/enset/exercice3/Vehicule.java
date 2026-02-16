package ma.enset.exercice3;

public class Vehicule {
    protected String nom;
    protected double prix;

    public Vehicule(String nom, double prix) {
        this.nom = nom;
        this.prix = prix;
    }

    public void emettreSon() {
        System.out.println("Le véhicule émet un son inconnu.");
    }

    public void afficherInformations() {
        System.out.println("Nom: " + nom);
        System.out.println("Prix: " + prix + " DH");
    }

    public String getNom() {
        return nom;
    }

    public double getPrix() {
        return prix;
    }
}
