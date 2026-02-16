package ma.enset.exercice7;

public class GestionPaiementApp {
    public static void main(String[] args) {
        System.out.println("=== Gestion des Paiements - Polymorphisme ===");

        // Créer des moyens de paiement
        CarteCredit carte1 = new CarteCredit(0, "TXN001", "1234567890123456");
        PayPal paypal1 = new PayPal(0, "TXN002", "client@email.com");

        // Créer des commandes avec différents moyens de paiement
        Commande commande1 = new Commande(250.50, carte1);
        Commande commande2 = new Commande(180.75, paypal1);

        // Traiter les paiements - Polymorphisme en action
        System.out.println("\n=== Commande 1 - Paiement par Carte de Crédit ===");
        commande1.processPayment();

        System.out.println("\n=== Commande 2 - Paiement par PayPal ===");
        commande2.processPayment();

        // Démonstration supplémentaire du polymorphisme
        System.out.println("\n\n=== Démonstration du Polymorphisme ===");
        
        // Tableau de paiements de types différents
        Paiement[] paiements = {
            new CarteCredit(0, "TXN003", "9876543210987654"),
            new PayPal(0, "TXN004", "autre@email.com"),
            new CarteCredit(0, "TXN005", "1111222233334444")
        };

        double[] montants = {150.00, 320.50, 95.25};

        for (int i = 0; i < paiements.length; i++) {
            System.out.println("\n--- Paiement " + (i + 1) + " ---");
            paiements[i].effectuerPaiement(montants[i]);
        }
    }
}
