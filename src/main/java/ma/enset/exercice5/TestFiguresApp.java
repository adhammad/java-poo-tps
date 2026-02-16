package ma.enset.exercice5;

public class TestFiguresApp {
    public static void main(String[] args) {
        System.out.println("=== Test des Figures Géométriques ===\n");

        // Créer un cercle
        Cercle cercle = new Cercle("Cercle 1", 5.0);
        
        // Créer un rectangle
        Rectangle rectangle = new Rectangle("Rectangle 1", 10.0, 5.0);
        
        // Créer un triangle
        Triangle triangle = new Triangle("Triangle 1", 3.0, 4.0, 5.0);

        // Afficher les détails du cercle
        System.out.println("--- CERCLE ---");
        cercle.afficherDetails();
        
        System.out.println("\n--- RECTANGLE ---");
        rectangle.afficherDetails();
        
        System.out.println("\n--- TRIANGLE ---");
        triangle.afficherDetails();
        
        // Démonstration du polymorphisme
        System.out.println("\n=== Polymorphisme avec un tableau de figures ===\n");
        Figure[] figures = {cercle, rectangle, triangle};
        
        for (Figure fig : figures) {
            System.out.println("--- " + fig.getNom().toUpperCase() + " ---");
            fig.afficherDetails();
            System.out.println();
        }
    }
}
