package com.serbanescu.tema2.ex1;

public class Cerc extends Forma {
    private double raza;

    public Cerc() {
    }

    public Cerc(double r) {
        this.raza = r;
    }

    @Override
    public double getPerimeter() {
        return 2.0 * Math.PI * this.raza;
    }
}
