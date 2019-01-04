package com.serbanescu.tema2.ex3;

public abstract class Product {
    public Product() {
    }

    protected int id;
    protected String name;
    protected double price;

    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public Product(int productId, String productName, double productPrice){
        id=productId;
        name=productName;
        price=productPrice;
    }
}
