package com.serbanescu.tema3.game;

import java.awt.geom.Point2D;

public abstract class Character {
    protected int hp;
    protected int mana;
    protected Point2D position;

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public Point2D getPosition() {
        return position;
    }

    public Character(int hp, int mana, Point2D pos) {
        this.hp = hp;
        this.mana = mana;
        this.position = pos;
    }

    public void setPosition(Point2D position) {
        this.position = position;
    }

    public abstract void attackCharacter(Character c);


    public boolean isProximity(Point2D p) {
        if (Math.abs(this.position.getX() - p.getX()) <= 5 && Math.abs(this.position.getY() - p.getY()) <= 5) {
            return true;
        }
        return false;
    }
}
