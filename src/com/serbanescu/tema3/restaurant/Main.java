package com.serbanescu.tema3.restaurant;

public class Main {

    public static void main(String[] args) {

        Restaurant plante = new VeganRestaurant();
        Restaurant junk = new FastFoodRestaurant();

        plante.moreHungryPeople(5);
        junk.moreHungryPeople(8);
        System.out.println("Profitul pentru Fast Food este: " + junk.getIncome());
        System.out.println("Profitul pentru Vegan este: " + plante.getIncome());
        System.out.println("Taxele pentru Fast Food sunt: " + junk.calculateTax());
        System.out.println("Taxele pentru Vegan sunt: " + plante.calculateTax());
    }
}
