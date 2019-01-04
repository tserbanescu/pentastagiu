package com.serbanescu.tema2.ex3;

public class Candy extends Product {

    public Candy() {
    }

    private double grams;

    public double getGrams() {
        return grams;
    }

    public Candy(int candyId, String candyName, double candyPrice, double candyGrams){
        super(candyId,candyName,candyPrice);
        grams=candyGrams;
    }

}
