package com.serbanescu.tema3.restaurant;

public abstract class Restaurant {

    protected double menuPrice=10;
    protected int guestNumber=0;
    private int taxRate = 20;

    public double getIncome() {
        return menuPrice * guestNumber;
    }

    public double calculateTax() {
       double tax=(getIncome()/100)*taxRate;
       return tax*(100-getTaxDiscount())/100;
    }

    public abstract double getTaxDiscount();

    public void moreHungryPeople(int n){
        guestNumber+=n;
    }

}
