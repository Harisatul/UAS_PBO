package com.harisatul.character.enemy;

public class Enemy {

    private String name;
    private String colour;
    private int health;
    private String defence;


    public Enemy(String name, String colour,
                 int health , String defence) {
        this.name = name;
        this.colour = colour;
        this.health = health;
        this.defence = defence;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getHealth() {
        return health;
    }

    public String getDefence() {
        return defence;
    }

    public void setDefence(String defence) {
        this.defence = defence;
    }
}
