package com.serbanescu.tema3.game;

import java.awt.geom.Point2D;

public class Animal extends Character {

    public Animal(int hp, int mana, Point2D pos) {
        super(hp, mana, pos);
    }

    @Override
    public void attackCharacter(Character c) {
        System.out.println("Animal can't attack!");
    }
}
