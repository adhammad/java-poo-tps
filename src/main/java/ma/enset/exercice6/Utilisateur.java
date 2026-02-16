package ma.enset.exercice6;

public class Utilisateur {
    private String nom;

    public Utilisateur(String nom) {
        this.nom = nom;
    }

    public void emprunterObjet(Empruntable objet) {
        System.out.println(nom + " essaie d'emprunter un objet...");
        objet.emprunter();
    }

    public void retournerObjet(Empruntable objet) {
        System.out.println(nom + " essaie de retourner un objet...");
        objet.retourner();
    }

    public String getNom() {
        return nom;
    }
}
