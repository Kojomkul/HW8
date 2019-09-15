package com.company.players;

public class Tank extends Hero {

    private int returnDamage;

    public int getReturnDamage() {
        return returnDamage;
    }

    public void setReturnDamage() { this.returnDamage = 5; }

    public Tank(int health, int damage) {
        super(health, damage, Ability.SAVE_DAMAGE_AND_REVERT);
    }

    @Override
    public void useAbility(Hero[] heroes, Boss boss) {
        if (heroes[3].getHealth() > 0) {
            setReturnDamage();
            boss.setHealth(boss.getHealth() - getReturnDamage());
            System.out.println("Tank return damage "
                    + getReturnDamage());
        }
    }
}
