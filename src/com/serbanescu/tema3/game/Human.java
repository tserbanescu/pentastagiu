package com.serbanescu.tema3.game;

import java.awt.geom.Point2D;

public class Human extends Character {

    public Human(int hp, int mana, Point2D pos) {
        super(hp, mana, pos);
    }

    @Override
    public void attackCharacter(Character target) {
        Point2D targetPos = target.getPosition();
        if (this.isProximity(targetPos)) {
            if (this.getMana() >= 5) {
                if (target.getHp() >= 0) {
                    target.setHp(target.getHp() - 10 < 0 ? 0 : target.getHp() - 10);
                    this.setMana(this.getMana() - 5);
                    System.out.println("Human has " + this.hp + " hp and " + this.mana + " mana.");
                    System.out.println("Target has " + target.hp + " hp and " + target.mana + " mana.");
                    if (target.getHp() == 0) {
                        System.out.println("Target dead!");
                    }
                } else {
                    System.out.println("Character already dead!");
                }
            } else {
                System.out.println("Find potion!");
            }
        } else {
            System.out.println("Not in range!");
        }
    }

    public void consumePotion(PotionType p) {
        switch (p) {
            case MANA: {
                this.mana += p.getAmount();
                System.out.println("Mana is now: " + mana);
                break;
            }
            case HEALTH: {
                this.hp += p.getAmount();
                System.out.println("Hp is now: " + hp);
                break;
            }
        }

    }

}
