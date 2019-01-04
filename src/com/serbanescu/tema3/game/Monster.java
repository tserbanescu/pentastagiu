package com.serbanescu.tema3.game;

import java.awt.geom.Point2D;

public class Monster extends Character {

    public Monster(int hp, int mana, Point2D pos) {
        super(hp, mana, pos);
    }

    @Override
    public void attackCharacter(Character target) {
        Point2D targetPos = target.getPosition();
        if (this.isProximity(targetPos)) {
            if (this.getMana() >= 3) {
                if (target.getHp() >= 0) {
                    target.setHp(target.getHp() - 15 < 0 ? 0 : target.getHp() - 15);
                    this.setMana(this.getMana() - 3);
                    System.out.println("Monster has " + this.hp + " hp and " + this.mana + " mana.");
                    System.out.println("Target has " + target.hp + " hp and " + target.mana + " mana.");
                    if (target.getHp() == 0) {
                        System.out.println("Target dead!");
                    }
                } else {
                    System.out.println("Character already dead!");
                }
            } else {
                System.out.println("Go sleep!");
            }
        } else {
            System.out.println("Not in range!");
        }
    }
}
