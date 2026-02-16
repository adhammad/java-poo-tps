package ma.enset.exercice3;

public class TestVehiculesApp {
    public static void main(String[] args) {
        System.out.println("=== Test des Véhicules ===\n");

        // Créer une voiture
        Voiture voiture = new Voiture("Dacia Logan", 150000.0, "Stepway", 2023);
        
        // Créer une moto
        Moto moto = new Moto("Yamaha R1", 120000.0, "Yamaha", 200);
        
        // Créer un avion
        Avion avion = new Avion("Boeing 737", 50000000.0, "Royal Air Maroc", 850.0);

        // Tester la voiture
        System.out.println("--- VOITURE ---");
        voiture.afficherInformations();
        voiture.emettreSon();
        
        System.out.println("\n--- MOTO ---");
        moto.afficherInformations();
        moto.emettreSon();
        
        System.out.println("\n--- AVION ---");
        avion.afficherInformations();
        avion.emettreSon();
    }
}
