package com.serbanescu.tema3.game;

import java.awt.geom.Point2D;

public class Potion {

    private PotionType type;

    public Potion(PotionType type, Point2D potionPos) {
        this.type = type;
        this.potionPos = potionPos;
    }

    public Point2D getPotionPos() {
        return potionPos;
    }

    private Point2D potionPos;

    public PotionType getType() {
        return type;
    }
}
