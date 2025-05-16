package org.example;

import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Studente> listaStudenti = new ArrayList();
        Studente s1 = new Studente("111", "Mario", "Rossi");
        listaStudenti.add(s1);

        int opzione;
        do {
            System.out.println("1. Stampa lista");
            System.out.println("2. Aggiungi utente");
            System.out.println("0. Esci");
            System.out.print("Scelta: ");
            opzione = sc.nextInt();
            sc.nextLine();
            switch (opzione) {
                case 1:
                    System.out.println(listaStudenti);
                    break;
                case 2:
                    System.out.println("Inserire matricola nuovo studente: ");
                    String mat = sc.nextLine();
                    System.out.println("Inserire nome nuovo studente: ");
                    String nome = sc.nextLine();
                    System.out.println("Inserire cognome nuovo studente: ");
                    String cognome = sc.nextLine();
                    listaStudenti.add(new Studente(mat, nome, cognome));
            }
        } while(opzione != 0);

    }
}