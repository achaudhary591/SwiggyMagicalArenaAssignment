package dev.akshya.magic.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @Test
    void testAttack() {
        IPlayer player = new Player("TestPlayer", 50, 5, 10);
        int attackValue = player.attack();
        assertTrue(attackValue >= 10 && attackValue <= 60);
    }

    @Test
    void testSuccessfulDefend() {
        IPlayer player = new Player("TestPlayer", 100, 5, 10);
        player.defend(50);
        assert(player.isAlive());
    }

    @Test
    void testIsAlive() {
        IPlayer player = new Player("TestPlayer", 0, 5, 10);
        assertFalse(player.isAlive());

        player = new Player("TestPlayer", 50, 5, 10);
        assertTrue(player.isAlive());
    }

    @Test
    void testHealthReductionToZero() {
        IPlayer player = new Player("TestPlayer", 30, 5, 10);
        player.defend(100);
        assertFalse(player.isAlive());
    }
}
