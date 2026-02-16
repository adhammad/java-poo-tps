package ma.enset.exercice1;

public class Livre {
    private int ISBN;
    private String titre;
    private Auteur auteur;

    public Livre(int ISBN, String titre, Auteur auteur) {
        this.ISBN = ISBN;
        this.titre = titre;
        this.auteur = auteur;
    }

    @Override
    public String toString() {
        return "Livre - ISBN: " + ISBN + ", Titre: " + titre + "\n" + auteur.toString();
    }

    public int getISBN() {
        return ISBN;
    }

    public String getTitre() {
        return titre;
    }

    public Auteur getAuteur() {
        return auteur;
    }
}
