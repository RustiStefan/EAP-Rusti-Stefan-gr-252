package Clase;

import java.util.Scanner;

public class Scoala {

    private String nume;
    private Map<String, Materie> materii = new HashMap<>();

    public Scoala(String nume) {
        this.nume = nume;
    }

    public String getName() {
        return nume;
    }

    public void adauga_materie(Materie Materie) {
        materie.add(materie.nume, materie);
    }

    public Materie getMaterie(String nume) {
        return materie.get(nume);
    }
}
