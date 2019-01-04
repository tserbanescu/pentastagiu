package com.serbanescu.tema2.ex3;

public class Main {

    public static void main(String[] args) {

        Customer cascau = new Customer(1, "Cascau", Membership.GOLD);
        Customer eu = new Customer(2, "Teo", Membership.SILVER);

        Product oop = new Book(1, "OOP", 20, "Pantaziu Cristian");
        Product carie = new Candy(1, "Magiun", 2, 5.0);

        Basket cart = new Basket();
        //add 3 books(nu mai fac atatea Syso)
        cart.addToBasket(oop, 3);
        //add 20 grams of candy
        cart.addToBasket(carie, 4);
        double fullPrice = cart.getTotalPrice();
        double cascauPrice = cart.applyDiscount(cascau.getStatus());
        double euPrice = cart.applyDiscount(eu.getStatus());
        System.out.println("Pretul intreg e: " + fullPrice + "\nDiscountul pentru " + cascau.getName() + " este " + cascauPrice +
                "\nDiscountul pentru " + eu.getName() + " este " + euPrice);

    }
}
