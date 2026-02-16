package ma.enset.exercice6;

public class GestionBibliothequeApp {
    public static void main(String[] args) {
        System.out.println("=== Gestion de Bibliothèque avec Interfaces ===\n");

        // Créer des livres
        Livre livre1 = new Livre("1984", "George Orwell");
        Livre livre2 = new Livre("Le Petit Prince", "Antoine de Saint-Exupéry");

        // Créer des DVDs
        DVD dvd1 = new DVD("Inception", "Christopher Nolan");
        DVD dvd2 = new DVD("The Matrix", "Wachowski");

        // Créer des utilisateurs
        Utilisateur utilisateur1 = new Utilisateur("Ahmed");
        Utilisateur utilisateur2 = new Utilisateur("Fatima");

        // Test d'emprunts
        System.out.println("--- Emprunts ---");
        utilisateur1.emprunterObjet(livre1);
        utilisateur1.emprunterObjet(dvd1);
        
        System.out.println("\n--- Tentative d'emprunt d'un objet déjà emprunté ---");
        utilisateur2.emprunterObjet(livre1);
        
        System.out.println("\n--- Retours ---");
        utilisateur1.retournerObjet(livre1);
        utilisateur1.retournerObjet(dvd1);
        
        System.out.println("\n--- Nouvel emprunt après retour ---");
        utilisateur2.emprunterObjet(livre1);
        
        System.out.println("\n--- Emprunts de différents objets ---");
        utilisateur2.emprunterObjet(livre2);
        utilisateur2.emprunterObjet(dvd2);
        
        System.out.println("\n--- Retours finaux ---");
        utilisateur2.retournerObjet(livre1);
        utilisateur2.retournerObjet(livre2);
        utilisateur2.retournerObjet(dvd2);
    }
}
