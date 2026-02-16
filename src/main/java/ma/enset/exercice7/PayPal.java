package ma.enset.exercice7;

public class PayPal extends Paiement {
    private String email;

    public PayPal(double montant, String numeroTransaction, String email) {
        super(montant, numeroTransaction);
        this.email = email;
    }

    @Override
    public void effectuerPaiement(double montant) {
        this.montant = montant;
        System.out.println("Paiement de " + montant + " DH effectué via PayPal");
        System.out.println("Email PayPal: " + email);
        System.out.println("N° Transaction: " + numeroTransaction);
        System.out.println("Paiement réussi!");
    }

    public String getEmail() {
        return email;
    }
}
