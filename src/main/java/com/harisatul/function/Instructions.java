package com.harisatul.function;

import com.harisatul.character.Hero.Hero;
import com.harisatul.character.enemy.Enemy;


public interface Instructions {

    int hit(Hero hero, Enemy pig);

    int hitBox(Hero hero, int BoxDefence);

}
