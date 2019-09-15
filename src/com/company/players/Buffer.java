package com.company.players;

import java.util.Random;

public class Buffer extends Hero {

    public int getDamageIncrease() {
        return damageIncrease;
    }

    public void setDamageIncrease () {
        this.damageIncrease = new Random().nextInt(2) + 5;
    }

    private int damageIncrease;


    public Buffer(int health, int damage) {
        super(health, damage, Ability.BOOST);
    }

    @Override
    public void useAbility(Hero[] heroes, Boss boss) {
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0) {
                setDamageIncrease();
                heroes[i].setDamage(heroes[i].getDamage() + getDamageIncrease());
                System.out.println("Buffer increased damage "
                        + heroes[i].getClass().getSimpleName() + " "
                        + getDamageIncrease());
            }
        }
    }
}
