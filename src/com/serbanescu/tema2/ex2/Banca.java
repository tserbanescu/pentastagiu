package com.serbanescu.tema2.ex2;

public class Banca {

    private double sold;

    public Banca() {
        sold=20.0;
    }

    public double verficareSold() {
        return sold;
    }

    public void adaugareBani(double p) {
        sold+=p;
    }

    public void retragereBani(double p) {
        if(p<=sold){
            sold-=p;
        }
        else{
            System.out.println("Esti prea sarac");
        }
    }
}
