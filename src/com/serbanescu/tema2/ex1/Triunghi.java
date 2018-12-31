package com.serbanescu.tema2.ex1;

public class Triunghi extends Forma {
    private double primaLatura;
    private double aDouaLatura;
    private double aTreiaLatura;

    public Triunghi() {
    }

    public Triunghi(double r, double p, double o) {
        this.primaLatura = r;
        this.aDouaLatura = p;
        this.aTreiaLatura = o;
    }

    @Override
    public double getPerimeter() {
        return this.primaLatura + this.aDouaLatura + this.aTreiaLatura;
    }
}
