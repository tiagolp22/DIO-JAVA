import java.util.Scanner;

public class CompteTerminal {
    public static void main(String[] args) {
        // Créer un objet Scanner pour lire les entrées de l'utilisateur
        Scanner scanner = new Scanner(System.in);

        // Demander le numéro du compte
        System.out.print("Veuillez entrer le numéro du compte : ");
        int numero = scanner.nextInt();

        // Consommer la nouvelle ligne restante après nextInt()
        scanner.nextLine();

        // Demander le numéro de l'agence
        System.out.print("Veuillez entrer le numéro de l'agence : ");
        String agence = scanner.nextLine();

        // Demander le nom du client
        System.out.print("Veuillez entrer le nom du client : ");
        String nomClient = scanner.nextLine();

        // Demander le solde
        System.out.print("Veuillez entrer le solde : ");
        double solde = scanner.nextDouble();

        // Afficher le message de confirmation
        System.out.println("Bonjour " + nomClient + ", merci d'avoir créé un compte dans notre banque. " +
                "Votre agence est " + agence + ", compte numéro " + numero + " et votre solde de " +
                solde + "€ est déjà disponible pour le retrait.");

        // Fermer le Scanner
        scanner.close();
    }
}
