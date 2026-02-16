package ma.enset.exercice4;

public class Manager extends Employe {
    private String service;

    public Manager(String nom, String prenom, String email, String telephone, 
                   double salaire, String service) {
        super(nom, prenom, email, telephone, salaire);
        this.service = service;
    }

    @Override
    public double calculerSalaire() {
        // Augmentation de 20%
        return salaire * 1.20;
    }

    public String getService() {
        return service;
    }

    @Override
    public String toString() {
        return "Manager - Nom: " + nom + " " + prenom + 
               ", Email: " + email + ", Tél: " + telephone + 
               ", Salaire: " + calculerSalaire() + " DH" +
               ", Service: " + service;
    }
}
