package ma.enset.exercice1;

public class GestionBibliothequeApp {
    public static void main(String[] args) {
        System.out.println("=== Gestion de Bibliothèque ===\n");

        // Créer un adhérent
        Adherent adherent = new Adherent("Alami", "Ahmed", "ahmed.alami@email.com",
                                         "0612345678", 25, "ADH001");

        // Créer un auteur
        Auteur auteur = new Auteur("Hemingway", "Ernest", "ernest@email.com", 
                                   "0698765432", 61, "AUT001");

        // Créer un livre
        Livre livre = new Livre(123456789, "Le vieil homme et la mer", auteur);

        // Afficher les informations
        System.out.println("Informations de l'adhérent:");
        System.out.println(adherent.toString());
        
        System.out.println("\n----------------------------\n");
        
        System.out.println("Informations du livre:");
        System.out.println(livre.toString());
    }
}
