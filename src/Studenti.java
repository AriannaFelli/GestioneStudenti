import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Studenti {
    /*Scrivere un programma Java che:
Crei una classe Studente con nome, cognome e matricola.
Permetta all'utente di aggiungere nuovi studenti in un elenco (ArrayList).
Mostri tutti gli studenti presenti nell'elenco.
Permetta di cercare uno studente per matricola e visualizzare i suoi dettagli.*/
    private String nome;
    private String cognome;
    private String matricola;

    public Studenti(String nome, String cognome, String matricola) {
        this.nome = nome;
        this.cognome = cognome;
        this.matricola = matricola;
    }

    public String getMatricola() {
        return matricola;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Cognome: " + cognome + ", Matricola: " + matricola;
    }

}

