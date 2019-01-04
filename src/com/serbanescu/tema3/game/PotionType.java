package com.serbanescu.tema3.game;

public enum PotionType {
    HEALTH(20), MANA(10);

    public int getAmount() {
        return amount;
    }

    private int amount;

    PotionType(int amount) {
        this.amount = amount;
    }
}
