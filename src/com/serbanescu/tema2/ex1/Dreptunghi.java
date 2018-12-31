package com.serbanescu.tema2.ex1;

public class Dreptunghi extends Forma {
    private double lungime;
    private double latime;

    public Dreptunghi() {
    }

    public Dreptunghi(double r, double p) {
        this.lungime = r;
        this.latime = p;
    }

    @Override
    public double getPerimeter() {
        return 2.0 * this.lungime + 2.0 * this.latime;
    }
}
