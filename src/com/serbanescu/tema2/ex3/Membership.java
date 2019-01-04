package com.serbanescu.tema2.ex3;

public enum Membership {
    GOLD(20), SILVER(10), BASIC(0);

    private int discount;

    Membership(int discount) {
        this.discount = discount;
    }

    public int getDiscount() {
        return discount;
    }
}
