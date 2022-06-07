package com.harisatul.world;


import com.harisatul.character.Hero.Hero;
import com.harisatul.character.enemy.Enemy;

import java.util.List;

public abstract class World {

    private String name;
    private int defence;

    public World(String name, int defence) {
        this.name = name;
        this.defence = defence;
    }

    public String getName() {
        return name;
    }

    public int getDefence() {
        return defence;
    }

    abstract void worldLogic ();
    abstract List<Hero> heroChar ();
    abstract List<Enemy> enemiesFunction () ;
}
