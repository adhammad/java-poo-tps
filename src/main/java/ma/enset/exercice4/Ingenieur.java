package ma.enset.exercice4;

public class Ingenieur extends Employe {
    private String specialite;

    public Ingenieur(String nom, String prenom, String email, String telephone, 
                     double salaire, String specialite) {
        super(nom, prenom, email, telephone, salaire);
        this.specialite = specialite;
    }

    @Override
    public double calculerSalaire() {
        // Augmentation de 15%
        return salaire * 1.15;
    }

    public String getSpecialite() {
        return specialite;
    }

    @Override
    public String toString() {
        return "Ingénieur - Nom: " + nom + " " + prenom + 
               ", Email: " + email + ", Tél: " + telephone + 
               ", Salaire: " + calculerSalaire() + " DH" +
               ", Spécialité: " + specialite;
    }
}
