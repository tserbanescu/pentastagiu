package com.serbanescu.tema2.ex3;

import java.util.ArrayList;
import java.util.List;

public class Basket {

    private double totalPrice = 0;
    private List<Product> products;

    public Basket() {
        products = new ArrayList<>();
    }

    public void addToBasket(Product p, int quantity) {
        products.add(p);
        totalPrice += p.getPrice() * quantity;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public double applyDiscount(Membership m) {
        double discount = 100-m.getDiscount();
        double discountPrice=(discount*totalPrice)/100;
        return discountPrice;
    }

}