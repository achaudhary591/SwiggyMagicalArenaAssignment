package dev.akshya.magic.model;

import java.util.Random;

import static dev.akshya.magic.util.Constants.DICE_FACES;

public class Player implements IPlayer {

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
    public String name() {
        return name;
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }

    @Override
    public void defend(int damage) {
        int defendMultiplier = this.rollDice();
        int totalDamageTaken = Math.max(damage - (defendMultiplier * strength), 0);
        this.health = this.health - totalDamageTaken;
        System.out.printf("Taken damage: %d, remaining health of %s: %d\n", damage, this.name, Math.max(this.health, 0));
    }

    @Override
    public int attack() {
        return this.rollDice() * attack;
    }

    private int rollDice() {
        return new Random().nextInt(DICE_FACES)+1;
    }

}
