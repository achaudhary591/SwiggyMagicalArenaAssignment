package dev.akshya.magic.model;

import java.util.Random;

import static dev.akshya.magic.util.Constants.DICE_FACES;

public class Player implements IPlayer{

    private int health;
    private int strength;
    private int attack;
    private String name;

    public Player(String name, int health, int strength, int attack) {
        this.health = health;
        this.strength = strength;
        this.attack = attack;
        this.name = name;
    }

    @Override
    public int attackAttribute() {
        return attack;
    }

    @Override
    public int healthAttribute() {
        return health;
    }

    @Override
    public int strengthAttribute() {
        return strength;
    }

    @Override
    public int rollDice() {
        return new Random().nextInt(DICE_FACES)+1;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }

    @Override
    public void takeDamage(int damage) {
        this.health = this.health - damage;
        System.out.printf("Taken damage: %d, remaining health: %d\n", damage, this.health);
    }
}
