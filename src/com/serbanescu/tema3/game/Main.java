package com.serbanescu.tema3.game;

import java.awt.geom.Point2D;

public class Main {

    public static void main(String[] args){

        //Create a Human, a Monster and an Animal, each one with a position on the map decided by you and 50 health points and 20 energy points
        Character human=new Human(50,20,new Point2D.Double(2,3));
        Character monster=new Monster(50,20,new Point2D.Double(6,2));
        Character animal = new Animal(50,20,new Point2D.Double(1,2));
        Potion manaPotion=new Potion(PotionType.MANA,new Point2D.Double(5,5));
        Potion hpPotion =new Potion(PotionType.HEALTH,new Point2D.Double(1,1));
        Potion healthPotion =new Potion(PotionType.HEALTH,new Point2D.Double(10,10));

        //Make the human attack the animal
        human.attackCharacter(animal);

        //Make the monster attack the human
        monster.attackCharacter(human);

        //Make the human attack the monster
        human.attackCharacter(monster);

        //Make the human use an energy artifact that you create
        ((Human) human).consumePotion(hpPotion.getType());//cast la clasa human pentru ca variabila este de tip character care nu are functia consume

    }
}
