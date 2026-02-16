package ma.enset.exercice1;

public class Adherent extends Personne {
    private String numAdherent;

    public Adherent(String nom, String prenom, String email, String tel, int age, String numAdherent) {
        super(nom, prenom, email, tel, age);
        this.numAdherent = numAdherent;
    }

    @Override
    public String toString() {
        return "Adhérent - " + super.toString() + ", N° Adhérent: " + numAdherent;
    }

    public String getNumAdherent() {
        return numAdherent;
    }
}
