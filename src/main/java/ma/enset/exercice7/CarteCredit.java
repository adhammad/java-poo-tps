package ma.enset.exercice7;

public class CarteCredit extends Paiement {
    private String numeroCarte;

    public CarteCredit(double montant, String numeroTransaction, String numeroCarte) {
        super(montant, numeroTransaction);
        this.numeroCarte = numeroCarte;
    }

    @Override
    public void effectuerPaiement(double montant) {
        this.montant = montant;
        System.out.println("Paiement de " + montant + " DH effectué par Carte de Crédit");
        System.out.println("Numéro de carte: **** **** **** " + numeroCarte.substring(numeroCarte.length() - 4));
        System.out.println("N° Transaction: " + numeroTransaction);
        System.out.println("Paiement réussi!");
    }

    public String getNumeroCarte() {
        return numeroCarte;
    }
}
