package com.example.strategypattern.practice1;

public class Character {

    private Weapon weapon;

    public void weapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public String attack() {
        return weapon.attack();
    }
}
