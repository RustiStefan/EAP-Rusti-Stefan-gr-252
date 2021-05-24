package Clase;

import java.util.Scanner;

public class Angajat extends Persoana{

    protected String functie;
    private int salariu;

    public Angajat() {
        super();
        Scanner in = new Scanner(System.in);
        System.out.println("Introduceti functia:");
        this.functie = in.nextLine();
        System.out.println("Introduceti salariul:");
        this.salariu = Integer.parseInt(in.nextLine());

    }

    public String getFunctie() {
        return functie;
    }

    public void setFct(String functie) {
        this.functie = functie;
    }

    public int getSalary() {
        return salariu;
    }

    public void setSalary(int salariu) {
        this.salariu = salariu;
    }

    @Override
    public void print() {
        super.print();
        System.out.println(functie);
    }
}
