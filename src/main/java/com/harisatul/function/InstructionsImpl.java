package com.harisatul.function;

import com.harisatul.character.Hero.Hero;
import com.harisatul.character.enemy.Enemy;

public class InstructionsImpl implements Instructions{

    public InstructionsImpl() {
    }


    @Override
    public int hit(Hero hero, Enemy pig) {
        int healthremains = pig.getHealth() - hero.getAttackPower();
        return healthremains;
    }

    @Override
    public int hitBox(Hero hero, int boxDefence) {
        int remains = boxDefence - hero.getAttackPower();
        return remains;
    }
}
