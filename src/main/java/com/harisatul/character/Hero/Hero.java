package com.harisatul.character.Hero;

public class Hero {

    private String name;
    private String color;
    private int attackPower;
    private int speed;

    public Hero(String name, String color, int attackPower, int speed) {
        this.name = name;
        this.color = color;
        this.attackPower = attackPower;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
