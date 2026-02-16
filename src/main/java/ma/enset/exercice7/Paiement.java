package ma.enset.exercice7;

public abstract class Paiement {
    protected double montant;
    protected String numeroTransaction;

    public Paiement(double montant, String numeroTransaction) {
        this.montant = montant;
        this.numeroTransaction = numeroTransaction;
    }

    public abstract void effectuerPaiement(double montant);

    public double getMontant() {
        return montant;
    }

    public String getNumeroTransaction() {
        return numeroTransaction;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }
}
