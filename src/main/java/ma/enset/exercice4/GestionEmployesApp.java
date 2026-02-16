package ma.enset.exercice4;

public class GestionEmployesApp {
    public static void main(String[] args) {
        System.out.println("=== Gestion des Employés ===\n");

        // Créer un ingénieur
        Ingenieur ingenieur = new Ingenieur("Bennani", "Karim", "karim.bennani@email.com", 
                                            "0661234567", 10000.0, "Développement Web");

        // Créer un manager
        Manager manager = new Manager("Alaoui", "Fatima", "fatima.alaoui@email.com", 
                                     "0662345678", 15000.0, "Ressources Humaines");

        // Afficher les informations
        System.out.println("Informations de l'ingénieur:");
        System.out.println(ingenieur.toString());
        System.out.println("Salaire de base: " + ingenieur.getSalaire() + " DH");
        System.out.println("Salaire après augmentation: " + ingenieur.calculerSalaire() + " DH");
        
        System.out.println("\n----------------------------\n");
        
        System.out.println("Informations du manager:");
        System.out.println(manager.toString());
        System.out.println("Salaire de base: " + manager.getSalaire() + " DH");
        System.out.println("Salaire après augmentation: " + manager.calculerSalaire() + " DH");
    }
}
