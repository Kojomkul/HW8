package com.company.players;

import java.util.Random;

public class Warrior extends Hero {


    private int criticalStrike;


    public Warrior(int health, int damage) {
        super(health, damage, Ability.CRITICAL_DAMAGE);
    }

    @Override
    public void useAbility(Hero[] heroes, Boss boss) {
            if (heroes[0].getHealth() > 0) {
                setCriticalStrike();
                boss.setHealth(boss.getHealth() - getCriticalStrike());
                System.out.println("Warrior give criticalStrike "
                        + getCriticalStrike());
            }
        }

    public int getCriticalStrike() {
        return criticalStrike;
    }

    public void setCriticalStrike() {
        this.criticalStrike = new Random().nextInt(10) * 2;
    }
}
