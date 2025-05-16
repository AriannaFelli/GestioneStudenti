package org.example;

public class Studente {
    private String matricola;
    private String nome;
    private String cognome;

    public Studente(String matricola, String nome, String cognome) {
        this.matricola = matricola;
        this.nome = nome;
        this.cognome = cognome;
    }

    public String toString() {
        return "matricola='" + this.matricola + "', nome='" + this.nome + "', cognome='" + this.cognome + "'";
    }

    public String getMatricola() {
        return this.matricola;
    }

    public void setMatricola(String matricola) {
        this.matricola = matricola;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return this.cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
}
