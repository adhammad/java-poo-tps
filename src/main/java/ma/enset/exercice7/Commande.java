package ma.enset.exercice7;

public class Commande {
    private double montantCommande;
    private Paiement moyenPaiement;

    public Commande(double montantCommande, Paiement moyenPaiement) {
        this.montantCommande = montantCommande;
        this.moyenPaiement = moyenPaiement;
    }

    public void processPayment() {
        System.out.println("\n--- Traitement de la commande ---");
        System.out.println("Montant de la commande: " + montantCommande + " DH");
        moyenPaiement.effectuerPaiement(montantCommande);
        System.out.println("Commande traitée avec succès!");
    }

    public double getMontantCommande() {
        return montantCommande;
    }

    public Paiement getMoyenPaiement() {
        return moyenPaiement;
    }
}
