package dev.akshya.magic.model;

public interface IPlayer {

    int attackAttribute();

    int healthAttribute();

    int strengthAttribute();

    String name();

    boolean isAlive();

    void defend(int damage);

    int attack();
}
