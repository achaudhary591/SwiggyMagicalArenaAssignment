package dev.akshya.magic.model;

public interface IPlayer {

    int attackAttribute();

    int healthAttribute();

    int strengthAttribute();

    int rollDice();

    String name();

    boolean isAlive();

    void takeDamage(int damage);
}
