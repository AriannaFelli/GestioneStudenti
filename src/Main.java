import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    private static ArrayList<Studenti> elencoStudenti = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
aggiungiStudente();
mostraStudenti();
    }

    private static void aggiungiStudente() {
        System.out.print("Inserisci nome: ");
        String nome = scanner.nextLine();
        System.out.print("Inserisci cognome: ");
        String cognome = scanner.nextLine();
        System.out.print("Inserisci matricola: ");
        String matricola = scanner.nextLine();

        Studenti nuovo = new Studenti(nome, cognome, matricola);
        elencoStudenti.add(nuovo);
        System.out.println("Studente aggiunto con successo.");
    }

    private static void mostraStudenti() {
        if (elencoStudenti.isEmpty()) {
            System.out.println("Nessuno studente presente.");
        } else {
            System.out.println("\n--- Elenco Studenti ---");
            for (Studenti s : elencoStudenti) {
                System.out.println(s);
            }
        }
    }

    private static void cercaStudente() {
        System.out.print("Inserisci la matricola da cercare: ");
        String matricola = scanner.nextLine();

        boolean trovato = false;
        for (Studenti s : elencoStudenti) {
            if (s.getMatricola().equalsIgnoreCase(matricola)) {
                System.out.println("Studente trovato:");
                System.out.println(s);
                trovato = true;
                break;
            }
        }

        if (!trovato) {
            System.out.println("Nessuno studente trovato con la matricola: " + matricola);
        }
    }
}